//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.08 at 04:58:26 PM ICT 
//


package bidv.soa.sibs.LNAccount.RestructAuthLimit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www.bidv.com/common/envelope/commonheader/1.0}UserId" minOccurs="0"/>
 *         &lt;element ref="{http://www.bidv.com/common/envelope/commonheader/1.0}UserRole" minOccurs="0"/>
 *         &lt;element ref="{http://www.bidv.com/common/envelope/commonheader/1.0}UserPassword" minOccurs="0"/>
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
    "userId",
    "userRole",
    "userPassword"
})
@XmlRootElement(name = "UserDetail", namespace = "http://www.bidv.com/common/envelope/commonheader/1.0")
public class UserDetail {

    @XmlElement(name = "UserId", namespace = "http://www.bidv.com/common/envelope/commonheader/1.0")
    protected String userId;
    @XmlElement(name = "UserRole", namespace = "http://www.bidv.com/common/envelope/commonheader/1.0")
    protected String userRole;
    @XmlElement(name = "UserPassword", namespace = "http://www.bidv.com/common/envelope/commonheader/1.0")
    protected byte[] userPassword;

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the userRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserRole() {
        return userRole;
    }

    /**
     * Sets the value of the userRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserRole(String value) {
        this.userRole = value;
    }

    /**
     * Gets the value of the userPassword property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getUserPassword() {
        return userPassword;
    }

    /**
     * Sets the value of the userPassword property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setUserPassword(byte[] value) {
        this.userPassword = value;
    }

}
