/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX04_01;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Area_Of_A_Pentagon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length from the center to a vertex");
        double length = input.nextDouble();
        double S = 2 * length * Math.sin(Math.PI / 5);
        double area = (5 * S * S) / (4 * Math.tan(Math.PI / 5));
        System.out.printf("The area of the pentagon is %.2f", area);
    }
}
