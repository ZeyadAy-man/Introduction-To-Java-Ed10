/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX02_09;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Physics_Acceleration {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter v0, v1, and t: ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();
        System.out.printf("The average acceleration is %7.4f", ((v1 - v0) / t));
    }
}
