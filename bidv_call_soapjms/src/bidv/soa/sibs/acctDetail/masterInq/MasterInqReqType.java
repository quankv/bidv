//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.07 at 10:36:55 AM ICT 
//


package bidv.soa.sibs.acctDetail.masterInq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MasterInqReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MasterInqReqType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bidv.com/common/envelope/serviceenvelope/1.0}BaseServiceEnvelopeRequestType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.bidv.com.vn/entity/global/vn/account/acctdetail/masterinq/1.0}BodyReqMasterInquiry"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "MasterInqReq", namespace = "http://www.bidv.com.vn/entity/global/vn/account/acctdetail/masterinq/1.0")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MasterInqReqType", namespace = "http://www.bidv.com.vn/entity/global/vn/account/acctdetail/masterinq/1.0", propOrder = {
    "bodyReqMasterInquiry"
})
public class MasterInqReqType
    extends BaseServiceEnvelopeRequestType
{

    @XmlElement(name = "BodyReqMasterInquiry", required = true)
    protected BodyReqMasterInquiryType bodyReqMasterInquiry;

    /**
     * Gets the value of the bodyReqMasterInquiry property.
     * 
     * @return
     *     possible object is
     *     {@link BodyReqMasterInquiryType }
     *     
     */
    public BodyReqMasterInquiryType getBodyReqMasterInquiry() {
        return bodyReqMasterInquiry;
    }

    /**
     * Sets the value of the bodyReqMasterInquiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyReqMasterInquiryType }
     *     
     */
    public void setBodyReqMasterInquiry(BodyReqMasterInquiryType value) {
        this.bodyReqMasterInquiry = value;
    }

}
