/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX04_02;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Great_Circle_Distance {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
        double latitude1 = input.nextDouble();
        double longitude1 = input.nextDouble();
        System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
        double latitude2 = input.nextDouble();
        double longitude2 = input.nextDouble();
        double distance = 6371.01 * Math.acos(Math.sin(Math.toRadians(latitude1)) 
                * Math.sin(Math.toRadians(latitude2)) + 
                Math.cos(Math.toRadians(latitude1)) * 
                        Math.cos(Math.toRadians(latitude2)) 
                        * Math.cos(Math.toRadians(longitude2) - Math.toRadians(longitude1)));
        System.out.println("The distance between the two points is " + distance);
    }
}
