/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX04_05;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Area_Of_A_Regular_Polygon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of sides: ");
        int numOfSides = input.nextInt();
        System.out.println("Enter the side: ");
        double side = input.nextDouble();
        double area = (numOfSides * side * side) / (4 * Math.tan(Math.PI / numOfSides));
        System.out.println("The area of the polygon is " + area);
    }
}
