//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.22 at 03:02:39 PM ICT 
//


package bidv.soa.sibs.remittance.domesticxfer.create;

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
 *         &lt;element name="Borne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncludeCharges" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaidBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "borne",
    "includeCharges",
    "paidBy",
    "curCode",
    "totalFee"
})
public class FeeInfoType {

    @XmlElement(name = "AmtFee", required = true)
    protected String amtFee;
    @XmlElement(name = "FeeType")
    protected String feeType;
    @XmlElement(name = "Borne")
    protected String borne;
    @XmlElement(name = "IncludeCharges")
    protected String includeCharges;
    @XmlElement(name = "PaidBy")
    protected String paidBy;
    @XmlElement(name = "CurCode")
    protected String curCode;
    @XmlElement(name = "TotalFee")
    protected String totalFee;

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
     * Gets the value of the borne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorne() {
        return borne;
    }

    /**
     * Sets the value of the borne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorne(String value) {
        this.borne = value;
    }

    /**
     * Gets the value of the includeCharges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeCharges() {
        return includeCharges;
    }

    /**
     * Sets the value of the includeCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeCharges(String value) {
        this.includeCharges = value;
    }

    /**
     * Gets the value of the paidBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaidBy() {
        return paidBy;
    }

    /**
     * Sets the value of the paidBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaidBy(String value) {
        this.paidBy = value;
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
     * Gets the value of the totalFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalFee() {
        return totalFee;
    }

    /**
     * Sets the value of the totalFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalFee(String value) {
        this.totalFee = value;
    }

}
