/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX04_08;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Find_The_Character_Of_An_ASCII_Code {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an ASCII code: ");
        int code = input.nextInt();
        char x = (char)(code);
        System.out.println("The character for ASCII code " + code + " is " + x);
    }
}
