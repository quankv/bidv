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
 * <p>Java class for RevertInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RevertInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrgSeq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsRevert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevertInfoType", namespace = "http://www.bidv.com/global/common/bank/1.0", propOrder = {
    "orgSeq",
    "isRevert"
})
public class RevertInfoType {

    @XmlElement(name = "OrgSeq")
    protected String orgSeq;
    @XmlElement(name = "IsRevert")
    protected String isRevert;

    /**
     * Gets the value of the orgSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgSeq() {
        return orgSeq;
    }

    /**
     * Sets the value of the orgSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgSeq(String value) {
        this.orgSeq = value;
    }

    /**
     * Gets the value of the isRevert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsRevert() {
        return isRevert;
    }

    /**
     * Sets the value of the isRevert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsRevert(String value) {
        this.isRevert = value;
    }

}
