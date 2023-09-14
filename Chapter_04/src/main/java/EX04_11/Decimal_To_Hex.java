/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX04_11;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Decimal_To_Hex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal value (0 to 15): ");
        int number = input.nextInt();
        if(number >= 0 && number <= 15){
            if(number >= 10 && number <= 15){
                switch(number){
                    case 10: System.out.println("The hex value is A");
                    break;
                    case 11: System.out.println("The hex value is B");
                    break;
                    case 12: System.out.println("The hex value is C");
                    break;
                    case 13: System.out.println("The hex value is D");
                    break;
                    case 14: System.out.println("The hex value is E");
                    break;
                    case 15: System.out.println("The hex value is F");
                    break;
                }
            }
            else{
                System.out.println("The hex value is " + number);
            }
        }
        else{
            System.out.println(number + " is an invalid input");
        }
    }
}
