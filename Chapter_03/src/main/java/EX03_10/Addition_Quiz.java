/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX03_10;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Addition_Quiz {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1 = (int)(Math.random() * 50);
        int num2 = (int)(Math.random() * 51);
        System.out.println("What is " + num1 + " + " + num2 + " ?");
        int answer = input.nextInt();
        if(answer == num1 + num2)
            System.out.println("Your answer is correct! ");
        else
            System.out.println("Your answer is incorrect ");
        
    }
}
