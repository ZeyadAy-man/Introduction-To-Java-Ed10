/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX03_12;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Palindrome_Number {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a three-digit integer: ");
        int number = input.nextInt();
        int firstDigit = number % 10;
        int lastDigit = (int)(number / 100);
        if(number / 100 == 0){
            if(firstDigit == lastDigit)
                System.out.println("0" + number + " is a palindrome");
            else
                System.out.println("0" + number + " is not a palindrome");
        }
        else{
            if(firstDigit == lastDigit)
                System.out.println(number + " is a palindrome");
            else
                System.out.println(number + " is not a palindrome");
        }
    }
}
