/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX03_29;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Two_Circles {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter circle1's center x-, y-coordinates, and radius: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double radius1 = input.nextDouble();
        System.out.println("Enter circle2's center x-, y-coordinates, and radius: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double radius2 = input.nextDouble();
        double distance = Math.pow((x1 - x2) * (x1 - x2)  + (y1 - y2) * (y1 - y2), 0.5);
        if(distance <= Math.abs(radius2 - radius1))
            System.out.println("circle2 is inside circle1");
        else if(distance <= Math.abs(radius2 + radius1))
            System.out.println("circle2 overlaps circle1");
        else
            System.out.println("circle2 does not overlap circle1");
    }
}
