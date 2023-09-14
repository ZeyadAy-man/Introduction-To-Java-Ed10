/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX02_07;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Find_The_Number_Of_Years {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of minutes: ");
        int minutes = input.nextInt();
        System.out.println(minutes + " minutes is approximately " + (minutes / (365 * 24 * 60)) + " years and " + ((minutes / (60 * 24)) % 365) + " days");
    }
}
