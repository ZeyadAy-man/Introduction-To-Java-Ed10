/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX02_11;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Population_Projection {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of years: ");
        int numOfYears = input.nextInt();
        int time = 3600 * 24 * 365;
	int born = time / 7;
	int death = time / 13;
	int immigrant = time / 45;
	int current_population = 312032486;
	int population = born + immigrant - death;
	for (int i = 1; i <= numOfYears; i++) {
            current_population = current_population + population;
	}
        System.out.println("The population after " + numOfYears + " is : " + current_population);
    }
}
