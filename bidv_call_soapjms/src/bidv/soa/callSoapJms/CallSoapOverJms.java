package bidv.soa.callSoapJms;

import com.google.gson.Gson;

import bidv.soa.ach247.inquiry.InquiryInfoAccount;
import bidv.soa.common.serviceEnvelope.InfoConfigSOA;
import bidv.soa.sibs.LNAccount.ACFDetail.ACFDetail;
import bidv.soa.sibs.LNAccount.ACFDetail.BodyReqType;
import bidv.soa.sibs.LNAccount.CreateAcc.CreateAcc;
import bidv.soa.sibs.LNAccount.DisbValueDateFile.DisbValue;
import bidv.soa.sibs.LNAccount.LNAccountDeleteAcc.LNAccountDeleteAcc;
import bidv.soa.sibs.LNAccount.MasterAANoInq.MasterAANoInq;

public class CallSoapOverJms {
	public static void main(String args[]) {
		InfoConfigSOA infoConfig = new InfoConfigSOA();
		infoConfig.setUrlConnect("tcp://10.53.19.15:7222");//fix cung
		infoConfig.setUserConnect("admin");//fix cung
		infoConfig.setPassConnect("");// fix cung
		infoConfig.setAppCode("BPM");// fix cung
		infoConfig.setDeviceId("CHANNEL");// k quan trong
		infoConfig.setBusinessDomain("BIDV.COM.VN");// fix cung
		infoConfig.setServiceVersion("1.0");// fix cung
		infoConfig.setQueueName("vn.lnaccount.1.0");//trong file wsdl
		infoConfig.setSoapActionInWSDL("/Services/Global/Vn/Loan/LNAccount/OperationImpl/LNAccount.serviceagent//ACFDetail");//trong file wsdl
		BodyReqType body = new BodyReqType();
		call_api(new Gson().toJson(infoConfig), new Gson().toJson(body), "sibs_LNAccount_ACFDetail");
	}
	public static String call_api(String jsonConfig, String jsonBody, String serviceType) {
		System.out.println("=============start call soap over jms================");
		String resp = "";
		try {
			switch (serviceType) {
			case "247_Inquiry":
				resp = InquiryInfoAccount.inquiryAccount(jsonConfig, jsonBody);
				break;
			case "sibs_LNAccount_MasterAANoInq":
				resp = MasterAANoInq.inquiryMasterAANo(jsonConfig, jsonBody);
				break;
			case "sibs_LNAccount_ACFDetail":
				resp = ACFDetail.acfDetail(jsonConfig, jsonBody);
				break;
			case "sibs_LNAccount_DeleteAcc":
				resp = LNAccountDeleteAcc.callLNAccountDeleteAcc(jsonConfig, jsonBody);
				break;
			case "sibs_LNAccount_CreateAcc":
				resp = CreateAcc.callCreateAcc(jsonConfig, jsonBody);
				break;
			case "sibs_LNAccount_DisbValue":
				resp = DisbValue.callDisbValue(jsonConfig, jsonBody);
				break;
			default:
				break;
			}
		} catch (Exception e) {
			System.out.println("=============call soap over jms-->error================");
			System.out.println(e.getMessage());
			resp = e.getMessage();
		}
		System.out.println("=============end call soap over jms================");
		return resp;
	}
}
