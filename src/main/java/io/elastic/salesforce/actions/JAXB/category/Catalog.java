
package io.elastic.salesforce.actions.JAXB.category;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *                                       &lt;element name="http-url" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                                       &lt;element name="view-type" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
 *         &lt;element name="category" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="display-name" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang use="required""/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="online-flag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="parent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="template" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sitemap-included-flag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="page-attributes">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="page-url">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang use="required""/>
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
 *                             &lt;element name="custom-attribute" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="attribute-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *                 &lt;attribute name="category-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="category-assignment" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="primary-flag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="category-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="product-id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="recommendation" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="source-id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *                 &lt;attribute name="source-type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="target-id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="catalog-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "category",
    "categoryAssignment",
    "recommendation"
})
@XmlRootElement(name = "catalog", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31")
public class Catalog {

    @XmlElement(namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31", required = true)
    protected Catalog.Header header;
    @XmlElement(namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31", required = true)
    protected List<Catalog.Category> category;
    @XmlElement(name = "category-assignment", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31", required = true)
    protected List<Catalog.CategoryAssignment> categoryAssignment;
    @XmlElement(namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31", required = true)
    protected List<Catalog.Recommendation> recommendation;
    @XmlAttribute(name = "catalog-id", required = true)
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
     * Gets the value of the category property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the category property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Catalog.Category }
     * 
     * 
     */
    public List<Catalog.Category> getCategory() {
        if (category == null) {
            category = new ArrayList<Catalog.Category>();
        }
        return this.category;
    }

    /**
     * Gets the value of the categoryAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoryAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoryAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Catalog.CategoryAssignment }
     * 
     * 
     */
    public List<Catalog.CategoryAssignment> getCategoryAssignment() {
        if (categoryAssignment == null) {
            categoryAssignment = new ArrayList<Catalog.CategoryAssignment>();
        }
        return this.categoryAssignment;
    }

    /**
     * Gets the value of the recommendation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recommendation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecommendation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Catalog.Recommendation }
     * 
     * 
     */
    public List<Catalog.Recommendation> getRecommendation() {
        if (recommendation == null) {
            recommendation = new ArrayList<Catalog.Recommendation>();
        }
        return this.recommendation;
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
     *         &lt;element name="display-name" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang use="required""/>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="online-flag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="parent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="template" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sitemap-included-flag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="page-attributes">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="page-url">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang use="required""/>
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
     *                   &lt;element name="custom-attribute" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="attribute-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *       &lt;attribute name="category-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "displayName",
        "onlineFlag",
        "parent",
        "image",
        "template",
        "sitemapIncludedFlag",
        "pageAttributes",
        "customAttributes"
    })
    public static class Category {

        @XmlElement(name = "display-name", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31", required = true)
        protected List<Catalog.Category.DisplayName> displayName;
        @XmlElement(name = "online-flag", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31")
        protected boolean onlineFlag;
        @XmlElement(namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31")
        protected String parent;
        @XmlElement(namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31")
        protected String image;
        @XmlElement(namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31")
        protected String template;
        @XmlElement(name = "sitemap-included-flag", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31")
        protected Boolean sitemapIncludedFlag;
        @XmlElement(name = "page-attributes", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31", required = true)
        protected Catalog.Category.PageAttributes pageAttributes;
        @XmlElement(name = "custom-attributes", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31", required = true)
        protected Catalog.Category.CustomAttributes customAttributes;
        @XmlAttribute(name = "category-id", required = true)
        protected String categoryId;

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
         * {@link Catalog.Category.DisplayName }
         * 
         * 
         */
        public List<Catalog.Category.DisplayName> getDisplayName() {
            if (displayName == null) {
                displayName = new ArrayList<Catalog.Category.DisplayName>();
            }
            return this.displayName;
        }

        /**
         * Gets the value of the onlineFlag property.
         * 
         */
        public boolean isOnlineFlag() {
            return onlineFlag;
        }

        /**
         * Sets the value of the onlineFlag property.
         * 
         */
        public void setOnlineFlag(boolean value) {
            this.onlineFlag = value;
        }

        /**
         * Gets the value of the parent property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParent() {
            return parent;
        }

        /**
         * Sets the value of the parent property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParent(String value) {
            this.parent = value;
        }

        /**
         * Gets the value of the image property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImage() {
            return image;
        }

        /**
         * Sets the value of the image property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImage(String value) {
            this.image = value;
        }

        /**
         * Gets the value of the template property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTemplate() {
            return template;
        }

        /**
         * Sets the value of the template property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTemplate(String value) {
            this.template = value;
        }

        /**
         * Gets the value of the sitemapIncludedFlag property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSitemapIncludedFlag() {
            return sitemapIncludedFlag;
        }

        /**
         * Sets the value of the sitemapIncludedFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSitemapIncludedFlag(Boolean value) {
            this.sitemapIncludedFlag = value;
        }

        /**
         * Gets the value of the pageAttributes property.
         * 
         * @return
         *     possible object is
         *     {@link Catalog.Category.PageAttributes }
         *     
         */
        public Catalog.Category.PageAttributes getPageAttributes() {
            return pageAttributes;
        }

        /**
         * Sets the value of the pageAttributes property.
         * 
         * @param value
         *     allowed object is
         *     {@link Catalog.Category.PageAttributes }
         *     
         */
        public void setPageAttributes(Catalog.Category.PageAttributes value) {
            this.pageAttributes = value;
        }

        /**
         * Gets the value of the customAttributes property.
         * 
         * @return
         *     possible object is
         *     {@link Catalog.Category.CustomAttributes }
         *     
         */
        public Catalog.Category.CustomAttributes getCustomAttributes() {
            return customAttributes;
        }

        /**
         * Sets the value of the customAttributes property.
         * 
         * @param value
         *     allowed object is
         *     {@link Catalog.Category.CustomAttributes }
         *     
         */
        public void setCustomAttributes(Catalog.Category.CustomAttributes value) {
            this.customAttributes = value;
        }

        /**
         * Gets the value of the categoryId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCategoryId() {
            return categoryId;
        }

        /**
         * Sets the value of the categoryId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCategoryId(String value) {
            this.categoryId = value;
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
         *         &lt;element name="custom-attribute" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="attribute-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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

            @XmlElement(name = "custom-attribute", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31", required = true)
            protected List<Catalog.Category.CustomAttributes.CustomAttribute> customAttribute;

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
             * {@link Catalog.Category.CustomAttributes.CustomAttribute }
             * 
             * 
             */
            public List<Catalog.Category.CustomAttributes.CustomAttribute> getCustomAttribute() {
                if (customAttribute == null) {
                    customAttribute = new ArrayList<Catalog.Category.CustomAttributes.CustomAttribute>();
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
             *       &lt;attribute name="attribute-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                @XmlAttribute(name = "attribute-id", required = true)
                protected String attributeId;
                @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "language")
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
         *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang use="required""/>
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
            @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "language")
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
         *       &lt;sequence minOccurs="0">
         *         &lt;element name="page-url">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang use="required""/>
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
            "pageUrl"
        })
        public static class PageAttributes {

            @XmlElement(name = "page-url", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31")
            protected Catalog.Category.PageAttributes.PageUrl pageUrl;

            /**
             * Gets the value of the pageUrl property.
             * 
             * @return
             *     possible object is
             *     {@link Catalog.Category.PageAttributes.PageUrl }
             *     
             */
            public Catalog.Category.PageAttributes.PageUrl getPageUrl() {
                return pageUrl;
            }

            /**
             * Sets the value of the pageUrl property.
             * 
             * @param value
             *     allowed object is
             *     {@link Catalog.Category.PageAttributes.PageUrl }
             *     
             */
            public void setPageUrl(Catalog.Category.PageAttributes.PageUrl value) {
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
             *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang use="required""/>
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
                @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "language")
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="primary-flag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *       &lt;/sequence>
     *       &lt;attribute name="category-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="product-id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "primaryFlag"
    })
    public static class CategoryAssignment {

        @XmlElement(name = "primary-flag", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31")
        protected Boolean primaryFlag;
        @XmlAttribute(name = "category-id", required = true)
        protected String categoryId;
        @XmlAttribute(name = "product-id", required = true)
        @XmlSchemaType(name = "unsignedLong")
        protected BigInteger productId;

        /**
         * Gets the value of the primaryFlag property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPrimaryFlag() {
            return primaryFlag;
        }

        /**
         * Sets the value of the primaryFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPrimaryFlag(Boolean value) {
            this.primaryFlag = value;
        }

        /**
         * Gets the value of the categoryId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCategoryId() {
            return categoryId;
        }

        /**
         * Sets the value of the categoryId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCategoryId(String value) {
            this.categoryId = value;
        }

        /**
         * Gets the value of the productId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getProductId() {
            return productId;
        }

        /**
         * Sets the value of the productId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setProductId(BigInteger value) {
            this.productId = value;
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
     *                             &lt;element name="http-url" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
     *                             &lt;element name="view-type" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
         *                   &lt;element name="http-url" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
         *                   &lt;element name="view-type" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
             *         &lt;element name="http-url" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
             *         &lt;element name="view-type" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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

                @XmlElement(name = "view-type", namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31", required = true)
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
     *       &lt;attribute name="source-id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
     *       &lt;attribute name="source-type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="target-id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
     *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Recommendation {

        @XmlAttribute(name = "source-id", required = true)
        @XmlSchemaType(name = "unsignedLong")
        protected BigInteger sourceId;
        @XmlAttribute(name = "source-type", required = true)
        protected String sourceType;
        @XmlAttribute(name = "target-id", required = true)
        @XmlSchemaType(name = "unsignedLong")
        protected BigInteger targetId;
        @XmlAttribute(name = "type", required = true)
        @XmlSchemaType(name = "unsignedByte")
        protected short type;

        /**
         * Gets the value of the sourceId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSourceId() {
            return sourceId;
        }

        /**
         * Sets the value of the sourceId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSourceId(BigInteger value) {
            this.sourceId = value;
        }

        /**
         * Gets the value of the sourceType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSourceType() {
            return sourceType;
        }

        /**
         * Sets the value of the sourceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSourceType(String value) {
            this.sourceType = value;
        }

        /**
         * Gets the value of the targetId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTargetId() {
            return targetId;
        }

        /**
         * Sets the value of the targetId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTargetId(BigInteger value) {
            this.targetId = value;
        }

        /**
         * Gets the value of the type property.
         * 
         */
        public short getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         */
        public void setType(short value) {
            this.type = value;
        }

    }

}
