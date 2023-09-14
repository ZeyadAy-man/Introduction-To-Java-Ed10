/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX05_13;

/**
 *
 * @author Zeyad Ayman
 */
public class Find_The_Largest_N_Such_That_N_Power_3_Smaller_Than_12000 {
    public static void main(String[] args) {
        int n = 1;
        while(n * n * n < 12000){
            n++;
        }
        System.out.println(n - 1);
    }
}
