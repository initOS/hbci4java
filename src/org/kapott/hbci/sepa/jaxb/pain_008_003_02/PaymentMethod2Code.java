
package org.kapott.hbci.sepa.jaxb.pain_008_003_02;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMethod2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentMethod2Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentMethod2Code", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.008.003.02")
@XmlEnum
public enum PaymentMethod2Code {

    DD;

    public String value() {
        return name();
    }

    public static PaymentMethod2Code fromValue(String v) {
        return valueOf(v);
    }

}
