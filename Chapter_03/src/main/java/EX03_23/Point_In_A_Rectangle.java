/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX03_23;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Point_In_A_Rectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a point with two coordinates (x, y): ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        if((x <= 5) && (x >= -5) && (y <= 2.5) && (y >= -2.5)){
            System.out.println("Point (" + x + ", " + y + ") is in the rectangle");  
        }
        else
            System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
    }
}
