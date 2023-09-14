/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX04_19;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Check_ISBN_10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        String ISBN = input.next();
        String d1 = ISBN.charAt(0) + "";
        String d2 = ISBN.charAt(1) + "";
        String d3 = ISBN.charAt(2) + "";
        String d4 = ISBN.charAt(3) + "";
        String d5 = ISBN.charAt(4) + "";
        String d6 = ISBN.charAt(5) + "";
        String d7 = ISBN.charAt(6) + "";
        String d8 = ISBN.charAt(7) + "";
        String d9 = ISBN.charAt(8) + "";
        int d10 = (1 * Integer.parseInt(d1) + 2 * Integer.parseInt(d2) + 3 * Integer.parseInt(d3) + 4 * Integer.parseInt(d4) + 5 * Integer.parseInt(d5) + 6 * Integer.parseInt(d6) + 7 * Integer.parseInt(d7) + 8 * Integer.parseInt(d8) + 9 * Integer.parseInt(d9)) % 11;
        if(d10 != 10)
            System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
        else
            System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
    }
}
