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
 * <p>Java class for BodyReqAcctUnholdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BodyReqAcctUnholdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseInfo" type="{http://www.bidv.com/global/common/cromslibrary/1.0}BaseXfer"/>
 *         &lt;element name="AcctNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AcctType" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "BodyReqAcctUnholdType", namespace = "http://www.bidv.com/global/vn/account/accthold/unhold/1.0", propOrder = {
    "baseInfo",
    "acctNo",
    "acctType",
    "entryHold"
})
public class BodyReqAcctUnholdType {

    @XmlElement(name = "BaseInfo", required = true)
    protected BaseXfer baseInfo;
    @XmlElement(name = "AcctNo", required = true)
    protected String acctNo;
    @XmlElement(name = "AcctType", required = true)
    protected String acctType;
    @XmlElement(name = "EntryHold", required = true)
    protected String entryHold;

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
