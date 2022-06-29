package ecm_filenet.bean;

import java.util.Date;

public class DocumentBMPDTO {
//	"Danh sách tài liệu:
//	- Loại hồ sơ
//	- Tên hồ sơ ( = loại hồ sơ)
//	- Thời gian upload
//	- Người thực hiện
//	- Số CIF
//	- Tên khách hàng
//	- Ngày tạo
//	- ID Document"
	
	
	private String id;
	private String docType;
	private String docName;
	private Date uploadDate;
	private String userUpload;
	private Integer cifNo;
	private String cusName;
	private Date createDate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getDocType() {
		return docType;
	}
	public void setDocType(String docType) {
		this.docType = docType;
	}
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	 
	 
	public String getUserUpload() {
		return userUpload;
	}
	public void setUserUpload(String userUpload) {
		this.userUpload = userUpload;
	}
	
	public Integer getCifNo() {
		return cifNo;
	}
	public void setCifNo(Integer cifNo) {
		this.cifNo = cifNo;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public Date getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	 
	
	
}
