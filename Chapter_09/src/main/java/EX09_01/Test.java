/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX09_01;

/**
 *
 * @author Zeyad Ayman
 */
public class Test {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);
        System.out.println("The first rectangle width is "
                           + r1.width + " and " + r1.height + " height and "
                           + r1.getArea() + " area " + r1.getPerimeter() + 
                           " perimeter");
        System.out.println("The second rectangle width is "
                           + r2.width + " and " + r2.height + " height and "
                           + r2.getArea() + " area " + r2.getPerimeter() + 
                           " perimeter");
    }
}
