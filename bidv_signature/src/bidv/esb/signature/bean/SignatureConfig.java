package bidv.esb.signature.bean;

public class SignatureConfig {
	private String grant_type;
	private String client_id;
	private String client_secret;
	private String username;
	private String password;
	private String requestID;
	private String appToken;
	private String endpoint;
	
	
	
	public String getGrant_type() {
		return grant_type;
	}
	public void setGrant_type(String grant_type) {
		this.grant_type = grant_type;
	}
	public String getClient_id() {
		return client_id;
	}
	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}
	public String getClient_secret() {
		return client_secret;
	}
	public void setClient_secret(String client_secret) {
		this.client_secret = client_secret;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRequestID() {
		return requestID;
	}
	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}
	public String getAppToken() {
		return appToken;
	}
	public void setAppToken(String appToken) {
		this.appToken = appToken;
	}
	public String getEndpoint() {
		return endpoint;
	}
	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}
	
	
}
