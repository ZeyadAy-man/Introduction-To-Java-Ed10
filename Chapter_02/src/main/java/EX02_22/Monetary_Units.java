/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX02_22;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Monetary_Units {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        int num = input.nextInt();
        int firstDigit = num % 10;
        int secondDigit = (int)((num % 100) / 10);
        int remainingNum = (int)(num / 100);
        System.out.println("the input " + num + " represents " + remainingNum + " dollars " + secondDigit + "" + firstDigit + " cents");
    }
}
