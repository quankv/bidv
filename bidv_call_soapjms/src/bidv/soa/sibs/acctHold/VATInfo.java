//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.08 at 09:59:47 AM ICT 
//


package bidv.soa.sibs.acctHold;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VATInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VATInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VATAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VATCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VATInfo", propOrder = {
    "vatAmt",
    "vatCode"
})
public class VATInfo {

    @XmlElement(name = "VATAmt", required = true)
    protected String vatAmt;
    @XmlElement(name = "VATCode")
    protected String vatCode;

    /**
     * Gets the value of the vatAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVATAmt() {
        return vatAmt;
    }

    /**
     * Sets the value of the vatAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVATAmt(String value) {
        this.vatAmt = value;
    }

    /**
     * Gets the value of the vatCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVATCode() {
        return vatCode;
    }

    /**
     * Sets the value of the vatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVATCode(String value) {
        this.vatCode = value;
    }

}
