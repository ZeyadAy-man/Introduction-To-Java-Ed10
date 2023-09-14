/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX03_19;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Compute_The_Perimeter_Of_Triangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the three edges: ");
        double edge1 = input.nextDouble();
        double edge2 = input.nextDouble();
        double edge3 = input.nextDouble();
        if((edge1 + edge2 < edge3) || (edge1 + edge3 < edge2) || (edge2 + edge3 < edge1)){
            System.out.println("The input is invalid");
            System.exit(0);
        }
        else if((edge1 + edge2 >= edge3) || (edge1 + edge3 >= edge2) || (edge2 + edge3 >= edge1)){
            System.out.println("The perimeter of the triangle is " + (edge1 + edge2 + edge3));
        }
    }
}
