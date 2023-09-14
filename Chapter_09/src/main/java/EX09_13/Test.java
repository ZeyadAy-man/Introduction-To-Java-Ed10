/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX09_13;

/**
 *
 * @author Zeyad Ayman
 */
import static EX09_13.Location.locateLargest;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the array: ");
        int row = input.nextInt();
        int column = input.nextInt();
        double [][] arr = new double[row][column];
        Location location = new Location(row, column);
        System.out.println("Enter the array: ");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = input.nextDouble();
            }
        }
        location = locateLargest(arr);
        System.out.println("The location of the largest element is " 
                + location.maxValue + " at (" + (location.row + 1)
                + ", " + (location.column + 1) + ")");
    }
}
