/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX03_14;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Heads_Or_Tails {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       int value = (int)(Math.random() * 2);
       String headOrTail;
       if(value == 0)
           headOrTail = "head";
       else
           headOrTail = "Tail";
        System.out.println("Enter your guess 0 for head, 1 for tail");
        int answer = input.nextInt();
        if(answer == value)
            System.out.println("Your answer is correct! and it's " + headOrTail);
        else
            System.out.println("Your answer is wrong and the answer is " + headOrTail);
    }
}