/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX03_27;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Points_In_A_Triangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a point's x and y coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double tanTheta = 100.0 / 200;
        double tanThetaDash = y / (200 - x);
        if((x > 200) || (x < 0) || (y > 100) || (y < 0)){
            System.out.println("The point is not in the triangle");
            System.exit(0);
        }
        if((tanTheta >= tanThetaDash) || ((x == 200) && (y == 0)))
            System.out.println("The point is in the triangle");
        else
            System.out.println("The point is not in the triangle");
    }
}
