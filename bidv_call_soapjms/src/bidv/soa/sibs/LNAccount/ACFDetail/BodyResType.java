//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.06.27 at 01:49:16 PM ICT 
//


package bidv.soa.sibs.LNAccount.ACFDetail;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BodyResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BodyResType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AANo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Seq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AcctNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AcctType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LoanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PartCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AxAcctType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ODTierSeq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgBal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CurrType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RejectStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CurBal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NPL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Branch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AcctGroupNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DrawLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MoreRecords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BodyResType", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/acfdetail/1.0", propOrder = {
    "aaNo",
    "fac",
    "seq",
    "data",
    "total",
    "moreRecords"
})
public class BodyResType {

    @XmlElement(name = "AANo")
    protected String aaNo;
    @XmlElement(name = "Fac")
    protected String fac;
    @XmlElement(name = "Seq")
    protected String seq;
    @XmlElement(name = "Data")
    protected List<BodyResType.Data> data;
    @XmlElement(name = "Total")
    protected String total;
    @XmlElement(name = "MoreRecords")
    protected String moreRecords;

    /**
     * Gets the value of the aaNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAANo() {
        return aaNo;
    }

    /**
     * Sets the value of the aaNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAANo(String value) {
        this.aaNo = value;
    }

    /**
     * Gets the value of the fac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFac() {
        return fac;
    }

    /**
     * Sets the value of the fac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFac(String value) {
        this.fac = value;
    }

    /**
     * Gets the value of the seq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeq() {
        return seq;
    }

    /**
     * Sets the value of the seq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeq(String value) {
        this.seq = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the data property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BodyResType.Data }
     * 
     * 
     */
    public List<BodyResType.Data> getData() {
        if (data == null) {
            data = new ArrayList<BodyResType.Data>();
        }
        return this.data;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotal(String value) {
        this.total = value;
    }

    /**
     * Gets the value of the moreRecords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoreRecords() {
        return moreRecords;
    }

    /**
     * Sets the value of the moreRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoreRecords(String value) {
        this.moreRecords = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AcctNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AcctType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LoanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PartCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AxAcctType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ODTierSeq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgBal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CurrType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RejectStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CurBal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NPL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Branch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AcctGroupNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DrawLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "acctNo",
        "acctType",
        "loanType",
        "partCode",
        "axAcctType",
        "odTierSeq",
        "orgBal",
        "currType",
        "status",
        "rejectStatus",
        "curBal",
        "npl",
        "shortName",
        "cif",
        "branch",
        "acctGroupNo",
        "drawLimit"
    })
    public static class Data {

        @XmlElement(name = "AcctNo", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/acfdetail/1.0")
        protected String acctNo;
        @XmlElement(name = "AcctType", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/acfdetail/1.0")
        protected String acctType;
        @XmlElement(name = "LoanType", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/acfdetail/1.0")
        protected String loanType;
        @XmlElement(name = "PartCode", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/acfdetail/1.0")
        protected String partCode;
        @XmlElement(name = "AxAcctType", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/acfdetail/1.0")
        protected String axAcctType;
        @XmlElement(name = "ODTierSeq", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/acfdetail/1.0")
        protected String odTierSeq;
        @XmlElement(name = "OrgBal", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/acfdetail/1.0")
        protected String orgBal;
        @XmlElement(name = "CurrType", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/acfdetail/1.0")
        protected String currType;
        @XmlElement(name = "Status", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/acfdetail/1.0")
        protected String status;
        @XmlElement(name = "RejectStatus", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/acfdetail/1.0")
        protected String rejectStatus;
        @XmlElement(name = "CurBal", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/acfdetail/1.0")
        protected String curBal;
        @XmlElement(name = "NPL", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/acfdetail/1.0")
        protected String npl;
        @XmlElement(name = "ShortName", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/acfdetail/1.0")
        protected String shortName;
        @XmlElement(name = "CIF", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/acfdetail/1.0")
        protected String cif;
        @XmlElement(name = "Branch", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/acfdetail/1.0")
        protected String branch;
        @XmlElement(name = "AcctGroupNo", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/acfdetail/1.0")
        protected String acctGroupNo;
        @XmlElement(name = "DrawLimit", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/acfdetail/1.0")
        protected String drawLimit;

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
         * Gets the value of the loanType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLoanType() {
            return loanType;
        }

        /**
         * Sets the value of the loanType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLoanType(String value) {
            this.loanType = value;
        }

        /**
         * Gets the value of the partCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPartCode() {
            return partCode;
        }

        /**
         * Sets the value of the partCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPartCode(String value) {
            this.partCode = value;
        }

        /**
         * Gets the value of the axAcctType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAxAcctType() {
            return axAcctType;
        }

        /**
         * Sets the value of the axAcctType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAxAcctType(String value) {
            this.axAcctType = value;
        }

        /**
         * Gets the value of the odTierSeq property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getODTierSeq() {
            return odTierSeq;
        }

        /**
         * Sets the value of the odTierSeq property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setODTierSeq(String value) {
            this.odTierSeq = value;
        }

        /**
         * Gets the value of the orgBal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgBal() {
            return orgBal;
        }

        /**
         * Sets the value of the orgBal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgBal(String value) {
            this.orgBal = value;
        }

        /**
         * Gets the value of the currType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrType() {
            return currType;
        }

        /**
         * Sets the value of the currType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrType(String value) {
            this.currType = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

        /**
         * Gets the value of the rejectStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRejectStatus() {
            return rejectStatus;
        }

        /**
         * Sets the value of the rejectStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRejectStatus(String value) {
            this.rejectStatus = value;
        }

        /**
         * Gets the value of the curBal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurBal() {
            return curBal;
        }

        /**
         * Sets the value of the curBal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurBal(String value) {
            this.curBal = value;
        }

        /**
         * Gets the value of the npl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNPL() {
            return npl;
        }

        /**
         * Sets the value of the npl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNPL(String value) {
            this.npl = value;
        }

        /**
         * Gets the value of the shortName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShortName() {
            return shortName;
        }

        /**
         * Sets the value of the shortName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShortName(String value) {
            this.shortName = value;
        }

        /**
         * Gets the value of the cif property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCIF() {
            return cif;
        }

        /**
         * Sets the value of the cif property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCIF(String value) {
            this.cif = value;
        }

        /**
         * Gets the value of the branch property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBranch() {
            return branch;
        }

        /**
         * Sets the value of the branch property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBranch(String value) {
            this.branch = value;
        }

        /**
         * Gets the value of the acctGroupNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAcctGroupNo() {
            return acctGroupNo;
        }

        /**
         * Sets the value of the acctGroupNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAcctGroupNo(String value) {
            this.acctGroupNo = value;
        }

        /**
         * Gets the value of the drawLimit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDrawLimit() {
            return drawLimit;
        }

        /**
         * Sets the value of the drawLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDrawLimit(String value) {
            this.drawLimit = value;
        }

    }

}
