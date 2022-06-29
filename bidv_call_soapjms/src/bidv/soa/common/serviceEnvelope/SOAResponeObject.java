package bidv.soa.common.serviceEnvelope;

public class SOAResponeObject {
	int errcode;
	String errdesc;
	String responsemsg;
	Object soaResponseObj;
	/**
	 * @return the errdesc
	 */
	public String getErrdesc() {
		return errdesc;
	}
	/**
	 * @param errdesc the errdesc to set
	 */
	public void setErrdesc(String errdesc) {
		this.errdesc = errdesc;
	}
	
	/**
	 * @return the errcode
	 */
	public int getErrcode() {
		return errcode;
	}
	/**
	 * @param errcode the errcode to set
	 */
	public void setErrcode(int errcode) {
		this.errcode = errcode;
	}
	/**
	 * @return the responsemsg
	 */
	public String getResponsemsg() {
		return responsemsg;
	}
	/**
	 * @param responsemsg the responsemsg to set
	 */
	public void setResponsemsg(String responsemsg) {
		this.responsemsg = responsemsg;
	}
	
	
	/**
	 * @return the soaResponseObj
	 */
	public Object getSoaResponseObj() {
		return soaResponseObj;
	}
	/**
	 * @param soaResponseObj the soaResponseObj to set
	 */
	public void setSoaResponseObj(Object soaResponseObj) {
		this.soaResponseObj = soaResponseObj;
	}
}
