//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vBeta 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.08.09 at 03:05:30 SGT 
//


package sparrow.elt.jaxb;


/**
 * The following schema fragment specifies the expected content contained within this java content object.
 * <p>
 * <pre>
 * &lt;complexType name="SERVICEType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PARAM" type="{}PARAMType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="APP-NOTIFICATION" default="true" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CYCLE-NOTIFICATION" default="true" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="DEPENDS" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NAME" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CLASS" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface SERVICEType {


    String getTYPE();

    void setTYPE(String value);

    java.util.List getPARAM();

    String getCLASS();

    void setCLASS(String value);

    boolean isCYCLENOTIFICATION();

    void setCYCLENOTIFICATION(boolean value);

    String getNAME();

    void setNAME(String value);

    boolean isAPPNOTIFICATION();

    void setAPPNOTIFICATION(boolean value);

    String getDEPENDS();

    void setDEPENDS(String value);

}
