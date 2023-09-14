/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX06_04;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Display_An_Integer_Reversed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        reverse(num);
    }
    public static void reverse(int num){
        String s1 = num + "";
        String s2 = "";
        for(int i = s1.length() - 1; i >= 0; i--){
            s2 = s2 + s1.charAt(i);
        }
        System.out.println("The reversed number is " + s2);
    }
}
