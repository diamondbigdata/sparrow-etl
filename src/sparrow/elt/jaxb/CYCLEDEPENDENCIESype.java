//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.20 at 07:57:22 AM SGT 
//


package sparrow.elt.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CYCLEDEPENDENCIESype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CYCLEDEPENDENCIESype">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ASSERTER" type="{}ASSERTERype" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CYCLEDEPENDENCIESype", propOrder = {
    "asserter"
})
public class CYCLEDEPENDENCIESype {

    @XmlElement(name = "ASSERTER", required = true)
    protected List<ASSERTERype> asserter;

    /**
     * Gets the value of the asserter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asserter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getASSERTER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ASSERTERype }
     * 
     * 
     */
    public List<ASSERTERype> getASSERTER() {
        if (asserter == null) {
            asserter = new ArrayList<ASSERTERype>();
        }
        return this.asserter;
    }

}
