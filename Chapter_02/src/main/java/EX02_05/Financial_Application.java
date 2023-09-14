/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX02_05;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Financial_Application {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuity = input.nextDouble();
        System.out.println("The gratuity is " + ((gratuity / 100) * subtotal) + " and total is " + (((gratuity / 100) * subtotal) + subtotal));
    }
}
