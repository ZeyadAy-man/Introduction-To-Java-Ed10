/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX02_13;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Compound_Value {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the monthlu saving amount: ");
        double money0 = input.nextDouble();
        double money1 = 100 * (1 + 0.00417);
        double money2 = (money1 + 100) * (1 + 0.00417);
        double money3 = (money2 + 100) * (1 + 0.00417);
        double money4 = (money3 + 100) * (1 + 0.00417);
        double money5 = (money4 + 100) * (1 + 0.00417);
        double money6 = (money5 + 100) * (1 + 0.00417);
        System.out.printf("After the sixth month, the account value is $%.2f", money6);
    }
}
