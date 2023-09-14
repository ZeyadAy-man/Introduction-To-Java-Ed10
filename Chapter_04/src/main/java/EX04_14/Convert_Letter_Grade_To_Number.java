/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX04_14;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Convert_Letter_Grade_To_Number {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter grade: ");
        String s = input.nextLine();
        char key = s.charAt(0);
        int numericValue;
        if(key >= 'A' && key <= 'F'){
            if(key == 'A')
                numericValue = 4;
            else if(key == 'B')
                numericValue = 3;
            else if(key == 'C')
                numericValue = 2;
            else if(key == 'D')
                numericValue = 1;
            else
                numericValue = 0;
            System.out.println("The numeric value for grade " + key + " is " + numericValue);
        }
        else
            System.out.println(key + " is an invalid grade");
        
    }
}
