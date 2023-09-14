/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX02_02;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
import java.math.*;
public class Compute_Volume_Of_A_Cylindar {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius and length of a cylindar:");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        System.out.printf("The area is %.4f\n", (radius * radius * Math.PI));
        System.out.printf("The volume is %.1f", (radius * radius * Math.PI * length));
    }
}
