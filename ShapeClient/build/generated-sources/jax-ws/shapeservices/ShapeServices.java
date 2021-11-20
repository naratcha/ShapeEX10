
package shapeservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.3
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ShapeServices", targetNamespace = "http://shapeservices/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ShapeServices {


    /**
     * 
     * @param radius
     * @return
     *     returns double
     */
    @WebMethod(operationName = "CircumFer")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "CircumFer", targetNamespace = "http://shapeservices/", className = "shapeservices.CircumFer")
    @ResponseWrapper(localName = "CircumFerResponse", targetNamespace = "http://shapeservices/", className = "shapeservices.CircumFerResponse")
    @Action(input = "http://shapeservices/ShapeServices/CircumFerRequest", output = "http://shapeservices/ShapeServices/CircumFerResponse")
    public double circumFer(
        @WebParam(name = "radius", targetNamespace = "")
        double radius);

    /**
     * 
     * @param radius
     * @return
     *     returns double
     */
    @WebMethod(operationName = "Area")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Area", targetNamespace = "http://shapeservices/", className = "shapeservices.Area")
    @ResponseWrapper(localName = "AreaResponse", targetNamespace = "http://shapeservices/", className = "shapeservices.AreaResponse")
    @Action(input = "http://shapeservices/ShapeServices/AreaRequest", output = "http://shapeservices/ShapeServices/AreaResponse")
    public double area(
        @WebParam(name = "radius", targetNamespace = "")
        double radius);

}