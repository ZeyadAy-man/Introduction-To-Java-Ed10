/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX03_24;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Pick_A_Card {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int cardNum = (int)((Math.random() * 13) + 1) ;
        int cardNumType = (int)((Math.random() * 4) + 1);
        String cardName = null;
        String cardType = null;
        if(cardNum == 1)
            cardName = "Ace";
        else if(cardNum == 2)
            cardName = "2";
        else if(cardNum == 3)
            cardName = "3";
        else if(cardNum == 4)
            cardName = "4";
        else if(cardNum == 5)
            cardName = "5";
        else if(cardNum == 6)
            cardName = "6";
        else if(cardNum == 7)
            cardName = "7";
        else if(cardNum == 8)
            cardName = "8";
        else if(cardNum == 9)
            cardName = "9";
        else if(cardNum == 10)
            cardName = "10";
        else if(cardNum == 11)
            cardName = "Jack";
        else if(cardNum == 12)
            cardName = "Queen";
        else if(cardNum == 13)
            cardName = "King";
        if(cardNumType == 1)
            cardType = "Clubs";
        else if(cardNumType == 2)
            cardType = "Diamonds";
        else if(cardNumType == 3)
            cardType = "Hearts";
        else if(cardNumType == 4)
            cardType = "Spades";
        System.out.println("The card you picked is " + cardName + " of " + cardType);
    }
}
