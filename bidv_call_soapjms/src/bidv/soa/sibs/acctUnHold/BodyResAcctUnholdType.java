//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.08 at 11:05:34 AM ICT 
//


package bidv.soa.sibs.acctUnHold;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BodyResAcctUnholdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BodyResAcctUnholdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EntryHold" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BodyResAcctUnholdType", namespace = "http://www.bidv.com/global/vn/account/accthold/unhold/1.0", propOrder = {
    "entryHold"
})
public class BodyResAcctUnholdType {

    @XmlElement(name = "EntryHold", required = true)
    protected String entryHold;

    /**
     * Gets the value of the entryHold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryHold() {
        return entryHold;
    }

    /**
     * Sets the value of the entryHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryHold(String value) {
        this.entryHold = value;
    }

}
