/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX02_16;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Area_Of_A_Hexagon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side: ");
        double side = input.nextDouble();
        System.out.printf("The area of the hezagon is %.4f", (3 * Math.pow(3, 0.5) / 2.0) * side * side);
    }
}
