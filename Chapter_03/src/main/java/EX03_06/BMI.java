/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX03_06;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class BMI {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();
        System.out.println("Enter feet: ");
        double numOfFeetOfHeight = input.nextDouble();
        System.out.println("Enter inches: ");
        double numOfInchesOfHeight = input.nextDouble();
        double heightInMeters = numOfFeetOfHeight * 0.3048 + numOfInchesOfHeight * 0.0254;
        double weightInKG = weightInPounds * 0.45359237;
        double BMI = weightInKG / (heightInMeters * heightInMeters);
        if(BMI < 18.5)
            System.out.println("BMI is " + BMI + "\nUnderweight");
        else if(BMI < 25)
            System.out.println("BMI is " + BMI + "\nNormal");     
        else if(BMI < 30)
            System.out.println("BMI is " + BMI + "\nOverweight");
        else
            System.out.println("BMI is " + BMI + "\nObese");
        
    }
}
