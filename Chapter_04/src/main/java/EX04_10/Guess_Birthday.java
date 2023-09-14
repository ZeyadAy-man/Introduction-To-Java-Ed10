/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX04_10;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Guess_Birthday {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String set1 = " 1  3  5  7\n" +
                      " 9 11 13 15\n" +
                      "17 19 21 23\n" +
                      "25 27 29 31";
        String set2 = " 2  3  6  7\n" +
                      "10 11 14 15\n" +
                      "18 19 22 23\n" +
                      "26 27 30 31";
        String set3 = " 4  5  6  7\n" +
                      "12 13 14 15\n" +
                      "20 21 22 23\n" +
                      "28 20 30 31";
        String set4 = " 8  9 10 11\n" +
                      "12 13 14 15\n" +
                      "24 25 26 27\n" +
                      "28 29 30 31\n";
        String set5 = "16 17 18 19\n" +
                      "20 21 22 23\n" +
                      "24 25 26 27\n" +
                      "28 29 30 31\n";
        int day = 0;
        System.out.println("Is your birthday in set1?\n");
        System.out.println(set1);
        System.out.println("\nEnter N for No and Y for Yes");
        String answer = input.nextLine();
        char ans = (answer.charAt(0));
        if(ans == 'y' || ans == 'Y'){
            day += 1;
        }
        System.out.println("Is your birthday in set2?\n");
        System.out.println(set2);
        System.out.println("\nEnter N for No and Y for Yes");
        answer = input.nextLine();
        ans = (answer.charAt(0));
        if(ans == 'y' || ans == 'Y'){
            day += 2;
        }
        System.out.println("Is your birthday in set3?\n");
        System.out.println(set3);
        System.out.println("\nEnter N for No and Y for Yes");
        answer = input.nextLine();
        ans = (answer.charAt(0));
        if(ans == 'y' || ans == 'Y'){
            day += 4;
        }
        System.out.println("Is your birthday in set4?\n");
        System.out.println(set4);
        System.out.println("\nEnter N for No and Y for Yes");
        answer = input.nextLine();
        ans = (answer.charAt(0));
        if(ans == 'y' || ans == 'Y'){
            day += 8;        
        }
        System.out.println("Is your birthday in set5?\n");
        System.out.println(set5);
        System.out.println("\nEnter N for No and Y for Yes");
        answer = input.nextLine();
        ans = (answer.charAt(0));
        if(ans == 'y' || ans == 'Y'){
            day += 16;
        }
        System.out.println("Your birthday is " + day);
    }
}
