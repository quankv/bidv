//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.08 at 05:36:10 PM ICT 
//


package bidv.soa.ach247.inquiry;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BodyResACHInquiryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BodyResACHInquiryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InterbankRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceiverName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceiverBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceiverBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BodyResACHInquiryType", namespace = "http://www.bidv.com/entity/vn/apps/ach/inquiry/1.0", propOrder = {
    "requestId",
    "interbankRef",
    "serviceChannel",
    "receiverName",
    "receiverBank",
    "receiverBankName"
})
public class BodyResACHInquiryType {

    @XmlElement(name = "RequestId")
    protected String requestId;
    @XmlElement(name = "InterbankRef")
    protected String interbankRef;
    @XmlElement(name = "ServiceChannel")
    protected String serviceChannel;
    @XmlElement(name = "ReceiverName")
    protected String receiverName;
    @XmlElement(name = "ReceiverBank")
    protected String receiverBank;
    @XmlElement(name = "ReceiverBankName")
    protected String receiverBankName;

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the interbankRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterbankRef() {
        return interbankRef;
    }

    /**
     * Sets the value of the interbankRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterbankRef(String value) {
        this.interbankRef = value;
    }

    /**
     * Gets the value of the serviceChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceChannel() {
        return serviceChannel;
    }

    /**
     * Sets the value of the serviceChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceChannel(String value) {
        this.serviceChannel = value;
    }

    /**
     * Gets the value of the receiverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * Sets the value of the receiverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverName(String value) {
        this.receiverName = value;
    }

    /**
     * Gets the value of the receiverBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverBank() {
        return receiverBank;
    }

    /**
     * Sets the value of the receiverBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverBank(String value) {
        this.receiverBank = value;
    }

    /**
     * Gets the value of the receiverBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverBankName() {
        return receiverBankName;
    }

    /**
     * Sets the value of the receiverBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverBankName(String value) {
        this.receiverBankName = value;
    }

}
