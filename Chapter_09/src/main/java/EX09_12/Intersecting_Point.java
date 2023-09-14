/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX09_12;

/**
 *
 * @author Zeyad Ayman
 */
import EX09_11.LinearEquation;
import java.util.Scanner;
public class Intersecting_Point {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, and y4");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();
        double a = y1 - y2;
        double b = x2 - x1;
        double e = (y1 - y2) * x1 + (x2 - x1) * y1;
        double c = y3 - y4;
        double d = x4 - x3;
        double f = (y3 - y4) * x3 + (x4 - x3) * y3;
        LinearEquation L1 = new LinearEquation(a, b, c, d, e, f);
        if(L1.isSolvable())
            System.out.println("The intersecting point is at (" + L1.getX() + ", " + L1.getY() + ")");
        else{
            System.out.println("The two lines are parallel");
        }
    }
}
