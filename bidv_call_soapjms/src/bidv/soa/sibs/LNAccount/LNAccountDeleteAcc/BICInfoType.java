//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.08 at 04:49:21 PM ICT 
//


package bidv.soa.sibs.LNAccount.LNAccountDeleteAcc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BICInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BICInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BIC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BICDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BICType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BICInfoType", propOrder = {
    "bic",
    "bicDesc",
    "bicType"
})
public class BICInfoType {

    @XmlElement(name = "BIC", required = true)
    protected String bic;
    @XmlElement(name = "BICDesc")
    protected String bicDesc;
    @XmlElement(name = "BICType")
    protected String bicType;

    /**
     * Gets the value of the bic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIC() {
        return bic;
    }

    /**
     * Sets the value of the bic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIC(String value) {
        this.bic = value;
    }

    /**
     * Gets the value of the bicDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBICDesc() {
        return bicDesc;
    }

    /**
     * Sets the value of the bicDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBICDesc(String value) {
        this.bicDesc = value;
    }

    /**
     * Gets the value of the bicType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBICType() {
        return bicType;
    }

    /**
     * Sets the value of the bicType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBICType(String value) {
        this.bicType = value;
    }

}
