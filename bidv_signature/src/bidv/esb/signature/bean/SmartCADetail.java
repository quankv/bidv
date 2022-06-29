package bidv.esb.signature.bean;

import java.util.List; 

public class SmartCADetail {
	private String username;
	private String password;
	private String url;
	private String clientId;
	private String clientSecret;
	private String accessToken;
	private String refreshToken;
	private String credentialId;
	private List<FileHash> datas;

	/**
	 * @param username
	 * @param password
	 * @param url
	 * @param clientId
	 * @param clientSecret
	 * @param accessToken
	 * @param refreshToken
	 * @param credentialId
	 * @param fileName
	 * @param fileContent
	 */
	public SmartCADetail(String username, String password, String url, String clientId, String clientSecret,
			String accessToken, String refreshToken, String credentialId) {
		super();
		this.username = username;
		this.password = password;
		this.url = url;
		this.clientId = clientId;
		this.clientSecret = clientSecret;
		this.accessToken = accessToken;
		this.refreshToken = refreshToken;
		this.credentialId = credentialId;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientSecret() {
		return clientSecret;
	}

	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public String getCredentialId() {
		return credentialId;
	}

	public void setCredentialId(String credentialId) {
		this.credentialId = credentialId;
	}

	public List<FileHash> getDatas() {
		return datas;
	}

	public void setDatas(List<FileHash> datas) {
		this.datas = datas;
	}

}
