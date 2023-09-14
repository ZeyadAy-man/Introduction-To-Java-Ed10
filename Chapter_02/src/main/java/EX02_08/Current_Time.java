/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX02_08;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Current_Time {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        long totalTimeInMilliSeconds = System.currentTimeMillis();
        long totalTimeInSeconds = (totalTimeInMilliSeconds / 1000);
        long totalTimeInMinutes = (totalTimeInSeconds / 60);
        long totalTimeInHours = (totalTimeInMinutes / 60);
        System.out.println("Enter the time zone offset to GMT: ");
        int TimeZoneOffset = input.nextInt();
        System.out.println("The current time is " + (totalTimeInHours % 24 - TimeZoneOffset) + ":" + (totalTimeInMinutes % 60) + ":" + (totalTimeInSeconds % 60));
        
    }
}
