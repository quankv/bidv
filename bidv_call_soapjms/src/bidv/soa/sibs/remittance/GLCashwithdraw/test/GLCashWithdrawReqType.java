//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.06 at 03:48:53 PM ICT 
//


package bidv.soa.sibs.remittance.GLCashwithdraw.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GLCashWithdrawReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GLCashWithdrawReqType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bidv.com/common/envelope/serviceenvelope/1.0}BaseServiceEnvelopeRequestType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.bidv.com/entity/vn/remittance/glcashwithdraw/create/1.0}BodyReqCreate"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "GLCashWithdrawReq", namespace = "http://www.bidv.com/entity/vn/remittance/glcashwithdraw/create/1.0")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GLCashWithdrawReqType", namespace = "http://www.bidv.com/entity/vn/remittance/glcashwithdraw/create/1.0", propOrder = {
    "bodyReqCreate"
})
public class GLCashWithdrawReqType
    extends BaseServiceEnvelopeRequestType
{

    @XmlElement(name = "BodyReqCreate", required = true)
    protected BodyReqCreateType bodyReqCreate;

    /**
     * Gets the value of the bodyReqCreate property.
     * 
     * @return
     *     possible object is
     *     {@link BodyReqCreateType }
     *     
     */
    public BodyReqCreateType getBodyReqCreate() {
        return bodyReqCreate;
    }

    /**
     * Sets the value of the bodyReqCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyReqCreateType }
     *     
     */
    public void setBodyReqCreate(BodyReqCreateType value) {
        this.bodyReqCreate = value;
    }

}
