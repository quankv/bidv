//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.08 at 05:02:00 PM ICT 
//


package bidv.soa.sibs.LNAccount.MasterAANoInq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BankNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BranchNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BranchName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankInfoType", propOrder = {
    "bankNo",
    "branchNo",
    "branchName"
})
public class BankInfoType {

    @XmlElement(name = "BankNo")
    protected String bankNo;
    @XmlElement(name = "BranchNo")
    protected String branchNo;
    @XmlElement(name = "BranchName")
    protected String branchName;

    /**
     * Gets the value of the bankNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankNo() {
        return bankNo;
    }

    /**
     * Sets the value of the bankNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankNo(String value) {
        this.bankNo = value;
    }

    /**
     * Gets the value of the branchNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchNo() {
        return branchNo;
    }

    /**
     * Sets the value of the branchNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchNo(String value) {
        this.branchNo = value;
    }

    /**
     * Gets the value of the branchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * Sets the value of the branchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchName(String value) {
        this.branchName = value;
    }

}
