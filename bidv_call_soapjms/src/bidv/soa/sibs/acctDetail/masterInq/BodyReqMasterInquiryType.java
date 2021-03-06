//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.07 at 10:36:55 AM ICT 
//


package bidv.soa.sibs.acctDetail.masterInq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BodyReqMasterInquiryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BodyReqMasterInquiryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccInfoType" type="{http://www.bidv.com/global/common/account/1.0}AcctInfoType"/>
 *         &lt;element name="SearchMethod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TransactionMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MoreRecordIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BodyReqMasterInquiryType", namespace = "http://www.bidv.com.vn/entity/global/vn/account/acctdetail/masterinq/1.0", propOrder = {
    "accInfoType",
    "searchMethod",
    "transactionMode",
    "moreRecordIndicator"
})
public class BodyReqMasterInquiryType {

    @XmlElement(name = "AccInfoType", required = true)
    protected AcctInfoType accInfoType;
    @XmlElement(name = "SearchMethod", required = true)
    protected String searchMethod;
    @XmlElement(name = "TransactionMode", required = true)
    protected String transactionMode;
    @XmlElement(name = "MoreRecordIndicator", required = true)
    protected String moreRecordIndicator;

    /**
     * Gets the value of the accInfoType property.
     * 
     * @return
     *     possible object is
     *     {@link AcctInfoType }
     *     
     */
    public AcctInfoType getAccInfoType() {
        return accInfoType;
    }

    /**
     * Sets the value of the accInfoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctInfoType }
     *     
     */
    public void setAccInfoType(AcctInfoType value) {
        this.accInfoType = value;
    }

    /**
     * Gets the value of the searchMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchMethod() {
        return searchMethod;
    }

    /**
     * Sets the value of the searchMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchMethod(String value) {
        this.searchMethod = value;
    }

    /**
     * Gets the value of the transactionMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionMode() {
        return transactionMode;
    }

    /**
     * Sets the value of the transactionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionMode(String value) {
        this.transactionMode = value;
    }

    /**
     * Gets the value of the moreRecordIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoreRecordIndicator() {
        return moreRecordIndicator;
    }

    /**
     * Sets the value of the moreRecordIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoreRecordIndicator(String value) {
        this.moreRecordIndicator = value;
    }

}
