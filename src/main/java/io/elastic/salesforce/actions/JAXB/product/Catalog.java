
package io.elastic.salesforce.actions.JAXB.product;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


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
 *         &lt;element name="header">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="image-settings">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="external-location">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="http-url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                                       &lt;element name="https-url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="view-types">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="view-type" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="alt-pattern" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="title-pattern" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="product" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ean" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="upc" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="min-order-quantity" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="step-quantity" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="display-name" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="short-description" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="long-description" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="online-flag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="searchable-flag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="images">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="image-group" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="image" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="view-type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="tax-class-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="search-placement" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="sitemap-included-flag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="page-attributes" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="page-title" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="page-description" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="page-keywords" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="page-url">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="custom-attributes">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="custom-attribute" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="attribute-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="product-id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="catalog-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "header",
    "product"
})
@XmlRootElement(name = "catalog", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31")
public class Catalog {

    @XmlElement(namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31", required = true)
    protected Catalog.Header header;
    @XmlElement(namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31")
    protected List<Catalog.Product> product;
    @XmlAttribute(name = "catalog-id")
    protected String catalogId;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link Catalog.Header }
     *     
     */
    public Catalog.Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link Catalog.Header }
     *     
     */
    public void setHeader(Catalog.Header value) {
        this.header = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the product property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Catalog.Product }
     * 
     * 
     */
    public List<Catalog.Product> getProduct() {
        if (product == null) {
            product = new ArrayList<Catalog.Product>();
        }
        return this.product;
    }

    /**
     * Gets the value of the catalogId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogId() {
        return catalogId;
    }

    /**
     * Sets the value of the catalogId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogId(String value) {
        this.catalogId = value;
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
     *         &lt;element name="image-settings">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="external-location">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="http-url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
     *                             &lt;element name="https-url" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="view-types">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="view-type" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="alt-pattern" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="title-pattern" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
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
        "imageSettings"
    })
    public static class Header {

        @XmlElement(name = "image-settings", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31", required = true)
        protected Catalog.Header.ImageSettings imageSettings;

        /**
         * Gets the value of the imageSettings property.
         * 
         * @return
         *     possible object is
         *     {@link Catalog.Header.ImageSettings }
         *     
         */
        public Catalog.Header.ImageSettings getImageSettings() {
            return imageSettings;
        }

        /**
         * Sets the value of the imageSettings property.
         * 
         * @param value
         *     allowed object is
         *     {@link Catalog.Header.ImageSettings }
         *     
         */
        public void setImageSettings(Catalog.Header.ImageSettings value) {
            this.imageSettings = value;
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
         *         &lt;element name="external-location">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="http-url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
         *                   &lt;element name="https-url" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="view-types">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="view-type" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="alt-pattern" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="title-pattern" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "externalLocation",
            "viewTypes",
            "altPattern",
            "titlePattern"
        })
        public static class ImageSettings {

            @XmlElement(name = "external-location", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31", required = true)
            protected Catalog.Header.ImageSettings.ExternalLocation externalLocation;
            @XmlElement(name = "view-types", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31", required = true)
            protected Catalog.Header.ImageSettings.ViewTypes viewTypes;
            @XmlElement(name = "alt-pattern", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31", required = true)
            protected String altPattern;
            @XmlElement(name = "title-pattern", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31", required = true)
            protected String titlePattern;

            /**
             * Gets the value of the externalLocation property.
             * 
             * @return
             *     possible object is
             *     {@link Catalog.Header.ImageSettings.ExternalLocation }
             *     
             */
            public Catalog.Header.ImageSettings.ExternalLocation getExternalLocation() {
                return externalLocation;
            }

            /**
             * Sets the value of the externalLocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link Catalog.Header.ImageSettings.ExternalLocation }
             *     
             */
            public void setExternalLocation(Catalog.Header.ImageSettings.ExternalLocation value) {
                this.externalLocation = value;
            }

            /**
             * Gets the value of the viewTypes property.
             * 
             * @return
             *     possible object is
             *     {@link Catalog.Header.ImageSettings.ViewTypes }
             *     
             */
            public Catalog.Header.ImageSettings.ViewTypes getViewTypes() {
                return viewTypes;
            }

            /**
             * Sets the value of the viewTypes property.
             * 
             * @param value
             *     allowed object is
             *     {@link Catalog.Header.ImageSettings.ViewTypes }
             *     
             */
            public void setViewTypes(Catalog.Header.ImageSettings.ViewTypes value) {
                this.viewTypes = value;
            }

            /**
             * Gets the value of the altPattern property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAltPattern() {
                return altPattern;
            }

            /**
             * Sets the value of the altPattern property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAltPattern(String value) {
                this.altPattern = value;
            }

            /**
             * Gets the value of the titlePattern property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTitlePattern() {
                return titlePattern;
            }

            /**
             * Sets the value of the titlePattern property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTitlePattern(String value) {
                this.titlePattern = value;
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
             *         &lt;element name="http-url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
             *         &lt;element name="https-url" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "httpUrl",
                "httpsUrl"
            })
            public static class ExternalLocation {

                @XmlElement(name = "http-url", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31", required = true)
                @XmlSchemaType(name = "anyURI")
                protected String httpUrl;
                @XmlElement(name = "https-url", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31", required = true)
                protected String httpsUrl;

                /**
                 * Gets the value of the httpUrl property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHttpUrl() {
                    return httpUrl;
                }

                /**
                 * Sets the value of the httpUrl property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHttpUrl(String value) {
                    this.httpUrl = value;
                }

                /**
                 * Gets the value of the httpsUrl property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHttpsUrl() {
                    return httpsUrl;
                }

                /**
                 * Sets the value of the httpsUrl property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHttpsUrl(String value) {
                    this.httpsUrl = value;
                }

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
             *         &lt;element name="view-type" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
                "viewType"
            })
            public static class ViewTypes {

                @XmlElement(name = "view-type", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31")
                protected List<String> viewType;

                /**
                 * Gets the value of the viewType property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the viewType property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getViewType().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getViewType() {
                    if (viewType == null) {
                        viewType = new ArrayList<String>();
                    }
                    return this.viewType;
                }

            }

        }

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
     *         &lt;element name="ean" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="upc" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="min-order-quantity" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="step-quantity" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="display-name" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="short-description" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="long-description" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="online-flag" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="searchable-flag" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="images">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="image-group" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="image" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="view-type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="tax-class-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="search-placement" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="sitemap-included-flag" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="page-attributes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="page-title" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="page-description" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="page-keywords" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="page-url">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="custom-attributes">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="custom-attribute" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="attribute-id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="product-id" type="{http://www.w3.org/2001/XMLSchema}long" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ean",
        "upc",
        "minOrderQuantity",
        "stepQuantity",
        "displayName",
        "shortDescription",
        "longDescription",
        "onlineFlag",
        "searchableFlag",
        "images",
        "taxClassId",
        "searchPlacement",
        "sitemapIncludedFlag",
        "pageAttributes",
        "customAttributes"
    })
    public static class Product {

        @XmlElement(namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31")
        protected long ean;
        @XmlElement(namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31")
        protected long upc;
        @XmlElement(name = "min-order-quantity", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31")
        protected byte minOrderQuantity;
        @XmlElement(name = "step-quantity", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31")
        protected byte stepQuantity;
        @XmlElement(name = "display-name", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31")
        protected List<Catalog.Product.DisplayName> displayName;
        @XmlElement(name = "short-description", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31")
        protected Catalog.Product.ShortDescription shortDescription;
        @XmlElement(name = "long-description", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31")
        protected Catalog.Product.LongDescription longDescription;
        @XmlElement(name = "online-flag", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31", required = true)
        protected String onlineFlag;
        @XmlElement(name = "searchable-flag", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31", required = true)
        protected String searchableFlag;
        @XmlElement(namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31", required = true)
        protected Catalog.Product.Images images;
        @XmlElement(name = "tax-class-id", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31", required = true)
        protected String taxClassId;
        @XmlElement(name = "search-placement", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31")
        protected byte searchPlacement;
        @XmlElement(name = "sitemap-included-flag", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31", required = true)
        protected String sitemapIncludedFlag;
        @XmlElement(name = "page-attributes", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31")
        protected Catalog.Product.PageAttributes pageAttributes;
        @XmlElement(name = "custom-attributes", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31", required = true)
        protected Catalog.Product.CustomAttributes customAttributes;
        @XmlAttribute(name = "product-id")
        protected Long productId;

        /**
         * Gets the value of the ean property.
         * 
         */
        public long getEan() {
            return ean;
        }

        /**
         * Sets the value of the ean property.
         * 
         */
        public void setEan(long value) {
            this.ean = value;
        }

        /**
         * Gets the value of the upc property.
         * 
         */
        public long getUpc() {
            return upc;
        }

        /**
         * Sets the value of the upc property.
         * 
         */
        public void setUpc(long value) {
            this.upc = value;
        }

        /**
         * Gets the value of the minOrderQuantity property.
         * 
         */
        public byte getMinOrderQuantity() {
            return minOrderQuantity;
        }

        /**
         * Sets the value of the minOrderQuantity property.
         * 
         */
        public void setMinOrderQuantity(byte value) {
            this.minOrderQuantity = value;
        }

        /**
         * Gets the value of the stepQuantity property.
         * 
         */
        public byte getStepQuantity() {
            return stepQuantity;
        }

        /**
         * Sets the value of the stepQuantity property.
         * 
         */
        public void setStepQuantity(byte value) {
            this.stepQuantity = value;
        }

        /**
         * Gets the value of the displayName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the displayName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDisplayName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Catalog.Product.DisplayName }
         * 
         * 
         */
        public List<Catalog.Product.DisplayName> getDisplayName() {
            if (displayName == null) {
                displayName = new ArrayList<Catalog.Product.DisplayName>();
            }
            return this.displayName;
        }

        /**
         * Gets the value of the shortDescription property.
         * 
         * @return
         *     possible object is
         *     {@link Catalog.Product.ShortDescription }
         *     
         */
        public Catalog.Product.ShortDescription getShortDescription() {
            return shortDescription;
        }

        /**
         * Sets the value of the shortDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link Catalog.Product.ShortDescription }
         *     
         */
        public void setShortDescription(Catalog.Product.ShortDescription value) {
            this.shortDescription = value;
        }

        /**
         * Gets the value of the longDescription property.
         * 
         * @return
         *     possible object is
         *     {@link Catalog.Product.LongDescription }
         *     
         */
        public Catalog.Product.LongDescription getLongDescription() {
            return longDescription;
        }

        /**
         * Sets the value of the longDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link Catalog.Product.LongDescription }
         *     
         */
        public void setLongDescription(Catalog.Product.LongDescription value) {
            this.longDescription = value;
        }

        /**
         * Gets the value of the onlineFlag property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOnlineFlag() {
            return onlineFlag;
        }

        /**
         * Sets the value of the onlineFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOnlineFlag(String value) {
            this.onlineFlag = value;
        }

        /**
         * Gets the value of the searchableFlag property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSearchableFlag() {
            return searchableFlag;
        }

        /**
         * Sets the value of the searchableFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSearchableFlag(String value) {
            this.searchableFlag = value;
        }

        /**
         * Gets the value of the images property.
         * 
         * @return
         *     possible object is
         *     {@link Catalog.Product.Images }
         *     
         */
        public Catalog.Product.Images getImages() {
            return images;
        }

        /**
         * Sets the value of the images property.
         * 
         * @param value
         *     allowed object is
         *     {@link Catalog.Product.Images }
         *     
         */
        public void setImages(Catalog.Product.Images value) {
            this.images = value;
        }

        /**
         * Gets the value of the taxClassId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxClassId() {
            return taxClassId;
        }

        /**
         * Sets the value of the taxClassId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxClassId(String value) {
            this.taxClassId = value;
        }

        /**
         * Gets the value of the searchPlacement property.
         * 
         */
        public byte getSearchPlacement() {
            return searchPlacement;
        }

        /**
         * Sets the value of the searchPlacement property.
         * 
         */
        public void setSearchPlacement(byte value) {
            this.searchPlacement = value;
        }

        /**
         * Gets the value of the sitemapIncludedFlag property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSitemapIncludedFlag() {
            return sitemapIncludedFlag;
        }

        /**
         * Sets the value of the sitemapIncludedFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSitemapIncludedFlag(String value) {
            this.sitemapIncludedFlag = value;
        }

        /**
         * Gets the value of the pageAttributes property.
         * 
         * @return
         *     possible object is
         *     {@link Catalog.Product.PageAttributes }
         *     
         */
        public Catalog.Product.PageAttributes getPageAttributes() {
            return pageAttributes;
        }

        /**
         * Sets the value of the pageAttributes property.
         * 
         * @param value
         *     allowed object is
         *     {@link Catalog.Product.PageAttributes }
         *     
         */
        public void setPageAttributes(Catalog.Product.PageAttributes value) {
            this.pageAttributes = value;
        }

        /**
         * Gets the value of the customAttributes property.
         * 
         * @return
         *     possible object is
         *     {@link Catalog.Product.CustomAttributes }
         *     
         */
        public Catalog.Product.CustomAttributes getCustomAttributes() {
            return customAttributes;
        }

        /**
         * Sets the value of the customAttributes property.
         * 
         * @param value
         *     allowed object is
         *     {@link Catalog.Product.CustomAttributes }
         *     
         */
        public void setCustomAttributes(Catalog.Product.CustomAttributes value) {
            this.customAttributes = value;
        }

        /**
         * Gets the value of the productId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getProductId() {
            return productId;
        }

        /**
         * Sets the value of the productId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setProductId(Long value) {
            this.productId = value;
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
         *         &lt;element name="custom-attribute" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="attribute-id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
         *               &lt;/extension>
         *             &lt;/simpleContent>
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
            "customAttribute"
        })
        public static class CustomAttributes {

            @XmlElement(name = "custom-attribute", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31")
            protected List<Catalog.Product.CustomAttributes.CustomAttribute> customAttribute;

            /**
             * Gets the value of the customAttribute property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the customAttribute property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCustomAttribute().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Catalog.Product.CustomAttributes.CustomAttribute }
             * 
             * 
             */
            public List<Catalog.Product.CustomAttributes.CustomAttribute> getCustomAttribute() {
                if (customAttribute == null) {
                    customAttribute = new ArrayList<Catalog.Product.CustomAttributes.CustomAttribute>();
                }
                return this.customAttribute;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="attribute-id" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class CustomAttribute {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "attribute-id")
                protected String attributeId;
                @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
                protected String lang;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the attributeId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAttributeId() {
                    return attributeId;
                }

                /**
                 * Sets the value of the attributeId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAttributeId(String value) {
                    this.attributeId = value;
                }

                /**
                 * Gets the value of the lang property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLang() {
                    return lang;
                }

                /**
                 * Sets the value of the lang property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLang(String value) {
                    this.lang = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class DisplayName {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
            protected String lang;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the lang property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLang() {
                return lang;
            }

            /**
             * Sets the value of the lang property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLang(String value) {
                this.lang = value;
            }

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
         *         &lt;element name="image-group" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="image" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="view-type" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "imageGroup"
        })
        public static class Images {

            @XmlElement(name = "image-group", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31")
            protected List<Catalog.Product.Images.ImageGroup> imageGroup;

            /**
             * Gets the value of the imageGroup property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the imageGroup property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getImageGroup().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Catalog.Product.Images.ImageGroup }
             * 
             * 
             */
            public List<Catalog.Product.Images.ImageGroup> getImageGroup() {
                if (imageGroup == null) {
                    imageGroup = new ArrayList<Catalog.Product.Images.ImageGroup>();
                }
                return this.imageGroup;
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
             *         &lt;element name="image" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="view-type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "content"
            })
            public static class ImageGroup {

                @XmlElementRef(name = "image", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31", type = JAXBElement.class, required = false)
                @XmlMixed
                protected List<Image> content;
                @XmlAttribute(name = "view-type")
                protected String viewType;

                /**
                 * Gets the value of the content property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the content property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getContent().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * {@link JAXBElement }{@code <}{@link Catalog.Product.Images.ImageGroup.Image }{@code >}
                 * 
                 * 
                 */
                public List<Image> getContent() {
                    if (content == null) {
                        content = new ArrayList<Image>();
                    }
                    return this.content;
                }

                /**
                 * Gets the value of the viewType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getViewType() {
                    return viewType;
                }

                /**
                 * Sets the value of the viewType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setViewType(String value) {
                    this.viewType = value;
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
                 *       &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlRootElement
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Image {

                    @XmlAttribute(name = "path")
                    protected String path;

                    /**
                     * Gets the value of the path property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPath() {
                        return path;
                    }

                    /**
                     * Sets the value of the path property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPath(String value) {
                        this.path = value;
                    }

                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class LongDescription {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
            protected String lang;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the lang property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLang() {
                return lang;
            }

            /**
             * Sets the value of the lang property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLang(String value) {
                this.lang = value;
            }

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
         *         &lt;element name="page-title" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="page-description" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="page-keywords" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="page-url">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
         *               &lt;/extension>
         *             &lt;/simpleContent>
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
            "pageTitle",
            "pageDescription",
            "pageKeywords",
            "pageUrl"
        })
        public static class PageAttributes {

            @XmlElement(name = "page-title", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31")
            protected Catalog.Product.PageAttributes.PageTitle pageTitle;
            @XmlElement(name = "page-description", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31")
            protected Catalog.Product.PageAttributes.PageDescription pageDescription;
            @XmlElement(name = "page-keywords", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31")
            protected Catalog.Product.PageAttributes.PageKeywords pageKeywords;
            @XmlElement(name = "page-url", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31", required = true)
            protected Catalog.Product.PageAttributes.PageUrl pageUrl;

            /**
             * Gets the value of the pageTitle property.
             * 
             * @return
             *     possible object is
             *     {@link Catalog.Product.PageAttributes.PageTitle }
             *     
             */
            public Catalog.Product.PageAttributes.PageTitle getPageTitle() {
                return pageTitle;
            }

            /**
             * Sets the value of the pageTitle property.
             * 
             * @param value
             *     allowed object is
             *     {@link Catalog.Product.PageAttributes.PageTitle }
             *     
             */
            public void setPageTitle(Catalog.Product.PageAttributes.PageTitle value) {
                this.pageTitle = value;
            }

            /**
             * Gets the value of the pageDescription property.
             * 
             * @return
             *     possible object is
             *     {@link Catalog.Product.PageAttributes.PageDescription }
             *     
             */
            public Catalog.Product.PageAttributes.PageDescription getPageDescription() {
                return pageDescription;
            }

            /**
             * Sets the value of the pageDescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link Catalog.Product.PageAttributes.PageDescription }
             *     
             */
            public void setPageDescription(Catalog.Product.PageAttributes.PageDescription value) {
                this.pageDescription = value;
            }

            /**
             * Gets the value of the pageKeywords property.
             * 
             * @return
             *     possible object is
             *     {@link Catalog.Product.PageAttributes.PageKeywords }
             *     
             */
            public Catalog.Product.PageAttributes.PageKeywords getPageKeywords() {
                return pageKeywords;
            }

            /**
             * Sets the value of the pageKeywords property.
             * 
             * @param value
             *     allowed object is
             *     {@link Catalog.Product.PageAttributes.PageKeywords }
             *     
             */
            public void setPageKeywords(Catalog.Product.PageAttributes.PageKeywords value) {
                this.pageKeywords = value;
            }

            /**
             * Gets the value of the pageUrl property.
             * 
             * @return
             *     possible object is
             *     {@link Catalog.Product.PageAttributes.PageUrl }
             *     
             */
            public Catalog.Product.PageAttributes.PageUrl getPageUrl() {
                return pageUrl;
            }

            /**
             * Sets the value of the pageUrl property.
             * 
             * @param value
             *     allowed object is
             *     {@link Catalog.Product.PageAttributes.PageUrl }
             *     
             */
            public void setPageUrl(Catalog.Product.PageAttributes.PageUrl value) {
                this.pageUrl = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class PageDescription {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
                protected String lang;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the lang property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLang() {
                    return lang;
                }

                /**
                 * Sets the value of the lang property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLang(String value) {
                    this.lang = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class PageKeywords {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
                protected String lang;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the lang property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLang() {
                    return lang;
                }

                /**
                 * Sets the value of the lang property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLang(String value) {
                    this.lang = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class PageTitle {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
                protected String lang;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the lang property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLang() {
                    return lang;
                }

                /**
                 * Sets the value of the lang property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLang(String value) {
                    this.lang = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class PageUrl {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
                protected String lang;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the lang property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLang() {
                    return lang;
                }

                /**
                 * Sets the value of the lang property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLang(String value) {
                    this.lang = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class ShortDescription {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
            protected String lang;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the lang property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLang() {
                return lang;
            }

            /**
             * Sets the value of the lang property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLang(String value) {
                this.lang = value;
            }

        }

    }

}
