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
 * <p>Java class for FeeInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AmtFee" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FeeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncludeFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeInfoType", propOrder = {
    "amtFee",
    "feeType",
    "curCode",
    "includeFee"
})
public class FeeInfoType {

    @XmlElement(name = "AmtFee", required = true)
    protected String amtFee;
    @XmlElement(name = "FeeType")
    protected String feeType;
    @XmlElement(name = "CurCode")
    protected String curCode;
    @XmlElement(name = "IncludeFee")
    protected String includeFee;

    /**
     * Gets the value of the amtFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmtFee() {
        return amtFee;
    }

    /**
     * Sets the value of the amtFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmtFee(String value) {
        this.amtFee = value;
    }

    /**
     * Gets the value of the feeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeType() {
        return feeType;
    }

    /**
     * Sets the value of the feeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeType(String value) {
        this.feeType = value;
    }

    /**
     * Gets the value of the curCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurCode() {
        return curCode;
    }

    /**
     * Sets the value of the curCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurCode(String value) {
        this.curCode = value;
    }

    /**
     * Gets the value of the includeFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeFee() {
        return includeFee;
    }

    /**
     * Sets the value of the includeFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeFee(String value) {
        this.includeFee = value;
    }

}
