//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.06 at 03:48:53 PM ICT 
//


package bidv.soa.sibs.remittance.GLCashwithdraw.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BodyReqCreateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BodyReqCreateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MsgCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BaseXfer" type="{http://www.bidv.com/global/common/bank/1.0}BaseXferType"/>
 *         &lt;element name="ReceiverInfo" type="{http://www.bidv.com/entity/vn/remittance/glcashwithdraw/create/1.0}ReceiverInfoType" minOccurs="0"/>
 *         &lt;element name="SenderInfo" type="{http://www.bidv.com/entity/vn/remittance/glcashwithdraw/create/1.0}SenderInfoType" minOccurs="0"/>
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BodyReqCreateType", namespace = "http://www.bidv.com/entity/vn/remittance/glcashwithdraw/create/1.0", propOrder = {
    "msgCode",
    "baseXfer",
    "receiverInfo",
    "senderInfo",
    "remark"
})
public class BodyReqCreateType {

    @XmlElement(name = "MsgCode", required = true)
    protected String msgCode;
    @XmlElement(name = "BaseXfer", required = true)
    protected BaseXferType baseXfer;
    @XmlElement(name = "ReceiverInfo")
    protected ReceiverInfoType receiverInfo;
    @XmlElement(name = "SenderInfo")
    protected SenderInfoType senderInfo;
    @XmlElement(name = "Remark", required = true)
    protected String remark;

    /**
     * Gets the value of the msgCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgCode() {
        return msgCode;
    }

    /**
     * Sets the value of the msgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgCode(String value) {
        this.msgCode = value;
    }

    /**
     * Gets the value of the baseXfer property.
     * 
     * @return
     *     possible object is
     *     {@link BaseXferType }
     *     
     */
    public BaseXferType getBaseXfer() {
        return baseXfer;
    }

    /**
     * Sets the value of the baseXfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseXferType }
     *     
     */
    public void setBaseXfer(BaseXferType value) {
        this.baseXfer = value;
    }

    /**
     * Gets the value of the receiverInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiverInfoType }
     *     
     */
    public ReceiverInfoType getReceiverInfo() {
        return receiverInfo;
    }

    /**
     * Sets the value of the receiverInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiverInfoType }
     *     
     */
    public void setReceiverInfo(ReceiverInfoType value) {
        this.receiverInfo = value;
    }

    /**
     * Gets the value of the senderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SenderInfoType }
     *     
     */
    public SenderInfoType getSenderInfo() {
        return senderInfo;
    }

    /**
     * Sets the value of the senderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SenderInfoType }
     *     
     */
    public void setSenderInfo(SenderInfoType value) {
        this.senderInfo = value;
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

}
