/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX06_07;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Compute_The_Future_Investment_Value {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the investment amount: ");
        double investmentAmount = input.nextDouble();
        System.out.println("Enter the interest rate: ");
        double interestRate = input.nextDouble();
        System.out.println("Years     Future Value");
        for(int i = 1; i <= 30; i++){
            System.out.printf("%-13d%8.2f\n", i, futureInvestmentValue(investmentAmount, (interestRate / 100) / 12, i));
        }
    }
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
        return futureInvestmentValue;
    }
}
