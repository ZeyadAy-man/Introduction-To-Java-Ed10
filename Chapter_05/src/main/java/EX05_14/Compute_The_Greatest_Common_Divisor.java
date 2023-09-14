/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX05_14;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Compute_The_Greatest_Common_Divisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two positive integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if(num1 < 0 || num2 < 0){
            System.out.println("You entered invalid values");
            System.exit(0);
        }
        int min = num1;
        if(num1 > num2){
            min = num2;
        }
        else{
            min = num1;
        }
        int gcd = 0;
        for(int i = num1; i >= 1; i--){
            if(num1 % i == 0 && num2 % i == 0){
                gcd = i;
                break;
            }
        }
        System.out.println("The gcd for " + num1 + " and " + num2 + " is " + gcd);
    }
}
