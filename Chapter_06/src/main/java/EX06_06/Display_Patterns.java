/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX06_06;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Display_Patterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        displayPattern(n);
        
    }
    public static void displayPattern(int n){
        String x = "";
        for(int i = 1; i <= n; i++){
            int temp = i;
            for(int j = 1; j <= n - i; j++){
                System.out.printf("%-3s", "  ");
            }
            for(int j = i; j >= 1; j--){
                System.out.printf("%-3d", j);
                
            }
            System.out.println("");
        }
    }
}
