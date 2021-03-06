//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.24 at 01:02:52 PM CET 
//


package cz.mfcr.wwwinfo.ares.xml_doc.schemas.ares.ares_datatypes.v_1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typ_CNS.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typ_CNS">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Církev"/>
 *     &lt;enumeration value="Svaz"/>
 *     &lt;enumeration value="Právnická osoba"/>
 *     &lt;enumeration value="Církevní právnická osoba"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typ_CNS")
@XmlEnum
public enum TypCNS {

    @XmlEnumValue("C\u00edrkev")
    CÍRKEV("C\u00edrkev"),
    @XmlEnumValue("Svaz")
    SVAZ("Svaz"),
    @XmlEnumValue("Pr\u00e1vnick\u00e1 osoba")
    PRÁVNICKÁ_OSOBA("Pr\u00e1vnick\u00e1 osoba"),
    @XmlEnumValue("C\u00edrkevn\u00ed pr\u00e1vnick\u00e1 osoba")
    CÍRKEVNÍ_PRÁVNICKÁ_OSOBA("C\u00edrkevn\u00ed pr\u00e1vnick\u00e1 osoba");
    private final String value;

    TypCNS(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypCNS fromValue(String v) {
        for (TypCNS c: TypCNS.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
