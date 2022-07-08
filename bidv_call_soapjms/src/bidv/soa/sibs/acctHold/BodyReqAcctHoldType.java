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
 * <p>Java class for BodyReqAcctHoldType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BodyReqAcctHoldType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseInfo" type="{http://www.bidv.com/global/common/cromslibrary/1.0}BaseXfer"/>
 *         &lt;element name="AcctNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AcctType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HoldCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Amt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HoldFee" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExpirationDt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CheckPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EarmarkedCheck" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BodyReqAcctHoldType", namespace = "http://www.bidv.com/global/vn/account/accthold/hold/1.0", propOrder = {
    "baseInfo",
    "acctNo",
    "acctType",
    "typeCode",
    "holdCode",
    "amt",
    "holdFee",
    "expirationDt",
    "remark",
    "checkPrefix",
    "earmarkedCheck"
})
public class BodyReqAcctHoldType {

    @XmlElement(name = "BaseInfo", required = true)
    protected BaseXfer baseInfo;
    @XmlElement(name = "AcctNo", required = true)
    protected String acctNo;
    @XmlElement(name = "AcctType", required = true)
    protected String acctType;
    @XmlElement(name = "TypeCode", required = true)
    protected String typeCode;
    @XmlElement(name = "HoldCode", required = true)
    protected String holdCode;
    @XmlElement(name = "Amt", required = true)
    protected String amt;
    @XmlElement(name = "HoldFee", required = true)
    protected String holdFee;
    @XmlElement(name = "ExpirationDt", required = true)
    protected String expirationDt;
    @XmlElement(name = "Remark", required = true)
    protected String remark;
    @XmlElement(name = "CheckPrefix")
    protected String checkPrefix;
    @XmlElement(name = "EarmarkedCheck")
    protected String earmarkedCheck;

    /**
     * Gets the value of the baseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BaseXfer }
     *     
     */
    public BaseXfer getBaseInfo() {
        return baseInfo;
    }

    /**
     * Sets the value of the baseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseXfer }
     *     
     */
    public void setBaseInfo(BaseXfer value) {
        this.baseInfo = value;
    }

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
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the holdCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldCode() {
        return holdCode;
    }

    /**
     * Sets the value of the holdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldCode(String value) {
        this.holdCode = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmt(String value) {
        this.amt = value;
    }

    /**
     * Gets the value of the holdFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldFee() {
        return holdFee;
    }

    /**
     * Sets the value of the holdFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldFee(String value) {
        this.holdFee = value;
    }

    /**
     * Gets the value of the expirationDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDt() {
        return expirationDt;
    }

    /**
     * Sets the value of the expirationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDt(String value) {
        this.expirationDt = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * Gets the value of the checkPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckPrefix() {
        return checkPrefix;
    }

    /**
     * Sets the value of the checkPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckPrefix(String value) {
        this.checkPrefix = value;
    }

    /**
     * Gets the value of the earmarkedCheck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarmarkedCheck() {
        return earmarkedCheck;
    }

    /**
     * Sets the value of the earmarkedCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarmarkedCheck(String value) {
        this.earmarkedCheck = value;
    }

}
