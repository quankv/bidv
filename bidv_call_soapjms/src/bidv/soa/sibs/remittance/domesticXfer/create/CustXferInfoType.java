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
 * <p>Java class for CustXferInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustXferInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcctInfo" type="{http://www.bidv.com/global/common/account/1.0}AcctInfoType" minOccurs="0"/>
 *         &lt;element name="BriefCustInfo" type="{http://www.bidv.com/entity/vn/remittance/domesticxfer/create/1.0}BriefPersonInfoType" minOccurs="0"/>
 *         &lt;element name="AmtInfo" type="{http://www.bidv.com/global/common/account/1.0}AmtType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustXferInfoType", propOrder = {
    "acctInfo",
    "briefCustInfo",
    "amtInfo"
})
public class CustXferInfoType {

    @XmlElement(name = "AcctInfo")
    protected AcctInfoType acctInfo;
    @XmlElement(name = "BriefCustInfo")
    protected BriefPersonInfoType briefCustInfo;
    @XmlElement(name = "AmtInfo")
    protected AmtType amtInfo;

    /**
     * Gets the value of the acctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AcctInfoType }
     *     
     */
    public AcctInfoType getAcctInfo() {
        return acctInfo;
    }

    /**
     * Sets the value of the acctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctInfoType }
     *     
     */
    public void setAcctInfo(AcctInfoType value) {
        this.acctInfo = value;
    }

    /**
     * Gets the value of the briefCustInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BriefPersonInfoType }
     *     
     */
    public BriefPersonInfoType getBriefCustInfo() {
        return briefCustInfo;
    }

    /**
     * Sets the value of the briefCustInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BriefPersonInfoType }
     *     
     */
    public void setBriefCustInfo(BriefPersonInfoType value) {
        this.briefCustInfo = value;
    }

    /**
     * Gets the value of the amtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AmtType }
     *     
     */
    public AmtType getAmtInfo() {
        return amtInfo;
    }

    /**
     * Sets the value of the amtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmtType }
     *     
     */
    public void setAmtInfo(AmtType value) {
        this.amtInfo = value;
    }

}
