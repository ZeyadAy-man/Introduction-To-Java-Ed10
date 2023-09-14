/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX05_01;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Count_Positive_And_Negative_Numbers_And_Compute_The_Average {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer, the input ends if it is 0: ");
        int num = input.nextInt();
        int positiveCounter = 0;
        int negativeCounter = 0;
        int sum = 0;
        while(num != 0){
            if(num < 0){
                negativeCounter++;
            }
            else{
                positiveCounter++;
            }
            sum += num;
            num = input.nextInt();
        }
        System.out.println("The number of positives is " + positiveCounter);
        System.out.println("The number of negatives is " + negativeCounter);
        System.out.println("The total is " + sum);
        System.out.println("The average is " + ((double)sum /(negativeCounter + positiveCounter)));
    }
}
