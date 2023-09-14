/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX02_12;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Physics_Finding_Runway_Length {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter speed and acceleration: ");
        double speed = input.nextDouble();
        double Acceleration = input.nextDouble();
        System.out.printf("The minimum runway length for this airplane is %.3f", (speed * speed / (2 * Acceleration)));
    }
}
