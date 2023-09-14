/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX02_04;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Convert_Pounds_Into_Kilograms {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number in pounds: ");
        double pounds = input.nextDouble();
        System.out.printf("%.1f pounds is %.3f kilograms", pounds, (pounds * 0.454));
    }
}
