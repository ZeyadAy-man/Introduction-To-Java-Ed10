/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX04_15;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Phone_Key_Pads {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        String s = input.nextLine();
        char key = s.charAt(0);
        if((key >= 'a' && key <= 'z') || (key >= 'A' && key <= 'Z')){
            if((key >= 'a' && key <= 'c') || (key >= 'A' && key <= 'C'))
                System.out.println("The corresponding number is 2");
            else if((key >= 'd' && key <= 'f') || (key >= 'D' && key <= 'F'))
                System.out.println("The corresponding number is 3");
            else if((key >= 'g' && key <= 'i') || (key >= 'G' && key <= 'I'))
                System.out.println("The corresponding number is 4");
            else if((key >= 'j' && key <= 'l') || (key >= 'J' && key <= 'L'))
                System.out.println("The corresponding number is 5");
            else if((key >= 'm' && key <= 'o') || (key >= 'M' && key <= 'O'))
                System.out.println("The corresponding number is 6");
            else if((key >= 'p' && key <= 's') || (key >= 'P' && key <= 'S'))
                System.out.println("The corresponding number is 7");
            else if((key >= 't' && key <= 'v') || (key >= 'T' && key <= 'V'))
                System.out.println("The corresponding number is 8");
            else if((key >= 'w' && key <= 'z') || (key >= 'W' && key <= 'Z'))
                System.out.println("The corresponding number is 9");
        }
        else
            System.out.println(key + " is an invalid input");
            
    }
}
