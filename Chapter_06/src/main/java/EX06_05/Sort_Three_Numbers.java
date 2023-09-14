/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX06_05;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Sort_Three_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        displaySortedNumbers(num1, num2, num3);
    }
    public static void displaySortedNumbers(double num1, double num2, double num3){
        if(num1 >= num2 && num2 >= num3)
            System.out.println(num3 + " " + num2 + " " + num1);
        else if(num1 >= num3 && num3 >= num2)
            System.out.println(num2 + " " + num3 + " " + num1);
        else if(num2 >= num1 && num1 >= num3)
            System.out.println(num3 + " " + num1 + " " + num2);
        else if(num2 >= num3 && num3 >= num1)
            System.out.println(num1 + " " + num3 + " " + num2);
        else if(num3 >= num1 && num1 >= num2)
            System.out.println(num2 + " " + num1 + " " + num3);
        else if(num3 >= num2 && num2 >= num1)
            System.out.println(num1 + " " + num2 + " " + num3);
    }
}
