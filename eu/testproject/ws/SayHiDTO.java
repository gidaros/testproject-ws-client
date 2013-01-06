
package eu.testproject.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sayHiDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sayHiDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="testBoolean" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sayHiDTO", propOrder = {
    "hi",
    "testBoolean"
})
public class SayHiDTO {

    protected String hi;
    protected boolean testBoolean;

    /**
     * Gets the value of the hi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHi() {
        return hi;
    }

    /**
     * Sets the value of the hi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHi(String value) {
        this.hi = value;
    }

    /**
     * Gets the value of the testBoolean property.
     * 
     */
    public boolean isTestBoolean() {
        return testBoolean;
    }

    /**
     * Sets the value of the testBoolean property.
     * 
     */
    public void setTestBoolean(boolean value) {
        this.testBoolean = value;
    }

}
