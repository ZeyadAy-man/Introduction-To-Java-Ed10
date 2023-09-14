/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX04_06;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Random_Points_On_A_Circle {
    public static void main(String[] args){
        double Theta1 = Math.random() * Math.PI * 2;
        double Theta2 = Math.random() * Math.PI * 2;
        double Theta3 = Math.random() * Math.PI * 2;
        double x1 = 40 * Math.cos(Theta1);
        double y1 = 40 * Math.sin(Theta1);
        double x2 = 40 * Math.cos(Theta2);
        double y2 = 40 * Math.sin(Theta2);
        double x3 = 40 * Math.cos(Theta3);
        double y3 = 40 * Math.sin(Theta3);
        double c = Math.pow((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2), 0.5);
        double b = Math.pow((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3), 0.5);
        double a = Math.pow((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3), 0.5);
        double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
        double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
        double C = Math.toDegrees(Math.acos((c * c - a * a - b * b) / (-2 * a * b)));
        System.out.println("(" + x1 + ", " + y1 + ") " + "(" + x2 + ", " + y2 + ") " + "(" + x3 + ", " + y3 + ") ");
        System.out.println("Three angels are " + A + " " + B + " " + C);
    }
}
