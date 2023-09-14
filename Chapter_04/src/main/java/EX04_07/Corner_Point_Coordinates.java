/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX04_07;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Corner_Point_Coordinates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the bounding circle: ");
        double radius = input.nextDouble();
        double Theta1 = Math.PI * Math.random() * 2;
        double Theta2 = Theta1 + 108;
        double Theta3 = Theta2 + 108;
        double Theta4 = Theta3 + 108;
        double Theta5 = Theta4 + 108;
        double x1 = radius * Math.cos(Theta1);
        double y1 = radius * Math.sin(Theta1);
        double x2 = radius * Math.cos(Theta2);
        double y2 = radius * Math.sin(Theta2);
        double x3 = radius * Math.cos(Theta3);
        double y3 = radius * Math.sin(Theta3);
        double x4 = radius * Math.cos(Theta4);
        double y4 = radius * Math.sin(Theta4);
        double x5 = radius * Math.cos(Theta5);
        double y5 = radius * Math.sin(Theta5);
        System.out.println("(" + x1 + ", " + y1 + ")\n " 
                         + "(" + x2 + ", " + y2 + ")\n "
                         + "(" + x3 + ", " + y3 + ")\n "
                         + "(" + x4 + ", " + y4 + ")\n " 
                         + "(" + x5 + ", " + y5 + ")\n ");
    }
}
