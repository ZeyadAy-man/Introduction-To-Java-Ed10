/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX09_04;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Random;
public class Using_Random {
    public static void main(String[] args) {
        Random random = new Random(1000);
        for(int i = 1; i <= 50; i++){
            System.out.println(random.nextInt(100));
        }
    }
}
