//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.08 at 05:07:35 PM ICT 
//


package bidv.soa.sibs.LNAccount.DisbValueDateFile;

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
 *         &lt;element name="MoreRecords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rownum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MainAcctNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MainAcctType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ValueDate7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PartAcctNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PartAcctType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ValueDate6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LoanAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AmtRelease" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgRelAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NextExpRelease" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Process" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BodyResType", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/disbvaluedatefile/1.0", propOrder = {
    "moreRecords",
    "rownum",
    "data"
})
public class BodyResType {

    @XmlElement(name = "MoreRecords")
    protected String moreRecords;
    @XmlElement(name = "Rownum")
    protected String rownum;
    @XmlElement(name = "Data")
    protected List<BodyResType.Data> data;

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
     * Gets the value of the rownum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRownum() {
        return rownum;
    }

    /**
     * Sets the value of the rownum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRownum(String value) {
        this.rownum = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="MainAcctNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MainAcctType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ValueDate7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PartAcctNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PartAcctType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ValueDate6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LoanAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AmtRelease" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgRelAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NextExpRelease" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Process" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mainAcctNo",
        "mainAcctType",
        "valueDate7",
        "partAcctNo",
        "partAcctType",
        "valueDate6",
        "loanAmt",
        "amtRelease",
        "orgRelAmt",
        "nextExpRelease",
        "process",
        "shortName"
    })
    public static class Data {

        @XmlElement(name = "MainAcctNo", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/disbvaluedatefile/1.0")
        protected String mainAcctNo;
        @XmlElement(name = "MainAcctType", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/disbvaluedatefile/1.0")
        protected String mainAcctType;
        @XmlElement(name = "ValueDate7", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/disbvaluedatefile/1.0")
        protected String valueDate7;
        @XmlElement(name = "PartAcctNo", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/disbvaluedatefile/1.0")
        protected String partAcctNo;
        @XmlElement(name = "PartAcctType", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/disbvaluedatefile/1.0")
        protected String partAcctType;
        @XmlElement(name = "ValueDate6", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/disbvaluedatefile/1.0")
        protected String valueDate6;
        @XmlElement(name = "LoanAmt", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/disbvaluedatefile/1.0")
        protected String loanAmt;
        @XmlElement(name = "AmtRelease", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/disbvaluedatefile/1.0")
        protected String amtRelease;
        @XmlElement(name = "OrgRelAmt", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/disbvaluedatefile/1.0")
        protected String orgRelAmt;
        @XmlElement(name = "NextExpRelease", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/disbvaluedatefile/1.0")
        protected String nextExpRelease;
        @XmlElement(name = "Process", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/disbvaluedatefile/1.0")
        protected String process;
        @XmlElement(name = "ShortName", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/disbvaluedatefile/1.0")
        protected String shortName;

        /**
         * Gets the value of the mainAcctNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMainAcctNo() {
            return mainAcctNo;
        }

        /**
         * Sets the value of the mainAcctNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMainAcctNo(String value) {
            this.mainAcctNo = value;
        }

        /**
         * Gets the value of the mainAcctType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMainAcctType() {
            return mainAcctType;
        }

        /**
         * Sets the value of the mainAcctType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMainAcctType(String value) {
            this.mainAcctType = value;
        }

        /**
         * Gets the value of the valueDate7 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValueDate7() {
            return valueDate7;
        }

        /**
         * Sets the value of the valueDate7 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValueDate7(String value) {
            this.valueDate7 = value;
        }

        /**
         * Gets the value of the partAcctNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPartAcctNo() {
            return partAcctNo;
        }

        /**
         * Sets the value of the partAcctNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPartAcctNo(String value) {
            this.partAcctNo = value;
        }

        /**
         * Gets the value of the partAcctType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPartAcctType() {
            return partAcctType;
        }

        /**
         * Sets the value of the partAcctType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPartAcctType(String value) {
            this.partAcctType = value;
        }

        /**
         * Gets the value of the valueDate6 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValueDate6() {
            return valueDate6;
        }

        /**
         * Sets the value of the valueDate6 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValueDate6(String value) {
            this.valueDate6 = value;
        }

        /**
         * Gets the value of the loanAmt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLoanAmt() {
            return loanAmt;
        }

        /**
         * Sets the value of the loanAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLoanAmt(String value) {
            this.loanAmt = value;
        }

        /**
         * Gets the value of the amtRelease property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAmtRelease() {
            return amtRelease;
        }

        /**
         * Sets the value of the amtRelease property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAmtRelease(String value) {
            this.amtRelease = value;
        }

        /**
         * Gets the value of the orgRelAmt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgRelAmt() {
            return orgRelAmt;
        }

        /**
         * Sets the value of the orgRelAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgRelAmt(String value) {
            this.orgRelAmt = value;
        }

        /**
         * Gets the value of the nextExpRelease property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNextExpRelease() {
            return nextExpRelease;
        }

        /**
         * Sets the value of the nextExpRelease property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNextExpRelease(String value) {
            this.nextExpRelease = value;
        }

        /**
         * Gets the value of the process property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProcess() {
            return process;
        }

        /**
         * Sets the value of the process property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProcess(String value) {
            this.process = value;
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

    }

}
