/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX03_02;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Add_Three_Numbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);
        int num3 = (int)(Math.random() * 10);
        System.out.println("What is the sum of " + num1 + " + " + num2 + " + " + num3 + " ?");
        int answer = input.nextInt();
        if(num1 + num2 + num3 == answer){
            System.out.println("Your answer is correct! ");
        }
        else{
            System.out.println("Your answer is wrong :( ");
        }
    }
}
