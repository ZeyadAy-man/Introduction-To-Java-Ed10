/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX03_15;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Lottery {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int winKey = (int)(Math.random() * 900) + 100;
        System.out.println("Enter a number consist of 3 digits: ");
        int answer = input.nextInt();
        int answerDigit1 = (answer % 10);
        int answerDigit2 = (answer / 10) % 10;
        int answerDigit3 = (int)(answer / 100);
        int winKeyDigit1 = (winKey % 10);
        int winKeyDigit2 = (winKey / 10) % 10;
        int winKeyDigit3 = (int)(answer / 100);
        if((answerDigit1 == winKeyDigit1) && (answerDigit2 == winKeyDigit2) && (answerDigit3 == winKeyDigit3)){
            System.out.println("Congratulations! You won &10,000");
        }
        else if(((answerDigit1 == winKeyDigit3) && (answerDigit2 == winKeyDigit2) && (answerDigit3 == winKeyDigit1)) ||
                ((answerDigit1 == winKeyDigit2) && (answerDigit2 == winKeyDigit1) && (answerDigit3 == winKeyDigit3)) ||
                ((answerDigit1 == winKeyDigit1) && (answerDigit2 == winKeyDigit3) && (answerDigit3 == winKeyDigit2)) ||
                ((answerDigit1 == winKeyDigit2) && (answerDigit2 == winKeyDigit3) && (answerDigit3 == winKeyDigit1)) ||
                ((answerDigit1 == winKeyDigit3) && (answerDigit2 == winKeyDigit1) && (answerDigit3 == winKeyDigit2))){
            System.out.println("You got the number but not in order, Congratulation You won $3,000 ");
        }
        else if((answerDigit1 == winKeyDigit1) || (answerDigit1 == winKeyDigit2) || (answerDigit1 == winKeyDigit3) || 
                (answerDigit2 == winKeyDigit1) || (answerDigit2 == winKeyDigit2) || (answerDigit2 == winKeyDigit3) ||
                (answerDigit3 == winKeyDigit1) || (answerDigit3 == winKeyDigit2) || (answerDigit3 == winKeyDigit3)){
                System.out.println("You Entered only one or two digits right, Congratulations! you won $1,000");
        }
        else
            System.out.println("You lost");
        
    }
}
