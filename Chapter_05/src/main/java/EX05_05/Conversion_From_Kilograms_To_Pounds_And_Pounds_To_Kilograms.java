/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX05_05;

/**
 *
 * @author Zeyad Ayman
 */
public class Conversion_From_Kilograms_To_Pounds_And_Pounds_To_Kilograms {
    public static void main(String[] args) {
        int j = 20;
        System.out.printf("%-14s%6s%4s", "Kilograms", "Pounds", "|");
        System.out.printf("%12s%15s", "Pounds", "Kilograms");
        for(int i = 1; i <= 199; i += 2){
            double pounds = i * 2.2;
            double kilograms = j / 2.2;
            System.out.printf("\n%-14d%6.1f%4s", i, pounds, "|");
            if(j < 100)
                System.out.printf("%8d%19.2f", j, kilograms);
            else
                System.out.printf("%9d%18.2f", j, kilograms);
            j += 5;
        }
    }
}
