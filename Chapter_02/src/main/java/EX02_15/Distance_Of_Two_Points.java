/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX02_15;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Distance_Of_Two_Points {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1 and y1:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.println("Enter x2 and y2:");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.println("The distance between the two points is " + (Math.pow(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)), 0.5)));
    }
}
