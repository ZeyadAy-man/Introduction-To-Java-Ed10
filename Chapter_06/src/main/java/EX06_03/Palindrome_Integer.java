/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX06_03;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Palindrome_Integer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        if(isPalindrome(num))
            System.out.println("The number " + num + " is Palindrome");
        else
            System.out.println("The number " + num + " is not Palindrome");
    }
    public static int reverse(int number){
        String s1 = number + "";
        String s2 = "";
        for(int i = s1.length() - 1; i >= 0; i--){
            s2 = s2 + s1.charAt(i);
        }
        int num = Integer.parseInt(s2);
        return num;
    }
    public static boolean isPalindrome(int number){
        if(number == reverse(number))
            return true;
        else
            return false;
    }
}
