/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX03_03;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Solve_2X2_Linear_Equation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c, d, e, f:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        double S = a * d - b * c;
        if(S == 0)
            System.out.println("The equation has no solution");
        else{
            System.out.print("x is " + ((e * d - b * f) / S));
            System.out.println(" and y is " + ((a * f - e * c) / S));
        }
    }
}
