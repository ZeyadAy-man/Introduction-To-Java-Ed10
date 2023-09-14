/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX02_06;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Sum_The_Digits_In_An_Integer {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        int sum = (number % 10) + ((number / 10) % 10) + ((number / 100));
        System.out.println("The sum of the digits is " + sum);
    }
}
