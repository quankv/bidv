//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.08 at 05:07:35 PM ICT 
//


package bidv.soa.sibs.LNAccount.DisbValueDateFile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseStatusErroInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseStatusErroInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.bidv.com/common/envelope/commonheader/1.0}SourceAppID"/>
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ErrorDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseStatusErroInfoType", namespace = "http://www.bidv.com/common/envelope/commonheader/1.0", propOrder = {
    "sourceAppID",
    "errorCode",
    "errorDesc"
})
public class ResponseStatusErroInfoType {

    @XmlElement(name = "SourceAppID", required = true)
    protected String sourceAppID;
    @XmlElement(name = "ErrorCode", required = true)
    protected String errorCode;
    @XmlElement(name = "ErrorDesc", required = true)
    protected String errorDesc;

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
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDesc() {
        return errorDesc;
    }

    /**
     * Sets the value of the errorDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDesc(String value) {
        this.errorDesc = value;
    }

}
