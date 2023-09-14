/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX05_11;

/**
 *
 * @author Zeyad Ayman
 */
public class Find_Numbers_Divisble_By_5_Or_6 {
    public static void main(String[] args) {
        int counter = 0;
        for(int i = 100; i <= 200; i++){
            if(i % 5 == 0 || i % 6 == 0){
                counter++;
                System.out.printf("%4d", i);
                if(counter % 10 == 0)
                    System.out.println("");
            }
        }
    }
}
