//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.08 at 04:58:26 PM ICT 
//


package bidv.soa.sibs.LNAccount.RestructAuthLimit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RestructLimitResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RestructLimitResType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bidv.com/common/envelope/serviceenvelope/1.0}BaseServiceEnvelopeResponseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.bidv.com/entity/vn/loan/lnaccount/restructauthlimit/1.0}BodyRes"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "RestructLimitRes", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/restructauthlimit/1.0")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestructLimitResType", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/restructauthlimit/1.0", propOrder = {
    "bodyRes"
})
public class RestructLimitResType
    extends BaseServiceEnvelopeResponseType
{

    @XmlElement(name = "BodyRes", required = true)
    protected BodyResType bodyRes;

    /**
     * Gets the value of the bodyRes property.
     * 
     * @return
     *     possible object is
     *     {@link BodyResType }
     *     
     */
    public BodyResType getBodyRes() {
        return bodyRes;
    }

    /**
     * Sets the value of the bodyRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyResType }
     *     
     */
    public void setBodyRes(BodyResType value) {
        this.bodyRes = value;
    }

}
