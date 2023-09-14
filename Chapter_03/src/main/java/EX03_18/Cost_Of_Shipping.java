/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX03_18;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Cost_Of_Shipping {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the weight in pounds: ");
        double weightInPounds = input.nextDouble();
        double cost = 0;
        if((weightInPounds > 0) && (weightInPounds <= 1))
            cost = 3.5;
        else if((weightInPounds > 1) && (weightInPounds <= 3))
            cost = 5.5;
        else if((weightInPounds > 3) && (weightInPounds <= 10))
            cost = 8.5;
        else if((weightInPounds > 10) && (weightInPounds <= 20))
            cost = 10.5;
        else{
            System.out.println("The packagge cannot be shipped. ");
            System.exit(0);
        }
        System.out.println("The shipping cost is " + cost);
    }
}
