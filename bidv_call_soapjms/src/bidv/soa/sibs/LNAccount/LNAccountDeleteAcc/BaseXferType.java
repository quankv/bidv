//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.08 at 04:49:21 PM ICT 
//


package bidv.soa.sibs.LNAccount.LNAccountDeleteAcc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseXferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseXferType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TellerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Seq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupervisorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SvrBranch" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseXferType", propOrder = {
    "tellerId",
    "seq",
    "supervisorId",
    "svrBranch"
})
public class BaseXferType {

    @XmlElement(name = "TellerId")
    protected String tellerId;
    @XmlElement(name = "Seq")
    protected String seq;
    @XmlElement(name = "SupervisorId")
    protected String supervisorId;
    @XmlElement(name = "SvrBranch", required = true)
    protected String svrBranch;

    /**
     * Gets the value of the tellerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTellerId() {
        return tellerId;
    }

    /**
     * Sets the value of the tellerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTellerId(String value) {
        this.tellerId = value;
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
     * Gets the value of the supervisorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupervisorId() {
        return supervisorId;
    }

    /**
     * Sets the value of the supervisorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupervisorId(String value) {
        this.supervisorId = value;
    }

    /**
     * Gets the value of the svrBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvrBranch() {
        return svrBranch;
    }

    /**
     * Sets the value of the svrBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvrBranch(String value) {
        this.svrBranch = value;
    }

}
