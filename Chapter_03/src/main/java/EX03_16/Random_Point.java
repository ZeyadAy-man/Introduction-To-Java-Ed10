/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX03_16;

/**
 *
 * @author Zeyad Ayman
 */
public class Random_Point {
    public static void main(String[] args){
        int widthDividedByTwo = (int)(Math.random() * 101) - 50;
        int heightDividedByTwo = (int)(Math.random() * 201) - 100;
        System.out.println("The point coordinate is " + "(" + widthDividedByTwo + ", " + heightDividedByTwo + ")");
    }
}
