/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package shapeservices;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author naratcha.s
 */
@WebService(serviceName = "ShapeServices")
public class ShapeServices {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Area")
    public double Area(@WebParam(name = "radius") double radius) {
        //TODO write your implementation code here:
        return ((double)22 / 7) * (radius * radius);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CircumFer")
    public double CircumFer(@WebParam(name = "radius") double radius) {
        //TODO write your implementation code here:
        return 2 * ((double)22 / 7) * radius;
    }
    
    /**
     * This is a sample web service operation
     */
    
}
