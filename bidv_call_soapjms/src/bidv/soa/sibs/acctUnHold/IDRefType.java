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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for IDRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IDRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDIssueDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="IDIssueBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDExpiryDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResidentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IDRefType", namespace = "http://www.bidv.com/global/common/customer/1.0", propOrder = {
    "idType",
    "idNo",
    "idIssueDt",
    "idIssueBy",
    "idExpiryDt",
    "country",
    "residentCode"
})
public class IDRefType {

    @XmlElement(name = "IDType")
    protected String idType;
    @XmlElement(name = "IDNo")
    protected String idNo;
    @XmlElement(name = "IDIssueDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar idIssueDt;
    @XmlElement(name = "IDIssueBy")
    protected String idIssueBy;
    @XmlElement(name = "IDExpiryDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar idExpiryDt;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "ResidentCode")
    protected String residentCode;

    /**
     * Gets the value of the idType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDType() {
        return idType;
    }

    /**
     * Sets the value of the idType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDType(String value) {
        this.idType = value;
    }

    /**
     * Gets the value of the idNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDNo() {
        return idNo;
    }

    /**
     * Sets the value of the idNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDNo(String value) {
        this.idNo = value;
    }

    /**
     * Gets the value of the idIssueDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIDIssueDt() {
        return idIssueDt;
    }

    /**
     * Sets the value of the idIssueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIDIssueDt(XMLGregorianCalendar value) {
        this.idIssueDt = value;
    }

    /**
     * Gets the value of the idIssueBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDIssueBy() {
        return idIssueBy;
    }

    /**
     * Sets the value of the idIssueBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDIssueBy(String value) {
        this.idIssueBy = value;
    }

    /**
     * Gets the value of the idExpiryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIDExpiryDt() {
        return idExpiryDt;
    }

    /**
     * Sets the value of the idExpiryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIDExpiryDt(XMLGregorianCalendar value) {
        this.idExpiryDt = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the residentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidentCode() {
        return residentCode;
    }

    /**
     * Sets the value of the residentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidentCode(String value) {
        this.residentCode = value;
    }

}
