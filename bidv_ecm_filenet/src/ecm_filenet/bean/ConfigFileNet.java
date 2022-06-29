package ecm_filenet.bean;

public class ConfigFileNet {
	private String Uri;
	private String osName;
	private String stanza;
	private String username;
	private String storagePolicy;
	private String password;
	private String urlApprove;
	public String getUri() {
		return Uri;
	}
	public void setUri(String uri) {
		Uri = uri;
	}
	public String getOsName() {
		return osName;
	}
	public void setOsName(String osName) {
		this.osName = osName;
	}
	public String getStanza() {
		return stanza;
	}
	public void setStanza(String stanza) {
		this.stanza = stanza;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getStoragePolicy() {
		return storagePolicy;
	}
	public void setStoragePolicy(String storagePolicy) {
		this.storagePolicy = storagePolicy;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUrlApprove() {
		return urlApprove;
	}
	public void setUrlApprove(String urlApprove) {
		this.urlApprove = urlApprove;
	}
	
}
