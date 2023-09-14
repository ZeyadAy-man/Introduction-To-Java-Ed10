/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX03_01;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Solve_Quadratic_Equation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c of the quadratic equation: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double discriminant = Math.pow(b * b - 4 * a * c, 0.5);
        if(discriminant > 0){
            double r1 = ((-1 * b) - discriminant) / 2 * a;
            double r2 = ((-1 * b) + discriminant) / 2 * a;
            System.out.printf("The equation has two roots %.6f and %.6f", r1, r2);    
        }
        else if(discriminant == 0){
            double r1 = (-1 * b) / (2 * a);
            System.out.printf("The equation has only one root %.6f", r1);
        }
        else
            System.out.println("The equation has no roots");
            
    }
}
