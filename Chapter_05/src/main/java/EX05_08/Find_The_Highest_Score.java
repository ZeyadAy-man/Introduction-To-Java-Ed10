/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX05_08;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Find_The_Highest_Score {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        double score;
        double highestScore = 0;
        String nameOfHighestScore = null;
        System.out.println("Enter the number of the students: ");
        int numOfStudents = input.nextInt();
        for(int i = 1; i <= numOfStudents; i++){
            System.out.println("Enter the name of students number " + i + ":");
            name = input.next();
            System.out.println("Enter the student's number " + i + " score:");
            score = input.nextDouble();
            if(score >= highestScore){
                highestScore = score;
                nameOfHighestScore = name;
            }
        }
        System.out.println("The student with highest score is " + nameOfHighestScore + " and his score is " + highestScore);
    }
}
