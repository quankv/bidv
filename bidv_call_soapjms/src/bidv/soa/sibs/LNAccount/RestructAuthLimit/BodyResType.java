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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BodyResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BodyResType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcctNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AcctType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrgAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AvailLimit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BodyResType", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/restructauthlimit/1.0", propOrder = {
    "acctNo",
    "acctType",
    "orgAmt",
    "availLimit"
})
public class BodyResType {

    @XmlElement(name = "AcctNo", required = true)
    protected String acctNo;
    @XmlElement(name = "AcctType")
    protected String acctType;
    @XmlElement(name = "OrgAmt", required = true)
    protected String orgAmt;
    @XmlElement(name = "AvailLimit", required = true)
    protected String availLimit;

    /**
     * Gets the value of the acctNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctNo() {
        return acctNo;
    }

    /**
     * Sets the value of the acctNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctNo(String value) {
        this.acctNo = value;
    }

    /**
     * Gets the value of the acctType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctType() {
        return acctType;
    }

    /**
     * Sets the value of the acctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctType(String value) {
        this.acctType = value;
    }

    /**
     * Gets the value of the orgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgAmt() {
        return orgAmt;
    }

    /**
     * Sets the value of the orgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgAmt(String value) {
        this.orgAmt = value;
    }

    /**
     * Gets the value of the availLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailLimit() {
        return availLimit;
    }

    /**
     * Sets the value of the availLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailLimit(String value) {
        this.availLimit = value;
    }

}
