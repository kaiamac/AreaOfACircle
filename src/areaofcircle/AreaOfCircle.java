/*
 * Kaia Mac
 * This program calculates the area of a circle of radius 15 cm
 * September 18th, 2018
 */

package areaofcircle;

/**
 *
 * @author kamac8665
 */
public class AreaOfCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radius = 15.0;
        double pi = 3.14;
        double area = 0.0;
        //algorithm for area calc
        area = pi*radius*radius;
        System.out.println("the area..." + area + "cm squared");
    }
    
}
