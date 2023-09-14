/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX04_12;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Hex_To_Binary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a hex digit");
        char hex = (input.next()).charAt(0);
        if(hex <= 'F' && hex >= 'A'){
            String s = "";
            int num = 0;
            switch(hex){
                case 'A': num = 10;
                break;
                case 'B': num = 11;
                break;
                case 'C': num = 12;
                break;
                case 'D': num = 13;
                break;
                case 'E': num = 14;
                break;
                case 'F': num = 15;
                break;
            }
            if(num - 8 >= 0){
                s = s + "1";
                num = num - 8;
            }
            else{
                s = s + "0";
            }
            if(num - 4 >= 0){
                s = s + "1";
                num = num - 4;
            }
            else{
                s = s + "0";
            }
            if(num - 2 >= 0){
                s = s + "1";
                num = num - 2;
            }
            else{
                s = s + "0";
            }
            if(num - 1 >= 0){
                s = s + "1";
                num = num - 1;
            }
            else{
                s = s + "0";
            }
            System.out.println("The binary value is " + s);
        }
        else if(hex <= '9' && hex >= '0'){
            int num = Integer.parseInt(hex + "");
            String s = "";
            if(num - 8 >= 0){
                s = s + "1";
                num = num - 8;
            }
            else{
                s = s + "0";
            }
            if(num - 4 >= 0){
                s = s + "1";
                num = num - 4;
            }
            else{
                s = s + "0";
            }
            if(num - 2 >= 0){
                s = s + "1";
                num = num - 2;
            }
            else{
                s = s + "0";
            }
            if(num - 1 >= 0){
                s = s + "1";
                num = num - 1;
            }
            else{
                s = s + "0";
            }
            System.out.println("The binary value is " + s);
        }
        else{
            System.out.println("You entered invalid input");
        }
    }
}
