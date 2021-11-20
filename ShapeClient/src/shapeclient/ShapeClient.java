/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shapeclient;

import java.util.Scanner;
/**
 *
 * @author naratcha.s
 */
public class ShapeClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Circle Calculation Service Program");
        System.out.print("Please input value of radius : ");
        double radius = sc.nextDouble();
        System.out.println("Area is = " + AreaClient(radius));
        System.out.println("Circumference is = " + CircumClient(radius));
        
    }
    
    private static double AreaClient(double radius) {
        shapeservices.ShapeServices_Service service = new shapeservices.ShapeServices_Service();
        shapeservices.ShapeServices port = service.getShapeServicesPort();
        return port.area(radius);
    }
    
    private static double CircumClient(double radius) {
        shapeservices.ShapeServices_Service service = new shapeservices.ShapeServices_Service();
        shapeservices.ShapeServices port = service.getShapeServicesPort();
        return port.circumFer(radius);
    }
}
