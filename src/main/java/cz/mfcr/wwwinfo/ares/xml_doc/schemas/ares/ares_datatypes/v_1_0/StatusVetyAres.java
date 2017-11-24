//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.24 at 01:02:52 PM CET 
//


package cz.mfcr.wwwinfo.ares.xml_doc.schemas.ares.ares_datatypes.v_1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for status_vety_ares.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="status_vety_ares">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="Z"/>
 *     &lt;enumeration value="N"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "status_vety_ares")
@XmlEnum
public enum StatusVetyAres {


    /**
     * aktuálně platný záznam u ekonomického subjektu
     * 
     */
    A,

    /**
     * ekonomický subjekt u daného záznamu je zaniklý
     * 
     */
    Z,

    /**
     * status věty neuveden
     * 
     */
    N;

    public String value() {
        return name();
    }

    public static StatusVetyAres fromValue(String v) {
        return valueOf(v);
    }

}
