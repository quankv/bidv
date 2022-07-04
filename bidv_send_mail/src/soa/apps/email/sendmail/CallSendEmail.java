package soa.apps.email.sendmail;

import java.io.StringReader;
import java.io.StringWriter;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.json.JSONException;
import org.json.XML;

import com.google.gson.Gson;

import soa.apps.email.sendmail.BodyReqSendEmailType.Attachments;
public class CallSendEmail {

	
	public static String sendMail(String jsonConfig, String jsonBody) {
		String response = "";
		if(jsonConfig != null && !"".equals(jsonConfig) && jsonBody != null && !"".equals(jsonBody) ) {
			InfoConfig infoConfig = new InfoConfig();
			Gson g = new Gson(); 
			infoConfig = g.fromJson(jsonConfig, InfoConfig.class);
			int errcode = soa.common.soaReqestReply.InitSOAConnection(infoConfig.getUrlConnect(), infoConfig.getUserConnect(), infoConfig.getPassConnect());
			if (errcode != 0) {
				System.out.println("Error connect JMS");
				return "Error connect JMS";
			}

			CallSendEmail cus = new CallSendEmail();
			try {
				String appCode = infoConfig.getAppCode();
				String deviceId = infoConfig.getDeviceId();
				String requestId = genReqId(appCode, deviceId);
				BodyReqSendEmailType body = new BodyReqSendEmailType();
				body = g.fromJson(jsonBody, BodyReqSendEmailType.class);
				response = cus.get(requestId, appCode, infoConfig.getBusinessDomain(), infoConfig.getServiceVersion(), body);
			} catch (Exception e) {
				e.printStackTrace();
			}
			soa.common.soaReqestReply.CloseSOAConnection();
		}
		return response;
	}
	private static String genReqId(String appcode, String deviceId) {
		return MessageFormat.format("{0}-{1}-{2}", appcode, deviceId, String.valueOf(System.currentTimeMillis()));

	}

	private String get(String messID, String soaappcode, String domain, String version, BodyReqSendEmailType body) {
		String response = "";
		EMAILSendEmailReqType obj = new EMAILSendEmailReqType();
		HeaderType header = new HeaderType();
		CommonType common = new CommonType();
		ClientType client = new ClientType();
		common.setBusinessDomain(domain);
		common.setServiceVersion(version);
		common.setMessageId(String.valueOf(System.currentTimeMillis()));
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(Calendar.getInstance().getTime());
		XMLGregorianCalendar calendar;
		try {
			calendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
			common.setMessageTimestamp(calendar);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		client.setSourceAppID(soaappcode);
		header.setCommon(common);
		header.setClient(client);
		obj.setHeader(header);
		
		
		obj.setBodyReqSendEmail(body);

		soa.common.SOARequestObject genSOAMsgObj = soa.common.soaReqestReply.GenerateSOAMessage(EMAILSendEmailReqType.class,
				obj);

		System.out.println(genSOAMsgObj.getRequestmsg());

		int timeOut = 100000; // minisecond
		String queueName = "vn.email.1.0";
		String soapActionInWSDL = "/Services/Global/Vn/Apps/EMAIL/OperationImpl/EMAIL-service.serviceagent/PortTypeEndpoint1/SendEmail";
		soa.common.SOAResponeObject outputObj = soa.common.soaReqestReply.ProcessSOAService(queueName, soapActionInWSDL,
				genSOAMsgObj.getRequestmsg(), timeOut); 
		try {
			String xml = printXml(outputObj.getResponsemsg());
			response = XML.toJSONObject(xml).toString();
			System.out.println("jsonResp\n"+ response);
		} catch (JSONException e) {
			response = e.getMessage();
			e.printStackTrace();
		}
		if (outputObj.getErrcode() == 0) {
			System.out.println("\n\n\nResponse:\n" + printXml(outputObj.getResponsemsg()));
		} else {
			System.out.println("\n\n\nResponse with ErrCode # 0:\n" + printXml(outputObj.getResponsemsg()));
		}
		return response;
	}

	private String printXml(String str) {
		try {
			str = str.replaceAll("ns0:", "").replaceAll("ns1:", "").replaceAll("ns2:", "");
			str = str.replace("xmlns:ns0=\"http://www.bidv.com/entity/vn/apps/email/sendemail/1.0\"", "");
			str = str.replace("xmlns:ns1=\"http://www.bidv.com/common/envelope/commonheader/1.0\"", "");
			str = str.replace("xmlns:ns2=\"http://www.bidv.com/common/envelope/commonheader/1.0\"", "");
			Source xmlInput = new StreamSource(new StringReader(str));
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
			StreamResult result = new StreamResult(new StringWriter());
			transformer.transform(xmlInput, result);
			return result.getWriter().toString();
		} catch (TransformerException e) {
			e.printStackTrace();
			return "ERROR PRINT XML:" + str;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InfoConfig infoConfig = new InfoConfig();
		infoConfig.setUrlConnect("tcp://10.53.120.15:7222");
		infoConfig.setUserConnect("admin");
		infoConfig.setPassConnect("123456");
		infoConfig.setAppCode("BPM");
		infoConfig.setDeviceId("CHANNEL");
		infoConfig.setBusinessDomain("BIDV.COM.VN");
		infoConfig.setServiceVersion("1.0");
//		int errcode = soa.common.soaReqestReply.InitSOAConnection("tcp://119.17.209.146:7222", "admin", "123456");
		int errcode = soa.common.soaReqestReply.InitSOAConnection("tcp://10.53.120.15:7222", "admin", "123456");
		if (errcode != 0) {
			System.out.println("Error connect JMS");
			return;
		}
		BodyReqSendEmailType body = new BodyReqSendEmailType();
		body.setAccessToken("");
		body.setAppCode("BPM");
		body.setCheckSum("");
		body.setRequestID("234324323333esde");
		body.setMailBody("Hello");
		body.setMailFrom("guimailud1@ldapudtest.com");
		body.setMailFromName("Quan ly");
		body.setMailSubject("Test");
		ArrayList<String> listTo = new ArrayList<String>();
		body.setServiceID("1");
		listTo.add("guimaiud2@ldapudtest.com");
		body.getToList().addAll(listTo);
		
//		Attachments attachmentsType = new Attachments();
//		attachmentsType.setContentID("");
//		attachmentsType.setFilePath("");
		
		body.getAttachments().addAll(new ArrayList<Attachments>());
		CallSendEmail cus = new CallSendEmail();
		try {
			String appCode = "BPM";
			String deviceId = "CHANNEL";
			String requestId = genReqId(appCode, deviceId);
			cus.get(requestId, appCode, infoConfig.getBusinessDomain(), infoConfig.getServiceVersion(), body);
		} catch (Exception e) {
			e.printStackTrace();
		}
		soa.common.soaReqestReply.CloseSOAConnection();

	}
}
