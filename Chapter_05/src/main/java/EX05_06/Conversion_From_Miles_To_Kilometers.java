/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX05_06;

/**
 *
 * @author Zeyad Ayman
 */
public class Conversion_From_Miles_To_Kilometers {
    public static void main(String[] args) {
        int j = 20;
        System.out.printf("%-14s%6s%4s", "Miles", "Kilometers", "|");
        System.out.printf("%12s%15s", "Kilometers", "Miles");
        for(int i = 1; i <= 10; i++){
            double kilometers = i * 1.609;
            double miles = j / 1.609;
            System.out.printf("\n%-14d%-10.3f%4s", i, kilometers, "|");
            if(j < 100)
                System.out.printf("%4d%24.3f", j, miles);
            j++;
        }
    }
 
}
