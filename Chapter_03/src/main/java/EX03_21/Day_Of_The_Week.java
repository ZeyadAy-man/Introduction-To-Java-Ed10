/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX03_21;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Day_Of_The_Week {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = input.nextInt();
        System.out.println("Enter number of the month 1-12: ");
        int month = input.nextInt();
        System.out.println("Enter the number of day in month 1-31: ");
        int day = input.nextInt();
        if(month == 1 || month == 2){
            month = (month == 1) ? 13 : 14;
            year--;
        }
        int k = year % 100;
        int j = year / 100;
        int h = (day + (26 * (month + 1)) / 10 + k 
				+ k / 4 + j / 4 + 5 * j - 1) % 7; 
        if(h == 0)
            System.out.println("Day of the week is Sunday");
        else if(h == 1)
            System.out.println("Day of the week is Monday");
        else if(h == 2)
            System.out.println("Day of the week is Tuesday");
        else if(h == 3)
            System.out.println("Day of the week is Wednesday");
        else if(h == 4)
            System.out.println("Day of the week is Thursday");
        else if(h == 5)
            System.out.println("Day of the week is Friday");
        else if(h == 6)
            System.out.println("Day of the week is Saturday");
    }
}
