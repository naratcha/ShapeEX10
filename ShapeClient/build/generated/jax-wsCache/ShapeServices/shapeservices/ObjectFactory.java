
package shapeservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the shapeservices package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
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

    private final static QName _Area_QNAME = new QName("http://shapeservices/", "Area");
    private final static QName _AreaResponse_QNAME = new QName("http://shapeservices/", "AreaResponse");
    private final static QName _CircumFer_QNAME = new QName("http://shapeservices/", "CircumFer");
    private final static QName _CircumFerResponse_QNAME = new QName("http://shapeservices/", "CircumFerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: shapeservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Area }
     * 
     */
    public Area createArea() {
        return new Area();
    }

    /**
     * Create an instance of {@link AreaResponse }
     * 
     */
    public AreaResponse createAreaResponse() {
        return new AreaResponse();
    }

    /**
     * Create an instance of {@link CircumFer }
     * 
     */
    public CircumFer createCircumFer() {
        return new CircumFer();
    }

    /**
     * Create an instance of {@link CircumFerResponse }
     * 
     */
    public CircumFerResponse createCircumFerResponse() {
        return new CircumFerResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Area }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Area }{@code >}
     */
    @XmlElementDecl(namespace = "http://shapeservices/", name = "Area")
    public JAXBElement<Area> createArea(Area value) {
        return new JAXBElement<Area>(_Area_QNAME, Area.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AreaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AreaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://shapeservices/", name = "AreaResponse")
    public JAXBElement<AreaResponse> createAreaResponse(AreaResponse value) {
        return new JAXBElement<AreaResponse>(_AreaResponse_QNAME, AreaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CircumFer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CircumFer }{@code >}
     */
    @XmlElementDecl(namespace = "http://shapeservices/", name = "CircumFer")
    public JAXBElement<CircumFer> createCircumFer(CircumFer value) {
        return new JAXBElement<CircumFer>(_CircumFer_QNAME, CircumFer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CircumFerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CircumFerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://shapeservices/", name = "CircumFerResponse")
    public JAXBElement<CircumFerResponse> createCircumFerResponse(CircumFerResponse value) {
        return new JAXBElement<CircumFerResponse>(_CircumFerResponse_QNAME, CircumFerResponse.class, null, value);
    }

}
