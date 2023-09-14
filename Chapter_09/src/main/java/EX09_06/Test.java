/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX09_06;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Arrays;
public class Test {
    public static void main(String[] args) {
        int [] arr = new int[100000];
        for(int i = 1; i < 100000; i++){
            arr[i] = (int)(Math.random() * 101);
        }
        System.out.println(1 / 0);
        Stopwatch w1 = new Stopwatch();
        java.util.Arrays.sort(arr);
        w1.stop();
        System.out.println(w1.getElapsedTime());
    }
}
