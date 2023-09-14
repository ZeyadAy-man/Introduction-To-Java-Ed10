/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX02_01;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Convert_Celsius_To_Fahrenheit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter degree in celsius :");
        int degree = input.nextInt();
        System.out.printf("%d Celsius is %.1f", degree, (((9.0 / 5) * degree) + 32));
    }
}
