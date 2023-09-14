/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX09_10;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, and c");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        QuadraticEquation equ = new QuadraticEquation(a, b, c);
        System.out.println("The first root is " + equ.getRoot1()
                       + "\nThe second root is " + equ.getRoot2());
    }
}
