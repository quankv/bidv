//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.17 at 09:22:32 AM ICT 
//


package soa.apps.ecm.digitizationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EcmDigitizationServiceReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EcmDigitizationServiceReqType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bidv.com/common/envelope/serviceenvelope/1.0}BaseServiceEnvelopeRequestType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.bidv.com/global/vn/apps/ecm/ecmdigitizationservice/1.0}BodyReqEcmDigitizationService"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "EcmDigitizationServiceReq", namespace = "http://www.bidv.com/global/vn/apps/ecm/ecmdigitizationservice/1.0")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EcmDigitizationServiceReqType", namespace = "http://www.bidv.com/global/vn/apps/ecm/ecmdigitizationservice/1.0", propOrder = {
    "bodyReqEcmDigitizationService"
})
public class EcmDigitizationServiceReqType
    extends BaseServiceEnvelopeRequestType
{

    @XmlElement(name = "BodyReqEcmDigitizationService", required = true)
    protected BodyReqEcmDigitizationServiceType bodyReqEcmDigitizationService;

    /**
     * Gets the value of the bodyReqEcmDigitizationService property.
     * 
     * @return
     *     possible object is
     *     {@link BodyReqEcmDigitizationServiceType }
     *     
     */
    public BodyReqEcmDigitizationServiceType getBodyReqEcmDigitizationService() {
        return bodyReqEcmDigitizationService;
    }

    /**
     * Sets the value of the bodyReqEcmDigitizationService property.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyReqEcmDigitizationServiceType }
     *     
     */
    public void setBodyReqEcmDigitizationService(BodyReqEcmDigitizationServiceType value) {
        this.bodyReqEcmDigitizationService = value;
    }

}
