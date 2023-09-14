/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX04_17;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Days_Of_A_Month {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = input.nextInt();
        System.out.println("Enter a month: ");
        String month = input.next();
        if(month.equals("Jan"))
            System.out.println("January " + year + " has 31 days");
        else if(month.equals("Feb"))
            System.out.println("February " + year + " has 28 days");
        else if(month.equals("Mar"))
            System.out.println("March " + year + " has 31 days");
        else if(month.equals("Apr"))
            System.out.println("April " + year + " has 30 days");
        else if(month.equals("May"))
            System.out.println("May " + year + " has 31 days");
        else if(month.equals("Jun"))
            System.out.println("June " + year + " has 30 days");
        else if(month.equals("Jul"))
            System.out.println("July" + year + " has 31 days");
        else if(month.equals("Aug"))
            System.out.println("August " + year + " has 31 days");
        else if(month.equals("Sep"))
            System.out.println("September " + year + " has 30 days");
        else if(month.equals("Oct"))
            System.out.println("October " + year + " has 31 days");
        else if(month.equals("Nov"))
            System.out.println("November " + year + " has 30 days");
        else if(month.equals("Dec"))
            System.out.println("December " + year + " has 31 days");
        else
            System.out.println("Invalid month");
        
    }
}
