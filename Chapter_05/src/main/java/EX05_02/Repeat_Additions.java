/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX05_02;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Repeat_Additions {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int correctCounter = 0;
        int questionCounter = 1;
        int num1;
        int num2;
        String output = null;
        long startTime = System.currentTimeMillis();
        while(questionCounter <= 10){
            num1 = (int)(Math.random() * 15 + 1);
            num2 = (int)(Math.random() * 15 + 1);
            if(num1 < num2){
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
            System.out.println("What is " + num1 + " - " + num2 + " ?" );
            int answer = input.nextInt();
            if(num1 - num2 == answer){
                System.out.println("You are correct! ");
                correctCounter++;
            }
            else{
                System.out.println("Your answer is wrong. " + num1 + " - " + num2 + " = " + (num1 - num2));
            }
            questionCounter++;
            output += "\n" + num1 + " - " + num2 + " = " + answer + ((num1 - num2 == answer) ? " correct" : " wrong");
        }
        long endTime = System.currentTimeMillis();
        long testTime = (endTime = startTime) / 1000;
        System.out.println("Correct count is " + correctCounter + " test time is " + testTime + " seconds");
        System.out.println(output);
    }
}
