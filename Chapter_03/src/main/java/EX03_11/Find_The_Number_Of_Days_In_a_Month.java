/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX03_11;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Find_The_Number_Of_Days_In_a_Month {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = input.nextInt();
        System.out.println("Enter month number: ");
        int monthNum = input.nextInt();
        if(monthNum == 1)
            System.out.println("January " + year + " has 31 days");
        else if(monthNum == 2)
            System.out.println("February " + year + " has 28 days");
        else if(monthNum == 3)
            System.out.println("March " + year + " has 31 days");
        else if(monthNum == 4)
            System.out.println("April " + year + " has 30 days");
        else if(monthNum == 5)
            System.out.println("May " + year + " has 31 days");
        else if(monthNum == 6)
            System.out.println("June " + year + " has 30 days");
        else if(monthNum == 7)
            System.out.println("July" + year + " has 31 days");
        else if(monthNum == 8)
            System.out.println("August " + year + " has 31 days");
        else if(monthNum == 9)
            System.out.println("september " + year + " has 30 days");
        else if(monthNum == 10)
            System.out.println("October " + year + " has 31 days");
        else if(monthNum == 11)
            System.out.println("November " + year + " has 30 days");
        else if(monthNum == 12)
            System.out.println("December " + year + " has 31 days");
        else
            System.out.println("Invalid month");
        
        
        
    }
}
