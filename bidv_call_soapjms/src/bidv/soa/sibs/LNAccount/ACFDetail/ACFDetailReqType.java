//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.08 at 05:11:01 PM ICT 
//


package bidv.soa.sibs.LNAccount.ACFDetail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ACFDetailReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACFDetailReqType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bidv.com/common/envelope/serviceenvelope/1.0}BaseServiceEnvelopeRequestType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.bidv.com/entity/vn/loan/lnaccount/acfdetail/1.0}BodyReq"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "ACFDetailReq", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/acfdetail/1.0")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACFDetailReqType", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/acfdetail/1.0", propOrder = {
    "bodyReq"
})
public class ACFDetailReqType
    extends BaseServiceEnvelopeRequestType
{

    @XmlElement(name = "BodyReq", required = true)
    protected BodyReqType bodyReq;

    /**
     * Gets the value of the bodyReq property.
     * 
     * @return
     *     possible object is
     *     {@link BodyReqType }
     *     
     */
    public BodyReqType getBodyReq() {
        return bodyReq;
    }

    /**
     * Sets the value of the bodyReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyReqType }
     *     
     */
    public void setBodyReq(BodyReqType value) {
        this.bodyReq = value;
    }

}
