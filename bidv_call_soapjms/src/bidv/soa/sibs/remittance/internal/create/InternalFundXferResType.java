//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.06.29 at 05:19:32 PM ICT 
//


package bidv.soa.sibs.remittance.internal.create;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InternalFundXferResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InternalFundXferResType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bidv.com/common/envelope/serviceenvelope/1.0}BaseServiceEnvelopeResponseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.bidv.com/entity/vn/remittance/internalfundxfer/create/1.0}BodyResCreate"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "InternalFundXferRes", namespace = "http://www.bidv.com/entity/vn/remittance/internalfundxfer/create/1.0")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternalFundXferResType", namespace = "http://www.bidv.com/entity/vn/remittance/internalfundxfer/create/1.0", propOrder = {
    "bodyResCreate"
})
public class InternalFundXferResType
    extends BaseServiceEnvelopeResponseType
{

    @XmlElement(name = "BodyResCreate", required = true)
    protected BodyResCreateType bodyResCreate;

    /**
     * Gets the value of the bodyResCreate property.
     * 
     * @return
     *     possible object is
     *     {@link BodyResCreateType }
     *     
     */
    public BodyResCreateType getBodyResCreate() {
        return bodyResCreate;
    }

    /**
     * Sets the value of the bodyResCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyResCreateType }
     *     
     */
    public void setBodyResCreate(BodyResCreateType value) {
        this.bodyResCreate = value;
    }

}