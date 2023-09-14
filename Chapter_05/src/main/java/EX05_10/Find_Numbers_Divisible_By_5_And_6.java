/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX05_10;

/**
 *
 * @author Zeyad Ayman
 */
public class Find_Numbers_Divisible_By_5_And_6 {
    public static void main(String[] args) {
        int counter = 0;
        for(int i = 100; i <= 1000; i++){
            if(i % 5 == 0 && i % 6 == 0){
                counter++;
                System.out.printf("%4d", i);
                if(counter % 10 == 0)
                    System.out.println("");
            }
                
        }
    }
}
