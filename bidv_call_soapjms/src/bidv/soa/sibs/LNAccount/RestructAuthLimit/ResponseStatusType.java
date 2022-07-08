//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.08 at 04:58:26 PM ICT 
//


package bidv.soa.sibs.LNAccount.RestructAuthLimit;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Additional response information for Response message
 * 
 * <p>Java class for ResponseStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GlobalErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlobalErrorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorInfo" type="{http://www.bidv.com/common/envelope/commonheader/1.0}ResponseStatusErroInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseStatusType", namespace = "http://www.bidv.com/common/envelope/commonheader/1.0", propOrder = {
    "status",
    "globalErrorCode",
    "globalErrorDescription",
    "errorInfo"
})
public class ResponseStatusType {

    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "GlobalErrorCode")
    protected String globalErrorCode;
    @XmlElement(name = "GlobalErrorDescription")
    protected String globalErrorDescription;
    @XmlElement(name = "ErrorInfo")
    protected List<ResponseStatusErroInfoType> errorInfo;

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
     * Gets the value of the globalErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalErrorCode() {
        return globalErrorCode;
    }

    /**
     * Sets the value of the globalErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalErrorCode(String value) {
        this.globalErrorCode = value;
    }

    /**
     * Gets the value of the globalErrorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalErrorDescription() {
        return globalErrorDescription;
    }

    /**
     * Sets the value of the globalErrorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalErrorDescription(String value) {
        this.globalErrorDescription = value;
    }

    /**
     * Gets the value of the errorInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseStatusErroInfoType }
     * 
     * 
     */
    public List<ResponseStatusErroInfoType> getErrorInfo() {
        if (errorInfo == null) {
            errorInfo = new ArrayList<ResponseStatusErroInfoType>();
        }
        return this.errorInfo;
    }

}
