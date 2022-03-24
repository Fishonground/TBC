
package client_gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getGodsByGodOf complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getGodsByGodOf">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "getGodsByGodOf", propOrder = {
    "godOf"
})
public class GetGodsByGodOf {

    @XmlElement(name = "god_of")
    protected String godOf;

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
