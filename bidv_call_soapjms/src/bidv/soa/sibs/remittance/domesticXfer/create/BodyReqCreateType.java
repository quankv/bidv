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
 *         &lt;element name="BaseXfer" type="{http://www.bidv.com/global/common/bank/1.0}BaseXferType" minOccurs="0"/>
 *         &lt;element name="SenderInfo" type="{http://www.bidv.com/entity/vn/remittance/domesticxfer/create/1.0}CustXferInfoType" minOccurs="0"/>
 *         &lt;element name="ReceiverInfo" type="{http://www.bidv.com/entity/vn/remittance/domesticxfer/create/1.0}CustXferInfoType" minOccurs="0"/>
 *         &lt;element name="DebitFeeAcct" type="{http://www.bidv.com/global/common/account/1.0}AcctInfoType" minOccurs="0"/>
 *         &lt;element name="MedialBankInfo" type="{http://www.bidv.com/entity/vn/remittance/domesticxfer/create/1.0}MedialBankInfoType" minOccurs="0"/>
 *         &lt;element name="Amt" type="{http://www.bidv.com/global/common/account/1.0}AmtType"/>
 *         &lt;element name="FeeInfo" type="{http://www.bidv.com/entity/vn/remittance/domesticxfer/create/1.0}FeeInfoType" minOccurs="0"/>
 *         &lt;element name="VATInfo" type="{http://www.bidv.com/entity/vn/remittance/domesticxfer/create/1.0}VATInfo" minOccurs="0"/>
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StateTreasury" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MsgType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RMNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostingDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CtrlUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Purpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClosedSts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RemitterFee" type="{http://www.bidv.com/global/common/account/1.0}AmtType" minOccurs="0"/>
 *         &lt;element name="BeneFee" type="{http://www.bidv.com/global/common/account/1.0}AmtType" minOccurs="0"/>
 *         &lt;element name="RateInfo" type="{http://www.bidv.com/entity/vn/remittance/domesticxfer/create/1.0}RateInfoType" minOccurs="0"/>
 *         &lt;element name="RefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BodyReqCreateType", propOrder = {
    "msgCode",
    "baseXfer",
    "senderInfo",
    "receiverInfo",
    "debitFeeAcct",
    "medialBankInfo",
    "amt",
    "feeInfo",
    "vatInfo",
    "remark",
    "stateTreasury",
    "msgType",
    "rmNo",
    "postingDt",
    "ctrlUnit",
    "purpose",
    "closedSts",
    "remitterFee",
    "beneFee",
    "rateInfo",
    "refNo"
})
public class BodyReqCreateType {

