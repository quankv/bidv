//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.06 at 02:50:45 PM ICT 
//


package bidv.soa.sibs.remittance.domesticxfer.verify;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DomesticXferReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DomesticXferReqType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bidv.com/common/envelope/serviceenvelope/1.0}BaseServiceEnvelopeRequestType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.bidv.com/entity/vn/remittance/domesticxfer/verify/1.0}BodyReqVerify"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "DomesticXferReq")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DomesticXferReqType", namespace = "http://www.bidv.com/entity/vn/remittance/domesticxfer/verify/1.0", propOrder = {
    "bodyReqVerify"
})
public class DomesticXferReqType
    extends BaseServiceEnvelopeRequestType
{

    @XmlElement(name = "BodyReqVerify", required = true)
    protected BodyReqVerifyType bodyReqVerify;

    /**
     * Gets the value of the bodyReqVerify property.
     * 
     * @return
     *     possible object is
     *     {@link BodyReqVerifyType }
     *     
     */
    public BodyReqVerifyType getBodyReqVerify() {
        return bodyReqVerify;
    }

    /**
     * Sets the value of the bodyReqVerify property.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyReqVerifyType }
     *     
     */
    public void setBodyReqVerify(BodyReqVerifyType value) {
        this.bodyReqVerify = value;
    }

}
