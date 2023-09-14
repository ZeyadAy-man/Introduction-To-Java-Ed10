/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX02_14;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Computing_BMI {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();
        System.out.println("Enter height in inches: ");
        double heightInInches = input.nextDouble();
        double heightInMeters = heightInInches * 0.0254;
        double weightInKilograms = weightInPounds * 0.45359237;
        System.out.printf("BMI is %.4f", (weightInKilograms / (heightInMeters * heightInMeters)));
    }
}
