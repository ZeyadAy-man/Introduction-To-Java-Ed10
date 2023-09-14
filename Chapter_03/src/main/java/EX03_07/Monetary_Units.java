/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX03_07;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Monetary_Units {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount in double, for example 11.56: ");
        double amount = input.nextDouble();
        int remainingAmount = (int)(amount * 100);
        int numberOfOneDollar = (remainingAmount / 100);
        remainingAmount = remainingAmount % 100;
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        int numberOfPennies = remainingAmount;
        String nameOfDollar;
        String nameOfQuarter;
        String nameOfDime;
        String nameOfNickel;
        String nameOfPenny;
        if(numberOfOneDollar > 1)
            nameOfDollar = "Dollars";
        else
            nameOfDollar = "Dollar";
        if(numberOfQuarters > 1)
            nameOfQuarter = "Quarters";
        else
            nameOfQuarter = "Quarter";
        if(numberOfDimes > 1)
            nameOfDime = "Dimes";
        else
            nameOfDime = "Dime";
        if(numberOfNickels > 1)
            nameOfNickel = "Nickels";
        else
            nameOfNickel = "Nickel";
        if(numberOfPennies > 1)
            nameOfPenny = "Pennies";
        else
            nameOfPenny = "Penny";
        System.out.println("you have " + numberOfOneDollar + " " + nameOfDollar + "," + numberOfQuarters + " " + nameOfQuarter + ", " + numberOfDimes + " " + nameOfDime + ", " + numberOfNickels + " " + nameOfNickel + " and " + numberOfPennies + " " + nameOfPenny);
        
        
       
    }
}
