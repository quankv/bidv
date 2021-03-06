//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.08 at 05:02:00 PM ICT 
//


package bidv.soa.sibs.LNAccount.MasterAANoInq;

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
 *         &lt;element name="Data" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AANo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="IDTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CustName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Branch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ApplicationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Renewal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AcctNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FacName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACFNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Seq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CurrType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ProdType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AcctType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "BodyResType", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/masteraanoinq/1.0", propOrder = {
    "data",
    "total",
    "moreRecords"
})
public class BodyResType {

    @XmlElement(name = "Data")
    protected List<BodyResType.Data> data;
    @XmlElement(name = "Total")
    protected String total;
    @XmlElement(name = "MoreRecords")
    protected String moreRecords;

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
     *         &lt;element name="AANo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="IDTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CustName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Branch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ApplicationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Renewal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AcctNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FacName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACFNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Seq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CurrType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ProdType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AcctType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "aaNo",
        "shortName",
        "cif",
        "id",
        "idTypeCode",
        "custName1",
        "branch",
        "applicationDate",
        "renewal",
        "acctNo",
        "facName",
        "acfNo",
        "seq",
        "currType",
        "prodType",
        "acctType"
    })
    public static class Data {

        @XmlElement(name = "AANo", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/masteraanoinq/1.0")
        protected String aaNo;
        @XmlElement(name = "ShortName", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/masteraanoinq/1.0")
        protected String shortName;
        @XmlElement(name = "CIF", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/masteraanoinq/1.0")
        protected String cif;
        @XmlElement(name = "ID", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/masteraanoinq/1.0")
        protected String id;
        @XmlElement(name = "IDTypeCode", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/masteraanoinq/1.0")
        protected String idTypeCode;
        @XmlElement(name = "CustName1", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/masteraanoinq/1.0")
        protected String custName1;
        @XmlElement(name = "Branch", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/masteraanoinq/1.0")
        protected String branch;
        @XmlElement(name = "ApplicationDate", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/masteraanoinq/1.0")
        protected String applicationDate;
        @XmlElement(name = "Renewal", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/masteraanoinq/1.0")
        protected String renewal;
        @XmlElement(name = "AcctNo", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/masteraanoinq/1.0")
        protected String acctNo;
        @XmlElement(name = "FacName", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/masteraanoinq/1.0")
        protected String facName;
        @XmlElement(name = "ACFNo", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/masteraanoinq/1.0")
        protected String acfNo;
        @XmlElement(name = "Seq", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/masteraanoinq/1.0")
        protected String seq;
        @XmlElement(name = "CurrType", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/masteraanoinq/1.0")
        protected String currType;
        @XmlElement(name = "ProdType", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/masteraanoinq/1.0")
        protected String prodType;
        @XmlElement(name = "AcctType", namespace = "http://www.bidv.com/entity/vn/loan/lnaccount/masteraanoinq/1.0")
        protected String acctType;

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
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setID(String value) {
            this.id = value;
        }

        /**
         * Gets the value of the idTypeCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIDTypeCode() {
            return idTypeCode;
        }

        /**
         * Sets the value of the idTypeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIDTypeCode(String value) {
            this.idTypeCode = value;
        }

        /**
         * Gets the value of the custName1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustName1() {
            return custName1;
        }

        /**
         * Sets the value of the custName1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustName1(String value) {
            this.custName1 = value;
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
         * Gets the value of the applicationDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApplicationDate() {
            return applicationDate;
        }

        /**
         * Sets the value of the applicationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApplicationDate(String value) {
            this.applicationDate = value;
        }

        /**
         * Gets the value of the renewal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRenewal() {
            return renewal;
        }

        /**
         * Sets the value of the renewal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRenewal(String value) {
            this.renewal = value;
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
         * Gets the value of the facName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFacName() {
            return facName;
        }

        /**
         * Sets the value of the facName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFacName(String value) {
            this.facName = value;
        }

        /**
         * Gets the value of the acfNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACFNo() {
            return acfNo;
        }

        /**
         * Sets the value of the acfNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACFNo(String value) {
            this.acfNo = value;
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
         * Gets the value of the prodType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProdType() {
            return prodType;
        }

        /**
         * Sets the value of the prodType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProdType(String value) {
            this.prodType = value;
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

    }

}
