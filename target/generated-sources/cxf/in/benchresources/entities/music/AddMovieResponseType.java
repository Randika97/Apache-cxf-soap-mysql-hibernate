
package in.benchresources.entities.music;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://benchresources.in/entities/music}BusinessFaultType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "businessFaultType"
})
@XmlRootElement(name = "AddMovieResponseType")
public class AddMovieResponseType {

    @XmlElement(name = "BusinessFaultType", required = true)
    protected BusinessFaultType businessFaultType;

    /**
     * Gets the value of the businessFaultType property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessFaultType }
     *     
     */
    public BusinessFaultType getBusinessFaultType() {
        return businessFaultType;
    }

    /**
     * Sets the value of the businessFaultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessFaultType }
     *     
     */
    public void setBusinessFaultType(BusinessFaultType value) {
        this.businessFaultType = value;
    }

}
