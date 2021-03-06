package bidv.soa.sibs.remittance.GLCashwithdraw.test;

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

import bidv.soa.common.serviceEnvelope.InfoConfigSOA;
import bidv.soa.common.serviceEnvelope.SOARequestObject;
import bidv.soa.common.serviceEnvelope.SOAResponeObject;
import bidv.soa.common.serviceEnvelope.soaReqestReply;


public class GLCashWithdraw {
	public static void main(String[] args) {
		InfoConfigSOA infoConfig = new InfoConfigSOA();
		infoConfig.setUrlConnect("tcp://10.53.120.15:7222");// fix cung
		infoConfig.setUserConnect("admin");// fix cung
		infoConfig.setPassConnect("123456");// fix cung
		infoConfig.setAppCode("BPM");// fix cung
		infoConfig.setDeviceId("CHANNEL");// k quan trong
		infoConfig.setBusinessDomain("BIDV.COM.VN");// fix cung
		infoConfig.setServiceVersion("1.0");// fix cung
		infoConfig.setQueueName("vn.glcashwithdraw.1.0");// trong file wsdl
		infoConfig.setSoapActionInWSDL(
				"/Services/Global/Vn/Remittance/GLCashWithdraw/OperationImpl/GLCashWithdraw.serviceagent/PortTypeEndpoint1/Create");// trong
																												// file
																												// wsdl
		BodyReqCreateType body = new BodyReqCreateType();
		body.setMsgCode("295");
		BaseXferType baseXferType = new BaseXferType();
		baseXferType.setSeq("1329043");
		baseXferType.setSvrBranch("120");//Chi nhánh thực hiện giao dịch
		baseXferType.setTellerId("990BPM");
		body.setBaseXfer(baseXferType);
		
		SenderInfoType sendInfo = new SenderInfoType();
		sendInfo.setCashAmount("10000000");//Số tiền mặt chuyển vào tài khoản GL (Phải là số chẵn vì là tiền mặt)
		sendInfo.setCurCode("VND");//Tiền tệ nộp vào tài khoản GL
		sendInfo.setNoteSellRate("1");//Tỉ giá của tiền nộp vào tài khoản GL
		sendInfo.setTTBuyRate("1");//Tỉ giá quy đổi ngoại tệ còn thiếu ra tiền VND, áp dụng cho nộp ngoại tệ
		sendInfo.setVNDAmount("0");//Số tiền VND còn phải nộp thêm, áp dụng cho trường hợp nộp ngoại tệ
		body.setSenderInfo(sendInfo);
		
		
		ReceiverInfoType receiveInfo = new ReceiverInfoType();
		receiveInfo.setCurCode("VND");//Loại tiền tệ của tài khoản GL
		receiveInfo.setDRAmount("10000000");//Số tiền cần chuyển vào tài khoản GL (Có thể là số lẻ)
		receiveInfo.setGLAcctNo("280701003");//Số Tài khoản GL nhận tiền
		receiveInfo.setTTBuyRate("1");//Tỉ giá tiền tệ so với VND (Tiền tệ của tài khoản GL)
		body.setReceiverInfo(receiveInfo);
		
		body.setRemark("test");
		
		
		int errcode = soaReqestReply.InitSOAConnection(infoConfig.getUrlConnect(), infoConfig.getUserConnect(),
				infoConfig.getPassConnect());
		if (errcode != 0) {
			System.out.println("Error connect JMS");
			return;
		}

		GLCashWithdraw cus = new GLCashWithdraw();
		try {
			String appCode = infoConfig.getAppCode();
			String deviceId = infoConfig.getDeviceId();
			String requestId = genReqId(appCode, deviceId);
			cus.get(requestId, appCode, infoConfig.getBusinessDomain(), infoConfig.getServiceVersion(), body,
					infoConfig.getQueueName(), infoConfig.getSoapActionInWSDL());
		} catch (Exception e) {
			e.printStackTrace();
		}
		soaReqestReply.CloseSOAConnection();

	}

	public static String transfer(String jsonConfig, String jsonBody) throws Exception{
		String response = "";
		if (jsonConfig != null && !"".equals(jsonConfig) && jsonBody != null && !"".equals(jsonBody)) {
			InfoConfigSOA infoConfig = new InfoConfigSOA();
			Gson g = new Gson();
			infoConfig = g.fromJson(jsonConfig, InfoConfigSOA.class);
			int errcode = soaReqestReply.InitSOAConnection(infoConfig.getUrlConnect(), infoConfig.getUserConnect(),
					infoConfig.getPassConnect());
			if (errcode != 0) {
				System.out.println("Error connect JMS");
				return "Error connect JMS";
			}
			GLCashWithdraw cus = new GLCashWithdraw();

			String appCode = infoConfig.getAppCode();
			String deviceId = infoConfig.getDeviceId();
			String requestId = genReqId(appCode, deviceId);
			BodyReqCreateType body = new BodyReqCreateType();
			body = g.fromJson(jsonBody, BodyReqCreateType.class);
			response = cus.get(requestId, appCode, infoConfig.getBusinessDomain(), infoConfig.getServiceVersion(), body,
					infoConfig.getQueueName(), infoConfig.getSoapActionInWSDL());

			soaReqestReply.CloseSOAConnection();
		}
		return response;
	}

	private static String genReqId(String appcode, String deviceId) {
		return MessageFormat.format("{0}-{1}-{2}", appcode, deviceId, String.valueOf(System.currentTimeMillis()));

	}

	public String get(String messID, String soaappcode, String domain, String version, BodyReqCreateType body,
			String queueName, String soapActionInWSDL) {
		String response = "";
		GLCashWithdrawReqType obj = new GLCashWithdrawReqType();
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
		obj.setBodyReqCreate(body);

		SOARequestObject genSOAMsgObj = soaReqestReply.GenerateSOAMessage(GLCashWithdrawReqType.class, obj);

		System.out.println(genSOAMsgObj.getRequestmsg());

		int timeOut = 100000; // minisecond
		SOAResponeObject outputObj = soaReqestReply.ProcessSOAService(queueName, soapActionInWSDL,
				genSOAMsgObj.getRequestmsg(), timeOut);
		try {
			System.out.println("outputObj.getResponsemsg():  "+outputObj.getResponsemsg());
			String xml = printXml(outputObj.getResponsemsg());
			response = XML.toJSONObject(xml).toString();
			System.out.println("jsonResp\n" + response);
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
//			str = str.replaceAll("ns0:", "").replaceAll("ns1:", "").replaceAll("ns2:", "");
//			str = str.replace("xmlns:ns0=\"http://www.bidv.com/entity/vn/apps/cardgw/carddetail/1.0\"", "");
//			str = str.replace("xmlns:ns1=\"http://www.bidv.com/common/envelope/commonheader/1.0\"", "");
//			str = str.replace("xmlns:ns2=\"http://www.bidv.com/common/envelope/commonheader/1.0\"", "");
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
