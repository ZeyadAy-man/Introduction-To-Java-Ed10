/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX03_05;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Find_Future_Dates {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter today's day: ");
        int numOfDay = input.nextInt();
        System.out.println("Enter the number of days elapsed since today: ");
        int numOfElapsedDays = input.nextInt();
        String nameOfDay;
        if((numOfDay) % 7 == 0)
            nameOfDay = "Sunday";
        else if((numOfDay) % 7 == 1)
            nameOfDay = "Monday";
        else if((numOfDay) % 7 == 2)
            nameOfDay = "Tuesday";
        else if((numOfDay) % 7 == 3)
            nameOfDay = "Wednesday";
        else if((numOfDay) % 7 == 4)
            nameOfDay = "Thursday";
        else if((numOfDay) % 7 == 5)
            nameOfDay = "Friday";
        else
            nameOfDay = "Saturday";
        
        String nameOfElapsedDay;
        if((numOfElapsedDays + numOfDay) % 7 == 0)
            nameOfElapsedDay = "Sunday";
        else if((numOfElapsedDays + numOfDay) % 7 == 1)
            nameOfElapsedDay = "Monday";
        else if((numOfElapsedDays + numOfDay) % 7 == 2)
            nameOfElapsedDay = "Tuesday";
        else if((numOfElapsedDays + numOfDay) % 7 == 3)
            nameOfElapsedDay = "Wednesday";
        else if((numOfElapsedDays + numOfDay) % 7 == 4)
            nameOfElapsedDay = "Thursday";
        else if((numOfElapsedDays + numOfDay) % 7 == 5)
            nameOfElapsedDay = "Friday";
        else
            nameOfElapsedDay = "Saturday";
        System.out.println("Today is " + nameOfDay + " and the future day is " + nameOfElapsedDay);
    }
}
