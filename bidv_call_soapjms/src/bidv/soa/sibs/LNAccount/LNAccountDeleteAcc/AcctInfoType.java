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
 * <p>Java class for AcctInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcctNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AcctType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BranchNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcctTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctInfoType", namespace = "http://www.bidv.com/global/common/account/1.0", propOrder = {
    "acctNo",
    "acctType",
    "payAmt",
    "branchNo",
    "acctTitle",
    "curCode",
    "bankNo"
})
public class AcctInfoType {

    @XmlElement(name = "AcctNo", required = true)
    protected String acctNo;
    @XmlElement(name = "AcctType")
    protected String acctType;
    @XmlElement(name = "PayAmt")
    protected String payAmt;
    @XmlElement(name = "BranchNo")
    protected String branchNo;
    @XmlElement(name = "AcctTitle")
    protected String acctTitle;
    @XmlElement(name = "CurCode")
    protected String curCode;
    @XmlElement(name = "BankNo")
    protected String bankNo;

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
     * Gets the value of the payAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayAmt() {
        return payAmt;
    }

    /**
     * Sets the value of the payAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayAmt(String value) {
        this.payAmt = value;
    }

    /**
     * Gets the value of the branchNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchNo() {
        return branchNo;
    }

    /**
     * Sets the value of the branchNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchNo(String value) {
        this.branchNo = value;
    }

    /**
     * Gets the value of the acctTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctTitle() {
        return acctTitle;
    }

    /**
     * Sets the value of the acctTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctTitle(String value) {
        this.acctTitle = value;
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
     * Gets the value of the bankNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankNo() {
        return bankNo;
    }

    /**
     * Sets the value of the bankNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankNo(String value) {
        this.bankNo = value;
    }

}
