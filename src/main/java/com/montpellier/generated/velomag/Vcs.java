//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.11 at 11:27:35 AM CET 
//


package com.montpellier.generated.velomag;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sl">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="si" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="na" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="la" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="lg" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="av" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="fr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="to" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sl"
})
@XmlRootElement(name = "vcs")
public class Vcs {

    @XmlElement(required = true)
    protected Vcs.Sl sl;
    @XmlAttribute(name = "ver", required = true)
    @XmlSchemaType(name = "unsignedByte")
    protected short ver;

    /**
     * Gets the value of the sl property.
     * 
     * @return
     *     possible object is
     *     {@link Vcs.Sl }
     *     
     */
    public Vcs.Sl getSl() {
        return sl;
    }

    /**
     * Sets the value of the sl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vcs.Sl }
     *     
     */
    public void setSl(Vcs.Sl value) {
        this.sl = value;
    }

    /**
     * Gets the value of the ver property.
     * 
     */
    public short getVer() {
        return ver;
    }

    /**
     * Sets the value of the ver property.
     * 
     */
    public void setVer(short value) {
        this.ver = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="si" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="na" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="la" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="lg" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="av" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="fr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="to" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "si"
    })
    public static class Sl {

        @XmlElement(required = true)
        protected List<Vcs.Sl.Si> si;

        /**
         * Gets the value of the si property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the si property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSi().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Vcs.Sl.Si }
         * 
         * 
         */
        public List<Vcs.Sl.Si> getSi() {
            if (si == null) {
                si = new ArrayList<Vcs.Sl.Si>();
            }
            return this.si;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="na" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="la" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="lg" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="av" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="fr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="to" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Si {

            @XmlAttribute(name = "na", required = true)
            protected String na;
            @XmlAttribute(name = "id", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short id;
            @XmlAttribute(name = "la", required = true)
            protected BigDecimal la;
            @XmlAttribute(name = "lg", required = true)
            protected BigDecimal lg;
            @XmlAttribute(name = "av", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short av;
            @XmlAttribute(name = "fr", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short fr;
            @XmlAttribute(name = "to", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short to;

            /**
             * Gets the value of the na property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNa() {
                return na;
            }

            /**
             * Sets the value of the na property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNa(String value) {
                this.na = value;
            }

            /**
             * Gets the value of the id property.
             * 
             */
            public short getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             */
            public void setId(short value) {
                this.id = value;
            }

            /**
             * Gets the value of the la property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getLa() {
                return la;
            }

            /**
             * Sets the value of the la property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setLa(BigDecimal value) {
                this.la = value;
            }

            /**
             * Gets the value of the lg property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getLg() {
                return lg;
            }

            /**
             * Sets the value of the lg property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setLg(BigDecimal value) {
                this.lg = value;
            }

            /**
             * Gets the value of the av property.
             * 
             */
            public short getAv() {
                return av;
            }

            /**
             * Sets the value of the av property.
             * 
             */
            public void setAv(short value) {
                this.av = value;
            }

            /**
             * Gets the value of the fr property.
             * 
             */
            public short getFr() {
                return fr;
            }

            /**
             * Sets the value of the fr property.
             * 
             */
            public void setFr(short value) {
                this.fr = value;
            }

            /**
             * Gets the value of the to property.
             * 
             */
            public short getTo() {
                return to;
            }

            /**
             * Sets the value of the to property.
             * 
             */
            public void setTo(short value) {
                this.to = value;
            }

        }

    }

}
