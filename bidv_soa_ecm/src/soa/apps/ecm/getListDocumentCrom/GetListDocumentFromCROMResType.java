//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.01 at 11:10:19 AM ICT 
//


package soa.apps.ecm.getListDocumentCrom;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetListDocumentFromCROMResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetListDocumentFromCROMResType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bidv.com/common/envelope/serviceenvelope/1.0}BaseServiceEnvelopeResponseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.bidv.com/global/vn/apps/ecm/getlistdocumentfromcrom/1.0}BodyResGetListDocumentFromCROM"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "GetListDocumentFromCROMRes", namespace = "http://www.bidv.com/global/vn/apps/ecm/getlistdocumentfromcrom/1.0")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetListDocumentFromCROMResType", namespace = "http://www.bidv.com/global/vn/apps/ecm/getlistdocumentfromcrom/1.0", propOrder = {
    "bodyResGetListDocumentFromCROM"
})
public class GetListDocumentFromCROMResType
    extends BaseServiceEnvelopeResponseType
{

    @XmlElement(name = "BodyResGetListDocumentFromCROM", required = true)
    protected BodyResGetListDocumentFromCROMType bodyResGetListDocumentFromCROM;

    /**
     * Gets the value of the bodyResGetListDocumentFromCROM property.
     * 
     * @return
     *     possible object is
     *     {@link BodyResGetListDocumentFromCROMType }
     *     
     */
    public BodyResGetListDocumentFromCROMType getBodyResGetListDocumentFromCROM() {
        return bodyResGetListDocumentFromCROM;
    }

    /**
     * Sets the value of the bodyResGetListDocumentFromCROM property.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyResGetListDocumentFromCROMType }
     *     
     */
    public void setBodyResGetListDocumentFromCROM(BodyResGetListDocumentFromCROMType value) {
        this.bodyResGetListDocumentFromCROM = value;
    }

}
