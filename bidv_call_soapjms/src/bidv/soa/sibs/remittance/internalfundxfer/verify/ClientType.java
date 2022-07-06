//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.06 at 02:26:55 PM ICT 
//


package bidv.soa.sibs.remittance.internalfundxfer.verify;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClientType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClientType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.bidv.com/common/envelope/commonheader/1.0}SourceAppID"/>
 *         &lt;element ref="{http://www.bidv.com/common/envelope/commonheader/1.0}TargetAppIDs" minOccurs="0"/>
 *         &lt;element ref="{http://www.bidv.com/common/envelope/commonheader/1.0}UserDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientType", propOrder = {
    "sourceAppID",
    "targetAppIDs",
    "userDetail"
})
public class ClientType {

    @XmlElement(name = "SourceAppID", required = true)
    protected String sourceAppID;
    @XmlElement(name = "TargetAppIDs")
    protected TargetAppIDs targetAppIDs;
    @XmlElement(name = "UserDetail")
    protected UserDetail userDetail;

    /**
     * Gets the value of the sourceAppID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceAppID() {
        return sourceAppID;
    }

    /**
     * Sets the value of the sourceAppID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceAppID(String value) {
        this.sourceAppID = value;
    }

    /**
     * Gets the value of the targetAppIDs property.
     * 
     * @return
     *     possible object is
     *     {@link TargetAppIDs }
     *     
     */
    public TargetAppIDs getTargetAppIDs() {
        return targetAppIDs;
    }

    /**
     * Sets the value of the targetAppIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetAppIDs }
     *     
     */
    public void setTargetAppIDs(TargetAppIDs value) {
        this.targetAppIDs = value;
    }

    /**
     * Gets the value of the userDetail property.
     * 
     * @return
     *     possible object is
     *     {@link UserDetail }
     *     
     */
    public UserDetail getUserDetail() {
        return userDetail;
    }

    /**
     * Sets the value of the userDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDetail }
     *     
     */
    public void setUserDetail(UserDetail value) {
        this.userDetail = value;
    }

}