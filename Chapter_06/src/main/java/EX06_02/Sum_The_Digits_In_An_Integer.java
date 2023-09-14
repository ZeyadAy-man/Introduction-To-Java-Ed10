/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX06_02;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Sum_The_Digits_In_An_Integer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        long n = input.nextInt();
        System.out.println("The sum of " + n + " digits is " + sumDigits(n));
    }
    public static int sumDigits(long n){
        long sum = 0;
        while(n != 0){
            sum = sum + n % 10;
            n = n / 10;
        }
        return (int)sum;
    }
}
