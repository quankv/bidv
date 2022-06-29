package call_esb;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;
import org.json.XML;

public class CallESB {

	public static String call_api(String url, String appToken, String requestId, String body, Integer timeout,
			String authorization) {
		String response = "";
		HttpURLConnection conn = null;
		try {
			URL line_api_url = new URL(url);
			conn = (HttpURLConnection) line_api_url.openConnection();
			conn.setDoInput(true);
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");
			if (appToken != null && !"".equals(appToken)) {
				conn.setRequestProperty("appToken", appToken);
			}
			conn.setRequestProperty("requestID", requestId);
			if (authorization != null && !"".equals(authorization)) {
				conn.setRequestProperty("Authorization", authorization);
			}
			conn.setConnectTimeout(timeout.intValue());
			DataOutputStream out = new DataOutputStream(conn.getOutputStream());
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out, "UTF-8"));
			writer.write(body);
			writer.close();
			out.close();
			int status = conn.getResponseCode();
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			StringBuffer content = new StringBuffer();
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				content.append(inputLine);
			}
			in.close();
			response = content.toString();
			System.out.println(content);
		} catch (Exception e) {
			response = "Loi xu ly: " + e.getMessage();
			e.printStackTrace();
		} finally {
			if (conn != null) {
				conn.disconnect();
			}
		}
		return response;
	}

	public static void main(String[] args) throws Exception {
		String appToken = "eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJCSURWQVBJIiwiYXBwaWQiOjM4MiwiY2xpZW50aWQiOjc1MiwicGxhbmlkIjo5OTJ9.REYIqfK4gryUfqmu4ombo3FGFfxQZIn7ARJJEwDMzPA";
		String requestId = "GNTT_1497232362";
		// Get credential
//		String url = "http://esbrestful-dev.apps.openshift.ldapudtest.com/esb/smartca/csc/credentials/list";
//		String POST_DATA = "{}";
//		
		// Get certificates
//		String url ="http://esbrestful-dev.apps.openshift.ldapudtest.com/esb/smartca/csc/credentials/info";
//		String POST_DATA = "{\"credentialId\":\"238a5f6d-30ec-42c0-8413-8c0b444013c7\",\"certificates\":\"chain\",\"certInfo\":true,\"authInfo\":true}";
		
		
		
		//sign hash
		String url ="http://esbrestful-dev.apps.openshift.ldapudtest.com/esb/smartca/csc/signature/signhash";
		String POST_DATA = "{\"credentialId\":\"238a5f6d-30ec-42c0-8413-8c0b444013c7\",\"refTranId\":\"e442f592-f892-43dd-8a4b-d6339679f27f\",\"notifyUrl\":\"https://localhost/kyso/callback\",\"description\":\"Pdfsignhashsample\",\"datas\":[{\"name\":\"sample.pdf\",\"hash\":\"C9KGObTjcrLiLXeNFnAboNT7aEf+Z0Eh/DGzGu/chDQ=\"}]}";
//		
		//Get transaction info
//		String url ="http://esbrestful-dev.apps.openshift.ldapudtest.com/esb/smartca/csc/credentials/gettraninfo";
//		String POST_DATA = "{\"tranId\": \"20a627a9-6a5d-4523-84ae-41d18bbc5c37\"}";
		JSONObject json = new JSONObject(POST_DATA);
		String xml = XML.toString(json);
		System.out.println(xml);
		Integer timeout = 5000;
		//call_api(url, appToken, requestId, POST_DATA, timeout,"Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IjZDNUMwQUFGNEY0MzBENEJCQjUzOUY1RTREMTBDREE2QTVCMEQxOTZSUzI1NiIsInR5cCI6ImF0K2p3dCIsIng1dCI6ImJGd0tyMDlERFV1N1U1OWVUUkROcHFXdzBaWSJ9.eyJuYmYiOjE2NTQ1NjcxODcsImV4cCI6MTY1NDU3MDc4NywiaXNzIjoiVk5QVFJNX0lEUCIsImF1ZCI6WyJzaWduYXR1cmUiLCJWTlBUUk1fSURQL3Jlc291cmNlcyJdLCJjbGllbnRfaWQiOiI0MTg1LTYzNzEyNzk5NTU0NzMzMDYzMy5hcHBzLnNpZ25zZXJ2aWNlYXBpLmNvbSIsImNsaWVudF9uYW1lIjoiVk5QVCBTbWFydENBIEFwcCIsInN1YiI6ImQ4NDFhMGVkLTFmMDktNGI0My1hMjA4LTg4NDBhMDg2Yzk0MCIsImF1dGhfdGltZSI6MTY1NDU2NzE4NywiaWRwIjoibG9jYWwiLCJyb2xlIjoiVXNlciIsIkZ1bGxOYW1lIjoiTMOqIEjhu691IFR14bqlbiBBbmgiLCJDb21wYW55QWRtaW4iOiJDb21wYW55VXNlciIsIlVzZXJHcm91cElkIjoiIiwiVWlkIjoiMTczNjY0NDUwIiwiUGhvbmVOdW1iZXIiOiIwODg4MTU2NzU4IiwiQWNjb3VudFR5cGVEZXNjIjoiSU5ESVZJRFVBTCIsImxhbmd1YWdlIjoidmkiLCJTZXJ2aWNlUGFjayI6IlNtYXJ0Q0EgUGVyc29uYWwgUHJvIiwiQWRtaW5Mb2NhbGl0eUNvZGUiOiIiLCJqdGkiOiIzNDhENjcwQkU0Q0MzNzAyNDlENDFGOTdFNjQ0NUI3MyIsImlhdCI6MTY1NDU2NzE4Nywic2NvcGUiOlsiZW1haWwiLCJvcGVuaWQiLCJwcm9maWxlIiwic2lnbiIsIm9mZmxpbmVfYWNjZXNzIl0sImFtciI6WyJjdXN0b20iXX0.Ce26Hg-GjQErWXbchLPW25xQjh55UydtGrgnr9bOa99WjABEL26ff8kTaKtjFw6A1dlm42yOGq7Cv_761haSHyfECGoVZtgxn-a4zy192EMPylSl3uWrKil6vqcGoA0OoVuSQj-4s3PEE9FmpV-xFnvZN9fi2P5uiP1CRX6ePB8pV-vvw_lRt_dLNoNkvbxyLc5eMknk5gQDe2ZzTUjj6HF3htRuLSC6W1NKPWyPXtOQsqEQGKJuK9ObpNTpWQ_n3BGfRj613pslnZbfQ84UNGWK_y_9LWFDpSjom4No1O5j1RuFlVZUR642J4Q9wYNcba9mTwxPsh4t3C-CwLgDFA");
	}

}
