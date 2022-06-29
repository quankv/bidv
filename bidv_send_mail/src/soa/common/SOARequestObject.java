package soa.common;

public class SOARequestObject {
	int errcode;
	String responsemsg;
	Object soaResponseObj;
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
	public String getRequestmsg() {
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
