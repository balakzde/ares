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
 * <p>Java class for konkurz_vyrovnani_CEU.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="konkurz_vyrovnani_CEU">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="K"/>
 *     &lt;enumeration value="V"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "konkurz_vyrovnani_CEU")
@XmlEnum
public enum KonkurzVyrovnaniCEU {

    K,
    V;

    public String value() {
        return name();
    }

    public static KonkurzVyrovnaniCEU fromValue(String v) {
        return valueOf(v);
    }

}
