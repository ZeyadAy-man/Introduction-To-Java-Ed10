/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX04_09;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Find_The_Unicode_Of_A_Character {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character: ");
        String s = input.nextLine();
        System.out.println("The Unicode for character " + s.charAt(0) + " is " + (int)(s.charAt(0)));
    }
}
