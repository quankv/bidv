package soa.apps.ecm.digitizationservice;

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

import soa.apps.ecm.digitizationservice.BodyReqEcmDigitizationServiceType.CaptType;
import soa.apps.ecm.digitizationservice.BodyReqEcmDigitizationServiceType.CardType;
import soa.apps.ecm.digitizationservice.BodyReqEcmDigitizationServiceType.CustomerType;
import soa.apps.ecm.digitizationservice.BodyReqEcmDigitizationServiceType.ServiceType;
import soa.common.ClientType;
import soa.common.CommonType;
import soa.common.HeaderType;
import soa.common.InfoConfigSOA;

public class CallECMDigitizationService {

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
		infoConfig.setSoapActionInWSDL("http://www.bidv.com/global/vn/apps/ecm/ecmDigitization");
		BodyReqEcmDigitizationServiceType body = new BodyReqEcmDigitizationServiceType();
		body.setAccessToken("");
		body.setAppCode("BPM");
		body.setChecksum("");
		body.setRequestID("");
		body.setBranchCreated("129");
		body.setRelatedBranch("");
		body.setTransactionId("35345");
		body.setDocumentTypeId("010101");
		body.setCreateBySystem("");
		body.setEcmDateCreated("");
		body.setEcmUserCreated("1214");
		body.setApprover("");
		body.setDateApprove("");
		body.setFileInput("{3047AD81-0000-CE1D-9DEA-2A563EB54F5E}");
		body.setEType("ecmCustomerSME");

		CustomerType cusType = new CustomerType();
		cusType.setCifNumber("12345");
		cusType.setBdsCreated("129");
		cusType.setAuthorizationLimit("");
		cusType.setAuthorizedPerson("");
		cusType.setDocDate("");
		cusType.setDocEffectiveDate("");
		cusType.setDocNumber("");
		cusType.setDocValidityPeriod("");
		cusType.setDocumentStatus("");
		cusType.setExpireDate("");
		cusType.setExpiryDate("");
		cusType.setScopeOfAuthorized("");
		cusType.setSignerName("");

		ServiceType serType = new ServiceType();
		serType.setCifNumber("");
		serType.setBdsCreated("");
		serType.setDocEffectiveDate("");
		serType.setDocValidityPeriod("");
		serType.setDocumentStatus("");
		serType.setExpiryDate("");
		//
		CardType cardType = new CardType();
		cardType.setCifNumber("");
		cardType.setBdsCreated("");
		cardType.setCardNumber("");
		cardType.setCardType("");
		cardType.setProductNumber("");
		cardType.setPrimaryCard("");
		cardType.setSecondaryCard("");
		cardType.setStaffNumber("");
		cardType.setPosUnitNumber("");
		cardType.setExpiryDate("");
		//
		CaptType captType = new CaptType();
		captType.setCifNumber("");
		captType.setBdsCreated("");
		captType.setTradeDate("");
		captType.setValueDate("");
		captType.setTypeOfDeal("");
		captType.setTypeOfInstr("");
		captType.setFoDealId("");
		captType.setPaymentID("");
		captType.setAccountingID("");
		captType.setCurrency("");
		captType.setEndDate("");
		captType.setActionDate("");
		captType.setAmount("");
		captType.setTransferID("");
		//

		body.setCustomerType(cusType);
		body.setServiceType(serType);
		body.setCardType(cardType);
		body.setCaptType(captType);
//		int errcode = soa.common.soaReqestReply.InitSOAConnection("tcp://119.17.209.146:7222", "admin", "123456");
		int errcode = soa.common.soaReqestReply.InitSOAConnection(infoConfig.getUrlConnect(), infoConfig.getUserConnect(), infoConfig.getPassConnect());
		if (errcode != 0) {
			System.out.println("Error connect JMS");
			return;
		}

		CallECMDigitizationService cus = new CallECMDigitizationService();
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
	public static String CallECMDigitization(String jsonConfig, String jsonBody) throws Exception{
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

			CallECMDigitizationService cus = new CallECMDigitizationService();
			
				String appCode = infoConfig.getAppCode();
				String deviceId = infoConfig.getDeviceId();
				String requestId = genReqId(appCode, deviceId);
				BodyReqEcmDigitizationServiceType body = new BodyReqEcmDigitizationServiceType();
				body = g.fromJson(jsonBody, BodyReqEcmDigitizationServiceType.class);
				response = cus.get(requestId, appCode, infoConfig.getBusinessDomain(), infoConfig.getServiceVersion(), body, infoConfig.getQueueName(), infoConfig.getSoapActionInWSDL());
			
			soa.common.soaReqestReply.CloseSOAConnection();
		}
		return response;
	}
	private static String genReqId(String appcode, String deviceId) {
		return MessageFormat.format("{0}-{1}-{2}", appcode, deviceId, String.valueOf(System.currentTimeMillis()));

	}

	public String get(String messID, String soaappcode, String domain, String version, BodyReqEcmDigitizationServiceType body, String queueName, String soapAction) {
		String response = "";
		EcmDigitizationServiceReqType obj = new EcmDigitizationServiceReqType();
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
		obj.setBodyReqEcmDigitizationService(body);

		soa.common.SOARequestObject genSOAMsgObj = soa.common.soaReqestReply.GenerateSOAMessage(EcmDigitizationServiceReqType.class,
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
			str = str.replace("xmlns:ns0=\"http://www.bidv.com/global/vn/apps/ecm/ecmdigitizationservice/1.0\"", "");
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
