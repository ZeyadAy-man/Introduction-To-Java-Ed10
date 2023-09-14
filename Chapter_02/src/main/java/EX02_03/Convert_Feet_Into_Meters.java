/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX02_03;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Convert_Feet_Into_Meters {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for feet: ");
        double feet = input.nextDouble();
        System.out.printf("%.1f feet is %.4f meters", feet, (feet * 0.305));
    }
}
