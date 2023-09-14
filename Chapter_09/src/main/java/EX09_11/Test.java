/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX09_11;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c, d, e, and f");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        LinearEquation L1 = new LinearEquation(a, b, c, d, e, f);
        if(L1.isSolvable()){
            System.out.println("X = " + L1.getX() + "\nY = " + L1.getY());     
        }
        else{
            System.out.println("The equation has no solution.");
        }
    }
}
