//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.08 at 05:11:01 PM ICT 
//


package bidv.soa.sibs.LNAccount.ACFDetail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Common Detail presence in either request or response message
 * 
 * <p>Java class for CommonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.bidv.com/common/envelope/commonheader/1.0}BusinessDomain"/>
 *         &lt;element ref="{http://www.bidv.com/common/envelope/commonheader/1.0}ServiceVersion"/>
 *         &lt;element name="MessageId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.bidv.com/common/envelope/commonheader/1.0}TransactionId" minOccurs="0"/>
 *         &lt;element name="RequestRefDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.bidv.com/common/envelope/commonheader/1.0}MessageTimestamp"/>
 *         &lt;element ref="{http://www.bidv.com/common/envelope/commonheader/1.0}AdditionalInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonType", namespace = "http://www.bidv.com/common/envelope/commonheader/1.0", propOrder = {
    "businessDomain",
    "serviceVersion",
    "messageId",
    "transactionId",
    "requestRefDate",
    "messageTimestamp",
    "additionalInformation"
})
public class CommonType {

    @XmlElement(name = "BusinessDomain", required = true)
    protected String businessDomain;
    @XmlElement(name = "ServiceVersion", required = true)
    protected String serviceVersion;
    @XmlElement(name = "MessageId", required = true)
    protected String messageId;
    @XmlElement(name = "TransactionId")
    protected String transactionId;
    @XmlElement(name = "RequestRefDate")
    protected String requestRefDate;
    @XmlElement(name = "MessageTimestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar messageTimestamp;
    @XmlElement(name = "AdditionalInformation")
    protected AdditionalInformationType additionalInformation;

    /**
     * Gets the value of the businessDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessDomain() {
        return businessDomain;
    }

    /**
     * Sets the value of the businessDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessDomain(String value) {
        this.businessDomain = value;
    }

    /**
     * Gets the value of the serviceVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceVersion() {
        return serviceVersion;
    }

    /**
     * Sets the value of the serviceVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceVersion(String value) {
        this.serviceVersion = value;
    }

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the requestRefDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestRefDate() {
        return requestRefDate;
    }

    /**
     * Sets the value of the requestRefDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestRefDate(String value) {
        this.requestRefDate = value;
    }

    /**
     * Gets the value of the messageTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMessageTimestamp() {
        return messageTimestamp;
    }

    /**
     * Sets the value of the messageTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMessageTimestamp(XMLGregorianCalendar value) {
        this.messageTimestamp = value;
    }

    /**
     * Additional information that is not  provided by standard header can be extended with Other element
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInformationType }
     *     
     */
    public AdditionalInformationType getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Sets the value of the additionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInformationType }
     *     
     */
    public void setAdditionalInformation(AdditionalInformationType value) {
        this.additionalInformation = value;
    }

}
