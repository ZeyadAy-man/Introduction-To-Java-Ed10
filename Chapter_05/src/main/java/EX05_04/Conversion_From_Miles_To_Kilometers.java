/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX05_04;

/**
 *
 * @author Zeyad Ayman
 */
public class Conversion_From_Miles_To_Kilometers {
    public static void main(String[] args) {
        double kilometers;
        System.out.printf("%-14s%6s\n", "Miles", "Kilometers");
        for(int i = 1; i <= 10; i++){
            kilometers = i * 1.609;
            System.out.printf("%-14d%-6.3f\n", i, (kilometers));
        } 
    }
}
