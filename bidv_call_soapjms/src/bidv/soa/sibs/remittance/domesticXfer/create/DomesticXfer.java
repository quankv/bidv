package bidv.soa.sibs.remittance.domesticxfer.create;

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
 


public class DomesticXfer {
	public static void main(String[] args) {
		InfoConfigSOA infoConfig = new InfoConfigSOA();
		infoConfig.setUrlConnect("tcp://10.53.120.15:7222");// fix cung
		infoConfig.setUserConnect("admin");// fix cung
		infoConfig.setPassConnect("123456");// fix cung
		infoConfig.setAppCode("BPM");// fix cung
		infoConfig.setDeviceId("CHANNEL");// k quan trong
		infoConfig.setBusinessDomain("BIDV.COM.VN");// fix cung
		infoConfig.setServiceVersion("1.1");// fix cung
		infoConfig.setQueueName("vn.domesticxfer.1.0");// trong file wsdl
		infoConfig.setSoapActionInWSDL("global/vn/remittance/domesticxfer/1.0");// trong
																												// file
																												// wsdl
		BodyReqCreateType body = new BodyReqCreateType();
		
		body.setRefNo("280701003");
		body.setMsgCode("219");//theo bang cau hinh
		BaseXferType baseXferType = new BaseXferType();
		baseXferType.setSeq("1329043");
		baseXferType.setSvrBranch("120");
		baseXferType.setTellerId("990BPM");
		body.setBaseXfer(baseXferType);
		// thong tin nguoi gui
		AcctInfoType acctType = new AcctInfoType();
		acctType.setAcctNo("280701003");
		//acctType.setAcctType("D");
		acctType.setPayAmt("622679000");
		acctType.setCurCode("VND");
		
		BriefPersonInfoType berCusInfo = new BriefPersonInfoType();
		berCusInfo.setFullName("Everest 247");
		berCusInfo.setCIFNo("");
		
		CustXferInfoType sendInfo = new CustXferInfoType();
		sendInfo.setAcctInfo(acctType);
		sendInfo.setBriefCustInfo(berCusInfo);
		body.setSenderInfo(sendInfo);
		
		//thong tin nguoi nhan
		AcctInfoType acctType2 = new AcctInfoType();
		acctType2.setAcctNo("0169822513");
		acctType2.setBankNo("48304001");
		acctType2.setPayAmt("622679000");
		acctType2.setCurCode("VND");
		
		BriefPersonInfoType berCusInfo2 = new BriefPersonInfoType();
		berCusInfo2.setFullName("NGUYEN VAN K");
		berCusInfo2.setCIFNo("");
		
		CustXferInfoType receiveInfo = new CustXferInfoType();
		receiveInfo.setAcctInfo(acctType2);
		receiveInfo.setBriefCustInfo(berCusInfo2);
		body.setReceiverInfo(receiveInfo);
		
		MedialBankInfoType mediaBank = new MedialBankInfoType();
		mediaBank.setAcctNo("");
		mediaBank.setBankNo("48304001");
		mediaBank.setBranchNo("48304001");
		body.setMedialBankInfo(mediaBank);
		
		AmtType2 amt = new AmtType2();
		amt.setAmt("5000");
		amt.setCurCode("VND");
		body.setAmt(amt);
		
		FeeInfoType feeInfo= new FeeInfoType();
		feeInfo.setAmtFee("0");
		feeInfo.setFeeType("O");
		feeInfo.setCurCode("VND");;
		body.setFeeInfo(feeInfo);
		
		VATInfo vatInfo = new VATInfo();
		vatInfo.setVATAmt("0");
		vatInfo.setVATCode("VND");
		body.setVATInfo(vatInfo);
		
		body.setRemark("CK ngoai ngan hang");
		body.setRMNo("SL");
		int errcode = soaReqestReply.InitSOAConnection(infoConfig.getUrlConnect(), infoConfig.getUserConnect(),
				infoConfig.getPassConnect());
		if (errcode != 0) {
			System.out.println("Error connect JMS");
			return;
		}

		DomesticXfer cus = new DomesticXfer();
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
			DomesticXfer cus = new DomesticXfer();

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
		DomesticXferReqType obj = new DomesticXferReqType();
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

		SOARequestObject genSOAMsgObj = soaReqestReply.GenerateSOAMessage(DomesticXferReqType.class, obj);

		System.out.println(genSOAMsgObj.getRequestmsg());

		int timeOut = 100000; // minisecond
		SOAResponeObject outputObj = soaReqestReply.ProcessSOAService(queueName, soapActionInWSDL,
				genSOAMsgObj.getRequestmsg(), timeOut);
		try {
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
