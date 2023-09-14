/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX03_08;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Sort_Three_Numbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        if(num1 > num2){
            
        }
        else{
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if(num2 > num3){
            
        }
        else{
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if(num1 > num3){
            
        }
        else{
            int temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if(num1 > num2){
            
        }
        else{
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println(num3 + " " + num2 + " " + num1);
    }
}
