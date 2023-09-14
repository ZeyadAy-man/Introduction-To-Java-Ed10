/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX02_23;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Cost_Of_Driving {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the driving distance: ");
        double miles = input.nextDouble();
        System.out.println("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();
        System.out.println("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();
        double cost = (miles / milesPerGallon) * pricePerGallon;
        System.out.printf("The cost of driving is $%.2f", cost);
    }
}
