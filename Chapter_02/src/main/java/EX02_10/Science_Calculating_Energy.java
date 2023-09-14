/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX02_10;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Science_Calculating_Energy {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of water in kilograms: ");
        double mass = input.nextDouble();
        System.out.println("Enter the initial temperatue: ");
        double initialTemp = input.nextDouble();
        System.out.println("Enter the final temperature: ");
        double finalTemp = input.nextDouble();
        System.out.printf("The energy needed is %.1f", (mass * (finalTemp - initialTemp) * 4184));
    }
}
