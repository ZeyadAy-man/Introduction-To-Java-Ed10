/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX04_13;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Vowel_Or_Consonant {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        String s = input.nextLine();
        char key = s.charAt(0);
        if((key >= 'a' && key <= 'z') || (key >= 'A' && key <= 'Z')){
            if(key == 'a' || key == 'e' || key == 'i' || key == 'u' || key == 'o' || key == 'A' || key == 'U' || key == 'I' || key == 'O')
                System.out.println(key + " is a vowel");
            else
                System.out.println(key + " is a consonant");
        }
        else
            System.out.println(key + " is an invalid input");            
    }
}
