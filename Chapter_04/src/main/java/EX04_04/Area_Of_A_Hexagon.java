/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX04_04;

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
        double area = (6 * side * side) / (4 * Math.tan(Math.PI / 6));
        System.out.printf("The area of the hexagon is %5.2f ", area);
    }
}
