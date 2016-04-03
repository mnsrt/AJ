
package ee.degeetia.dumonitor.filter.config.xpath.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ee.degeetia.dumonitor.filter.config.xpath.generated package. 
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

    private final static QName _DumonitorXPathConfiguration_QNAME = new QName("xpath_conf_schema.xsd", "dumonitorXPathConfiguration");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ee.degeetia.dumonitor.filter.config.xpath.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Filter }
     * 
     */
    public Filter createFilter() {
        return new Filter();
    }

    /**
     * Create an instance of {@link Namespaces }
     * 
     */
    public Namespaces createNamespaces() {
        return new Namespaces();
    }

    /**
     * Create an instance of {@link LoggableFields }
     * 
     */
    public LoggableFields createLoggableFields() {
        return new LoggableFields();
    }

    /**
     * Create an instance of {@link Namespace }
     * 
     */
    public Namespace createNamespace() {
        return new Namespace();
    }

    /**
     * Create an instance of {@link DumonitorXPathConfiguration }
     * 
     */
    public DumonitorXPathConfiguration createDumonitorXPathConfiguration() {
        return new DumonitorXPathConfiguration();
    }

    /**
     * Create an instance of {@link Filters }
     * 
     */
    public Filters createFilters() {
        return new Filters();
    }

    /**
     * Create an instance of {@link LoggableField }
     * 
     */
    public LoggableField createLoggableField() {
        return new LoggableField();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DumonitorXPathConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "xpath_conf_schema.xsd", name = "dumonitorXPathConfiguration")
    public JAXBElement<DumonitorXPathConfiguration> createDumonitorXPathConfiguration(DumonitorXPathConfiguration value) {
        return new JAXBElement<DumonitorXPathConfiguration>(_DumonitorXPathConfiguration_QNAME, DumonitorXPathConfiguration.class, null, value);
    }

}