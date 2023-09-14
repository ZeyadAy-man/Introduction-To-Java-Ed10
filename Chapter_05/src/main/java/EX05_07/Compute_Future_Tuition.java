/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX05_07;

/**
 *
 * @author Zeyad Ayman
 */
public class Compute_Future_Tuition {
    public static void main(String[] args) {
        double tuition = 10000;
        double sum = 0;
        for(int i = 1 ; i <= 14; i++){
            tuition = tuition + (5.0 / 100) * tuition;
            if(i >= 11 && i <= 14){
                sum += tuition;
            }
        }
        System.out.println("The tuition after 10 years for 4 years is " + sum);
    }
}
