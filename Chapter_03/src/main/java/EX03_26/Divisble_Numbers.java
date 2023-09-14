/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX03_26;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Divisble_Numbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = input.nextInt();
        boolean divisble = false;
        if((num % 5 == 0) && (num % 6 == 0)){
            divisble = true;
            System.out.println("is " + num + " divisble by 5 and 6 ? " + divisble);
        }
        else{
            divisble = false;
            System.out.println("is " + num + " divisble by 5 and 6 ? " + divisble);
        }
        if((num % 5 == 0) || (num % 6 == 0)){
            divisble = true;
            System.out.println("is " + num + " divisble by 5 or 6 ? " + divisble);
        }
        else{
            divisble = false;
            System.out.println("is " + num + " divisble by 5 or 6 ? " + divisble);
        }
        if((num % 5 == 0) ^ (num % 6 == 0)){
            divisble = true;
            System.out.println("is " + num + " divisble by 5 or 6, but not both ? " + divisble);
        }
        else{
            divisble = false;
            System.out.println("is " + num + " divisble by 5 or 6, but not both ? " + divisble);
        }
        
    }
}