    @XmlElement(name = "MsgCode", required = true)
    protected String msgCode;
    @XmlElement(name = "BaseXfer")
    protected BaseXferType baseXfer;
    @XmlElement(name = "SenderInfo")
    protected CustXferInfoType senderInfo;
    @XmlElement(name = "ReceiverInfo")
    protected CustXferInfoType receiverInfo;
    @XmlElement(name = "DebitFeeAcct")
    protected AcctInfoType debitFeeAcct;
    @XmlElement(name = "MedialBankInfo")
    protected MedialBankInfoType medialBankInfo;
    @XmlElement(name = "Amt", required = true)
    protected AmtType2 amt;
    @XmlElement(name = "FeeInfo")
    protected FeeInfoType feeInfo;
    @XmlElement(name = "VATInfo")
    protected VATInfo vatInfo;
    @XmlElement(name = "Remark", required = true)
    protected String remark;
    @XmlElement(name = "StateTreasury")
    protected String stateTreasury;
    @XmlElement(name = "MsgType")
    protected String msgType;
    @XmlElement(name = "RMNo")
    protected String rmNo;
    @XmlElement(name = "PostingDt")
    protected String postingDt;
    @XmlElement(name = "CtrlUnit")
    protected String ctrlUnit;
    @XmlElement(name = "Purpose")
    protected String purpose;
    @XmlElement(name = "ClosedSts")
    protected String closedSts;
    @XmlElement(name = "RemitterFee")
    protected AmtType remitterFee;
    @XmlElement(name = "BeneFee")
    protected AmtType beneFee;
    @XmlElement(name = "RateInfo")
    protected RateInfoType rateInfo;
    @XmlElement(name = "RefNo")
    protected String refNo;

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
     * Gets the value of the senderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustXferInfoType }
     *     
     */
    public CustXferInfoType getSenderInfo() {
        return senderInfo;
    }

    /**
     * Sets the value of the senderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustXferInfoType }
     *     
     */
    public void setSenderInfo(CustXferInfoType value) {
        this.senderInfo = value;
    }

    /**
     * Gets the value of the receiverInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustXferInfoType }
     *     
     */
    public CustXferInfoType getReceiverInfo() {
        return receiverInfo;
    }

    /**
     * Sets the value of the receiverInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustXferInfoType }
     *     
     */
    public void setReceiverInfo(CustXferInfoType value) {
        this.receiverInfo = value;
    }

    /**
     * Gets the value of the debitFeeAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AcctInfoType }
     *     
     */
    public AcctInfoType getDebitFeeAcct() {
        return debitFeeAcct;
    }

    /**
     * Sets the value of the debitFeeAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctInfoType }
     *     
     */
    public void setDebitFeeAcct(AcctInfoType value) {
        this.debitFeeAcct = value;
    }

    /**
     * Gets the value of the medialBankInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MedialBankInfoType }
     *     
     */
    public MedialBankInfoType getMedialBankInfo() {
        return medialBankInfo;
    }

    /**
     * Sets the value of the medialBankInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedialBankInfoType }
     *     
     */
    public void setMedialBankInfo(MedialBankInfoType value) {
        this.medialBankInfo = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link AmtType }
     *     
     */
    public AmtType2 getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmtType }
     *     
     */
    public void setAmt(AmtType2 value) {
        this.amt = value;
    }

    /**
     * Gets the value of the feeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FeeInfoType }
     *     
     */
    public FeeInfoType getFeeInfo() {
        return feeInfo;
    }

    /**
     * Sets the value of the feeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeInfoType }
     *     
     */
    public void setFeeInfo(FeeInfoType value) {
        this.feeInfo = value;
    }

    /**
     * Gets the value of the vatInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VATInfo }
     *     
     */
    public VATInfo getVATInfo() {
        return vatInfo;
    }

    /**
     * Sets the value of the vatInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VATInfo }
     *     
     */
    public void setVATInfo(VATInfo value) {
        this.vatInfo = value;
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
     * Gets the value of the stateTreasury property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateTreasury() {
        return stateTreasury;
    }

    /**
     * Sets the value of the stateTreasury property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateTreasury(String value) {
        this.stateTreasury = value;
    }

    /**
     * Gets the value of the msgType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * Sets the value of the msgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgType(String value) {
        this.msgType = value;
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

    /**
     * Gets the value of the ctrlUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrlUnit() {
        return ctrlUnit;
    }

    /**
     * Sets the value of the ctrlUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrlUnit(String value) {
        this.ctrlUnit = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the closedSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosedSts() {
        return closedSts;
    }

    /**
     * Sets the value of the closedSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosedSts(String value) {
        this.closedSts = value;
    }

    /**
     * Gets the value of the remitterFee property.
     * 
     * @return
     *     possible object is
     *     {@link AmtType }
     *     
     */
    public AmtType getRemitterFee() {
        return remitterFee;
    }

    /**
     * Sets the value of the remitterFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmtType }
     *     
     */
    public void setRemitterFee(AmtType value) {
        this.remitterFee = value;
    }

    /**
     * Gets the value of the beneFee property.
     * 
     * @return
     *     possible object is
     *     {@link AmtType }
     *     
     */
    public AmtType getBeneFee() {
        return beneFee;
    }

    /**
     * Sets the value of the beneFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmtType }
     *     
     */
    public void setBeneFee(AmtType value) {
        this.beneFee = value;
    }

    /**
     * Gets the value of the rateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RateInfoType }
     *     
     */
    public RateInfoType getRateInfo() {
        return rateInfo;
    }

    /**
     * Sets the value of the rateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateInfoType }
     *     
     */
    public void setRateInfo(RateInfoType value) {
        this.rateInfo = value;
    }

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

}
