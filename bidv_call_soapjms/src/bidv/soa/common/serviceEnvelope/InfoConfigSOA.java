package bidv.soa.common.serviceEnvelope;

public class InfoConfigSOA {
	private String urlConnect;
	private String userConnect;
	private String passConnect;
	private String appCode;
	private String deviceId;
	private String businessDomain;
	private String serviceVersion;
	private String soapActionInWSDL;
	private String queueName;
	
	
	
	public String getSoapActionInWSDL() {
		return soapActionInWSDL;
	}
	public void setSoapActionInWSDL(String soapActionInWSDL) {
		this.soapActionInWSDL = soapActionInWSDL;
	}
	public String getQueueName() {
		return queueName;
	}
	public void setQueueName(String queueName) {
		this.queueName = queueName;
	}
	public String getUrlConnect() {
		return urlConnect;
	}
	public void setUrlConnect(String urlConnect) {
		this.urlConnect = urlConnect;
	}
	public String getUserConnect() {
		return userConnect;
	}
	public void setUserConnect(String userConnect) {
		this.userConnect = userConnect;
	}
	public String getPassConnect() {
		return passConnect;
	}
	public void setPassConnect(String passConnect) {
		this.passConnect = passConnect;
	}
	public String getAppCode() {
		return appCode;
	}
	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getBusinessDomain() {
		return businessDomain;
	}
	public void setBusinessDomain(String businessDomain) {
		this.businessDomain = businessDomain;
	}
	public String getServiceVersion() {
		return serviceVersion;
	}
	public void setServiceVersion(String serviceVersion) {
		this.serviceVersion = serviceVersion;
	}
	
}
