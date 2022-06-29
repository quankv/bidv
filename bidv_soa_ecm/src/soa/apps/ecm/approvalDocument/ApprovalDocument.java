package soa.apps.ecm.approvalDocument;

import java.io.StringReader;
import java.io.StringWriter;
import java.text.MessageFormat;
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

import soa.common.ClientType;
import soa.common.CommonType;
import soa.common.HeaderType;
import soa.common.InfoConfigSOA;

public class ApprovalDocument {

	public static void main(String[] args) {
		InfoConfigSOA infoConfig = new InfoConfigSOA();
		infoConfig.setUrlConnect("tcp://10.53.120.15:7222");
		infoConfig.setUserConnect("admin");
		infoConfig.setPassConnect("123456");
		infoConfig.setAppCode("BPM");
		infoConfig.setDeviceId("CHANNEL");
		infoConfig.setBusinessDomain("BIDV.COM.VN");
		infoConfig.setServiceVersion("1.0");
		infoConfig.setQueueName("vn.apps.ecmapi.1.0");
		infoConfig.setSoapActionInWSDL("/Services/Global/Vn/Apps/ECM/OperationImpl/ECMService.serviceagent//ApproveDocument");
		BodyReqApproveDocumentType body = new BodyReqApproveDocumentType();
		body.setCustomerType("2");
		body.setTransactionId("43243");
		int errcode = soa.common.soaReqestReply.InitSOAConnection(infoConfig.getUrlConnect(), infoConfig.getUserConnect(), infoConfig.getPassConnect());
		if (errcode != 0) {
			System.out.println("Error connect JMS");
			return;
		}

		ApprovalDocument cus = new ApprovalDocument();
		try {
			String appCode = infoConfig.getAppCode();
			String deviceId = infoConfig.getDeviceId();
			String requestId = genReqId(appCode, deviceId);
			cus.get(requestId, appCode, infoConfig.getBusinessDomain(), infoConfig.getServiceVersion(), body, infoConfig.getQueueName(), infoConfig.getSoapActionInWSDL());
		} catch (Exception e) {
			e.printStackTrace();
		}
		soa.common.soaReqestReply.CloseSOAConnection();

	}
	public static String callApproveDocument(String jsonConfig, String jsonBody) {
		String response = "";
		if(jsonConfig != null && !"".equals(jsonConfig) && jsonBody != null && !"".equals(jsonBody) ) {
			InfoConfigSOA infoConfig = new InfoConfigSOA();
			Gson g = new Gson(); 
			infoConfig = g.fromJson(jsonConfig, InfoConfigSOA.class);
			int errcode = soa.common.soaReqestReply.InitSOAConnection(infoConfig.getUrlConnect(), infoConfig.getUserConnect(), infoConfig.getPassConnect());
			if (errcode != 0) {
				System.out.println("Error connect JMS");
				return "Error connect JMS";
			}

			ApprovalDocument cus = new ApprovalDocument();
			try {
				String appCode = infoConfig.getAppCode();
				String deviceId = infoConfig.getDeviceId();
				String requestId = genReqId(appCode, deviceId);
				BodyReqApproveDocumentType body = new BodyReqApproveDocumentType();
				body = g.fromJson(jsonBody, BodyReqApproveDocumentType.class);
				response = cus.get(requestId, appCode, infoConfig.getBusinessDomain(), infoConfig.getServiceVersion(), body, infoConfig.getQueueName(), infoConfig.getSoapActionInWSDL());
			} catch (Exception e) {
				e.printStackTrace();
				response = e.getMessage();
			}
			soa.common.soaReqestReply.CloseSOAConnection();
		}
		return response;
	}
	private static String genReqId(String appcode, String deviceId) {
		return MessageFormat.format("{0}-{1}-{2}", appcode, deviceId, String.valueOf(System.currentTimeMillis()));

	}

	public String get(String messID, String soaappcode, String domain, String version, BodyReqApproveDocumentType body, String queueName, String soapAction) {
		String response = "";
		ApproveDocumentReqType obj = new ApproveDocumentReqType();
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
			response = e.getMessage();
			e.printStackTrace();
		}
		client.setSourceAppID(soaappcode);
		header.setCommon(common);
		header.setClient(client);
		obj.setHeader(header); 
		obj.setBodyReqApproveDocument(body);

		soa.common.SOARequestObject genSOAMsgObj = soa.common.soaReqestReply.GenerateSOAMessage(ApproveDocumentReqType.class,
				obj);

		System.out.println(genSOAMsgObj.getRequestmsg());

		int timeOut = 100000; // minisecond
		//String queueName = "vn.cardgw.1.0";
		String soapActionInWSDL = soapAction;//"/Services/Global/Vn/Apps/CARDGW/OperationImpl/CardGW-service.serviceagent//CardDetail";
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
			str = str.replace("xmlns:ns0=\"http://www.bidv.com/entity/vn/apps/cardgw/carddetail/1.0\"", "");
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

}
