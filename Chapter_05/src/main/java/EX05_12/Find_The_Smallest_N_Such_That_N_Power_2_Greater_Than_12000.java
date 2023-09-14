/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX05_12;

/**
 *
 * @author Zeyad Ayman
 */
public class Find_The_Smallest_N_Such_That_N_Power_2_Greater_Than_12000 {
    public static void main(String[] args) {
        int n = 1;
        while(n * n < 12000){
            n++;
        }
        System.out.println(n);
    }
}
