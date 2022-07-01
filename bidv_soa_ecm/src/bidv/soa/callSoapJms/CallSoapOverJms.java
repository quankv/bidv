package bidv.soa.callSoapJms;


import soa.apps.ecm.approvalDocument.ApprovalDocument;
import soa.apps.ecm.digitizationservice.CallECMDigitizationService;
import soa.apps.ecm.getListDocumentCrom.GetListDocumentCrom;
import soa.common.InfoConfigSOA;

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
//		BodyReqType body = new BodyReqType();
//		call_api(new Gson().toJson(infoConfig), new Gson().toJson(body), "sibs_LNAccount_ACFDetail");
	}
	public static String call_api(String jsonConfig, String jsonBody, String serviceType) {
		System.out.println("=============start -- ECM -- call soap over jms================");
		String resp = "";
		try {
			switch (serviceType) {
			case "ECM_Digitization":
				resp = CallECMDigitizationService.CallECMDigitization(jsonConfig, jsonBody);
				break;
			case "ECM_ApprovalDoc":
				resp = ApprovalDocument.callApproveDocument(jsonConfig, jsonBody);
				break;
			case "ECM_GetDocumentCrom":
				resp = GetListDocumentCrom.getDocFromCrom(jsonConfig, jsonBody);
				break;
			default:
				break;
			}
		} catch (Exception e) {
			System.out.println("=============call -- ECM --  soap over jms-->error================");
			System.out.println(e.getMessage());
			resp = e.getMessage();
		}
		System.out.println("=============end -- ECM --  call soap over jms================");
		return resp;
	}
}
