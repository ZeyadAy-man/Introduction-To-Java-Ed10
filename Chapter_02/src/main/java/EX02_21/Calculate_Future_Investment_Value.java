/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX02_21;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Calculate_Future_Investment_Value{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        System.out.println("Enter annual interest rate in percentage: ");
        double interestRateInPercentage = input.nextDouble();
        System.out.println("Enter number of years: ");
        double numOfYears = input.nextDouble();
        double futureInvestmentValue = investmentAmount * (1 + (interestRateInPercentage / 100.0) * (double)numOfYears);
        System.out.printf("Accumulated value is $%.2f", futureInvestmentValue);
    }
}
