//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.08 at 02:47:43 PM ICT 
//


package bidv.soa.sibs.detailEntryHold;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BuyRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SaleRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChargeRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateInfoType", propOrder = {
    "buyRate",
    "saleRate",
    "chargeRate"
})
public class RateInfoType {

    @XmlElement(name = "BuyRate")
    protected String buyRate;
    @XmlElement(name = "SaleRate")
    protected String saleRate;
    @XmlElement(name = "ChargeRate")
    protected String chargeRate;

    /**
     * Gets the value of the buyRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyRate() {
        return buyRate;
    }

    /**
     * Sets the value of the buyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyRate(String value) {
        this.buyRate = value;
    }

    /**
     * Gets the value of the saleRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleRate() {
        return saleRate;
    }

    /**
     * Sets the value of the saleRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleRate(String value) {
        this.saleRate = value;
    }

    /**
     * Gets the value of the chargeRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeRate() {
        return chargeRate;
    }

    /**
     * Sets the value of the chargeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeRate(String value) {
        this.chargeRate = value;
    }

}
