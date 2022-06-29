package ecm_filenet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import bean.BidvMessage;
import ecm_filenet.bean.ConfigFileNet;
import ecm_filenet.bean.DocumentBMPDTO;
import filenetP8.FileNetObject;
import model.DocumentDTO;

public class CallECM {
//	getListOfDocumentByProperties
//	getDocumentById
//	createDocNonDigitized
//	approveDocument

	

	public static FileNetObject init(String jsonConfig) {

		FileNetObject filenet = null;
		if (jsonConfig != null && !"".equals(jsonConfig)) {
			Gson g = new Gson();
			ConfigFileNet config = g.fromJson(jsonConfig, ConfigFileNet.class);
			try {
				filenet = new FileNetObject(config.getUri(), config.getOsName(), config.getStoragePolicy(),
						config.getStanza(), config.getUsername(), config.getPassword(), config.getUrlApprove());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return filenet;
	}


	public static String getListOfDocumentByProperties(String className,
			Map<String, Object> propertiesEquals, Map<String, Object> propertiesNotEquals, String jsonConfig) {
		FileNetObject filenet = init(jsonConfig);
		List<DocumentBMPDTO> listDocBPM = new ArrayList<DocumentBMPDTO>();
		Gson g = new Gson();
		if (filenet != null) {
			try {
				List<DocumentDTO> listDocDTO = filenet.getListOfDocumentByProperties(className, propertiesEquals,
						propertiesNotEquals);
				if (listDocDTO.size() > 0) {
					for (DocumentDTO docDTO : listDocDTO) {
						DocumentBMPDTO docBPM = new DocumentBMPDTO();
						docBPM.setDocType(docDTO.getProperties().getStringValue("DocumentTypeID"));// loai ho so
						docBPM.setDocName(docDTO.getProperties().getStringValue("DocumentName"));// ten ho so
						docBPM.setUploadDate(docDTO.getProperties().getDateTimeValue("ECMDateCreated"));// thoi gian
						docBPM.setUserUpload(docDTO.getProperties().getStringValue("ECMUserCreated"));// nguoi thuc hien
						docBPM.setCifNo(docDTO.getProperties().getInteger32Value("CIFNumber"));// so cif
						docBPM.setCusName(docDTO.getProperties().getStringValue("CustomerName"));// ten kh
						docBPM.setCreateDate(docDTO.getProperties().getDateTimeValue("ECMDateCreated"));// ngay tao
						docBPM.setId(docDTO.getId());// id document
						listDocBPM.add(docBPM);
					}
				}
				return g.toJson(listDocBPM).toString();
			} catch (Exception e) {
				e.printStackTrace();
				return e.getMessage();
			}
		}else {
			return "Init Connect filenet fail";
		} 
	}

	public static String  approveDocument(String transactionId, String customerType, String jsonConfig){
		try {
			Gson g = new Gson();
			BidvMessage bidvMess = new BidvMessage();
			FileNetObject filenet = init(jsonConfig);
			if (filenet != null) {
				bidvMess = filenet.approveDocument(transactionId, customerType);
				return g.toJson(bidvMess);
			}else {
				return "Init Connect filenet fail";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		} 
	}
	public static String updateDocumentProperties(String docId, Map<String, Object> properties, String jsonConfig) {
		try {
			FileNetObject filenet = init(jsonConfig);
			if (filenet != null) { 
				return filenet.updateDocumentProperties(docId, properties);
			}else {
				return "Init Connect filenet fail";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		} 
		
	}
	public static String getListOfDocumentByPropertiesCroms(String documentType, String cif, String fromDate, String toDate, String jsonConfig) {
		FileNetObject filenet = init(jsonConfig);
		List<DocumentBMPDTO> listDocBPM = new ArrayList<DocumentBMPDTO>();
		Gson g = new Gson();
		if (filenet != null) {
			try {
				List<DocumentDTO> listDocDTO = filenet.getListOfDocumentFromCROM(documentType, cif,fromDate, toDate);
				if (listDocDTO.size() > 0) {
					for (DocumentDTO docDTO : listDocDTO) {
						DocumentBMPDTO docBPM = new DocumentBMPDTO();
						docBPM.setDocType(docDTO.getProperties().getStringValue("DocumentTypeID"));// loai ho so
						docBPM.setDocName(docDTO.getProperties().getStringValue("DocumentName"));// ten ho so
						docBPM.setUploadDate(docDTO.getProperties().getDateTimeValue("ECMDateCreated"));// thoi gian
						docBPM.setUserUpload(docDTO.getProperties().getStringValue("ECMUserCreated"));// nguoi thuc hien
						docBPM.setCifNo(docDTO.getProperties().getInteger32Value("CIFNumber"));// so cif
						docBPM.setCusName(docDTO.getProperties().getStringValue("CustomerName"));// ten kh
						docBPM.setCreateDate(docDTO.getProperties().getDateTimeValue("ECMDateCreated"));// ngay tao
						docBPM.setId(docDTO.getId());// id document
						listDocBPM.add(docBPM);
					}
				}
				return g.toJson(listDocBPM).toString();
			} catch (Exception e) {
				e.printStackTrace();
				return e.getMessage();
			}
		}else {
			return "Init Connect filenet fail";
		} 
	}
	public static void main(String args[]) throws Exception {
		ConfigFileNet conN = new ConfigFileNet();
		conN.setOsName("ecm");
		conN.setPassword("abc@123");
		conN.setStanza("FileNetP8WSI");
		conN.setStoragePolicy("{E0A4E86E-0000-CF43-B4DC-C532F974475A}");
		conN.setUri("http://10.53.253.206:9080/wsi/FNCEWS40MTOM");
		conN.setUrlApprove(null);
		conN.setUsername("ecmadmin");
		CallECM call = new CallECM();
		Gson g = new Gson();
		Map<String, Object> propertiesEquals = new HashMap<String, Object>();
		propertiesEquals.put("CIFNumber", 123);
		
		Map<String, Object> propertiesNotEquals = new HashMap<String, Object>();
		
		String lst = call.getListOfDocumentByPropertiesCroms("HSPL", "24222", "10/12/2020", "10/12/2022", g.toJson(conN));//("SMEDocument", propertiesEquals, propertiesNotEquals, g.toJson(conN));
		System.out.println("lst: "+lst);
	}

}
