
package io.elastic.salesforce.actions.JAXB.product;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.elastic.salesforce.actions.JAXB package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CatalogProductImagesImageGroupImage_QNAME = new QName("http://www.demandware.com/xml/impex/catalog/2006-10-31", "image");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.elastic.salesforce.actions.JAXB
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Catalog }
     * 
     */
    public Catalog createCatalog() {
        return new Catalog();
    }

    /**
     * Create an instance of {@link Catalog.Product }
     * 
     */
    public Catalog.Product createCatalogProduct() {
        return new Catalog.Product();
    }

    /**
     * Create an instance of {@link Catalog.Product.CustomAttributes }
     * 
     */
    public Catalog.Product.CustomAttributes createCatalogProductCustomAttributes() {
        return new Catalog.Product.CustomAttributes();
    }

    /**
     * Create an instance of {@link Catalog.Product.PageAttributes }
     * 
     */
    public Catalog.Product.PageAttributes createCatalogProductPageAttributes() {
        return new Catalog.Product.PageAttributes();
    }

    /**
     * Create an instance of {@link Catalog.Product.Images }
     * 
     */
    public Catalog.Product.Images createCatalogProductImages() {
        return new Catalog.Product.Images();
    }

    /**
     * Create an instance of {@link Catalog.Product.Images.ImageGroup }
     * 
     */
    public Catalog.Product.Images.ImageGroup createCatalogProductImagesImageGroup() {
        return new Catalog.Product.Images.ImageGroup();
    }

    /**
     * Create an instance of {@link Catalog.Header }
     * 
     */
    public Catalog.Header createCatalogHeader() {
        return new Catalog.Header();
    }

    /**
     * Create an instance of {@link Catalog.Header.ImageSettings }
     * 
     */
    public Catalog.Header.ImageSettings createCatalogHeaderImageSettings() {
        return new Catalog.Header.ImageSettings();
    }

    /**
     * Create an instance of {@link Catalog.Product.DisplayName }
     * 
     */
    public Catalog.Product.DisplayName createCatalogProductDisplayName() {
        return new Catalog.Product.DisplayName();
    }

    /**
     * Create an instance of {@link Catalog.Product.ShortDescription }
     * 
     */
    public Catalog.Product.ShortDescription createCatalogProductShortDescription() {
        return new Catalog.Product.ShortDescription();
    }

    /**
     * Create an instance of {@link Catalog.Product.LongDescription }
     * 
     */
    public Catalog.Product.LongDescription createCatalogProductLongDescription() {
        return new Catalog.Product.LongDescription();
    }

    /**
     * Create an instance of {@link Catalog.Product.CustomAttributes.CustomAttribute }
     * 
     */
    public Catalog.Product.CustomAttributes.CustomAttribute createCatalogProductCustomAttributesCustomAttribute() {
        return new Catalog.Product.CustomAttributes.CustomAttribute();
    }

    /**
     * Create an instance of {@link Catalog.Product.PageAttributes.PageTitle }
     * 
     */
    public Catalog.Product.PageAttributes.PageTitle createCatalogProductPageAttributesPageTitle() {
        return new Catalog.Product.PageAttributes.PageTitle();
    }

    /**
     * Create an instance of {@link Catalog.Product.PageAttributes.PageDescription }
     * 
     */
    public Catalog.Product.PageAttributes.PageDescription createCatalogProductPageAttributesPageDescription() {
        return new Catalog.Product.PageAttributes.PageDescription();
    }

    /**
     * Create an instance of {@link Catalog.Product.PageAttributes.PageKeywords }
     * 
     */
    public Catalog.Product.PageAttributes.PageKeywords createCatalogProductPageAttributesPageKeywords() {
        return new Catalog.Product.PageAttributes.PageKeywords();
    }

    /**
     * Create an instance of {@link Catalog.Product.PageAttributes.PageUrl }
     * 
     */
    public Catalog.Product.PageAttributes.PageUrl createCatalogProductPageAttributesPageUrl() {
        return new Catalog.Product.PageAttributes.PageUrl();
    }

    /**
     * Create an instance of {@link Catalog.Product.Images.ImageGroup.Image }
     *
     */
    public Catalog.Product.Images.ImageGroup.Image createCatalogProductImagesImageGroupImage() {
        return new Catalog.Product.Images.ImageGroup.Image();
    }

    /**
     * Create an instance of {@link Catalog.Header.ImageSettings.ExternalLocation }
     * 
     */
    public Catalog.Header.ImageSettings.ExternalLocation createCatalogHeaderImageSettingsExternalLocation() {
        return new Catalog.Header.ImageSettings.ExternalLocation();
    }

    /**
     * Create an instance of {@link Catalog.Header.ImageSettings.ViewTypes }
     * 
     */
    public Catalog.Header.ImageSettings.ViewTypes createCatalogHeaderImageSettingsViewTypes() {
        return new Catalog.Header.ImageSettings.ViewTypes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Catalog.Product.Images.ImageGroup.Image }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.demandware.com/xml/impex/catalog/2006-10-31", name = "image", scope = Catalog.Product.Images.ImageGroup.class)
    public JAXBElement<Catalog.Product.Images.ImageGroup.Image> createCatalogProductImagesImageGroupImage(Catalog.Product.Images.ImageGroup.Image value) {
        return new JAXBElement<Catalog.Product.Images.ImageGroup.Image>(_CatalogProductImagesImageGroupImage_QNAME, Catalog.Product.Images.ImageGroup.Image.class, Catalog.Product.Images.ImageGroup.class, value);
    }

}
