/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX09_09;

/**
 *
 * @author Zeyad Ayman
 */
public class Test {
    public static void main(String[] args) {
        RegularPolygon p1 = new RegularPolygon(6, 4);
        RegularPolygon p2 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("first polygon area is " + p1.getArea()
                + " and it's perimeter is " + p1.getPerimeter());
        System.out.println("second polygon area is " + p2.getArea()
                + " and it's perimeter is " + p2.getPerimeter() );
        
    }
}
