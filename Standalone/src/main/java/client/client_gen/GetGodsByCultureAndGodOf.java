
package client_gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getGodsByCultureAndGodOf complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getGodsByCultureAndGodOf">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="culture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="god_of" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGodsByCultureAndGodOf", propOrder = {
    "culture",
    "godOf"
})
public class GetGodsByCultureAndGodOf {

    protected String culture;
    @XmlElement(name = "god_of")
    protected String godOf;

    /**
     * Gets the value of the culture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCulture() {
        return culture;
    }

    /**
     * Sets the value of the culture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCulture(String value) {
        this.culture = value;
    }

    /**
     * Gets the value of the godOf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGodOf() {
        return godOf;
    }

    /**
     * Sets the value of the godOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGodOf(String value) {
        this.godOf = value;
    }

}
