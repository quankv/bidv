//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.06.29 at 05:19:32 PM ICT 
//


package bidv.soa.sibs.remittance.internal.create;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BodyResCreateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BodyResCreateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RefNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TrnSeq" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FeeSeq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RMNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TellerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostingDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "BodyResCreate", namespace = "http://www.bidv.com/entity/vn/remittance/internalfundxfer/create/1.0")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BodyResCreateType", namespace = "http://www.bidv.com/entity/vn/remittance/internalfundxfer/create/1.0", propOrder = {
    "refNo",
    "trnSeq",
    "feeSeq",
    "rmNo",
    "tellerID",
    "postingDt"
})
public class BodyResCreateType {

    @XmlElement(name = "RefNo", required = true)
    protected String refNo;
    @XmlElement(name = "TrnSeq", required = true)
    protected String trnSeq;
    @XmlElement(name = "FeeSeq")
    protected String feeSeq;
    @XmlElement(name = "RMNo")
    protected String rmNo;
    @XmlElement(name = "TellerID")
    protected String tellerID;
    @XmlElement(name = "PostingDt")
    protected String postingDt;

    /**
     * Gets the value of the refNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNo() {
        return refNo;
    }

    /**
     * Sets the value of the refNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefNo(String value) {
        this.refNo = value;
    }

    /**
     * Gets the value of the trnSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnSeq() {
        return trnSeq;
    }

    /**
     * Sets the value of the trnSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnSeq(String value) {
        this.trnSeq = value;
    }

    /**
     * Gets the value of the feeSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeSeq() {
        return feeSeq;
    }

    /**
     * Sets the value of the feeSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeSeq(String value) {
        this.feeSeq = value;
    }

    /**
     * Gets the value of the rmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRMNo() {
        return rmNo;
    }

    /**
     * Sets the value of the rmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRMNo(String value) {
        this.rmNo = value;
    }

    /**
     * Gets the value of the tellerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTellerID() {
        return tellerID;
    }

    /**
     * Sets the value of the tellerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTellerID(String value) {
        this.tellerID = value;
    }

    /**
     * Gets the value of the postingDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostingDt() {
        return postingDt;
    }

    /**
     * Sets the value of the postingDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostingDt(String value) {
        this.postingDt = value;
    }

}
