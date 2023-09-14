/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX03_17;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Scissor_Rock_And_Paper {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int compSelection = (int)(Math.random() * 3);
        System.out.println("Scissor (0), Rock (1), Paper (2): ");
        int answer = input.nextInt();
        String ans = null;
        String key = null;
        if(answer == 0){
            ans = "Scissor";
        }
        else if(answer == 1){
            ans = "Rock";
        }
        else if(answer == 2){
            ans = "Paper";
        }
        else{
            System.out.println("You entered invalid value");
            System.exit(0);
        }
        if(compSelection == 0)
            key = "Scissor";
        else if(compSelection == 1)
            key = "Rock";
        else if(compSelection == 2)
            key = "Paper";
        if(compSelection == answer){
            System.out.println("The computer is " + key + ". You are " + ans + " too. it's a  draw" );
        }
        else if(((compSelection == 0) && (answer == 2)) || ((compSelection == 1) && (answer == 0)) || ((compSelection == 2) && (answer == 1))){
            System.out.println("The computer is " + key + ". You are " + ans + ". You lost");
        }
        else if(((answer == 0) && (compSelection == 2)) || ((answer == 1) && (compSelection == 0)) || ((answer == 2) && (compSelection == 1))){
            System.out.println("The computer is " + key + ". You are " + ans + ". You won");
        }
        
        
    }
}
