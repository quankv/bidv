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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemtterFeeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemtterFeeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RemtterAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RemtterCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemtterFeeInfo", propOrder = {
    "remtterAmt",
    "remtterCode"
})
public class RemtterFeeInfo {

    @XmlElement(name = "RemtterAmt", required = true)
    protected String remtterAmt;
    @XmlElement(name = "RemtterCode")
    protected String remtterCode;

    /**
     * Gets the value of the remtterAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemtterAmt() {
        return remtterAmt;
    }

    /**
     * Sets the value of the remtterAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemtterAmt(String value) {
        this.remtterAmt = value;
    }

    /**
     * Gets the value of the remtterCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemtterCode() {
        return remtterCode;
    }

    /**
     * Sets the value of the remtterCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemtterCode(String value) {
        this.remtterCode = value;
    }

}
