/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX05_03;

/**
 *
 * @author Zeyad Ayman
 */

public class Conversion_From_Kilograms_To_Pounds {
    public static void main(String[] args) {
        double pounds;
        System.out.printf("%-14s%6s\n", "Kilograms", "Pounds");
        for(int i = 1; i <= 199; i += 2){
            pounds = i * 2.2;
            System.out.printf("%-14d%6.1f\n", i, (pounds));
        }
    }
}
