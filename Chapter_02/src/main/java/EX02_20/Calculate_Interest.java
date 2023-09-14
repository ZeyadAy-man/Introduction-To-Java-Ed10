/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX02_20;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Calculate_Interest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter balance and interest rate: ");
        double balance = input.nextDouble();
        double interestRate = input.nextDouble();
        double interest =  balance * interestRate / 1200;
        System.out.printf("The interest is %.5f", interest);
    }
}
