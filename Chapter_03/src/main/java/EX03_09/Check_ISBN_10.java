/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX03_09;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Check_ISBN_10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        int ISBN = input.nextInt();
        int d9 = ISBN % 10;
        ISBN = ISBN / 10;
        int d8 = ISBN % 10;
        ISBN = ISBN / 10;
        int d7 = ISBN % 10;
        ISBN = ISBN / 10;
        int d6 = ISBN % 10;
        ISBN = ISBN / 10;
        int d5 = ISBN % 10;
        ISBN = ISBN / 10;
        int d4 = ISBN % 10;
        ISBN = ISBN / 10;
        int d3 = ISBN % 10;
        ISBN = ISBN / 10;
        int d2 = ISBN % 10;
        ISBN = ISBN / 10;
        int d1 = ISBN % 10;
        ISBN = ISBN / 10;
        int d10 = (1 * d1 + 2 * d2 + 3 * d3 + 4 * d4 + 5 * d5 + 6 * d6 + 7 * d7 + 8 * d8 + 9 * d9) % 11;
        if(d10 != 10)
            System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
        else
            System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
    }
}
