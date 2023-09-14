/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX05_09;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Find_The_Two_Highest_Scores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        double score;
        double highestScore1 = 0;
        String nameOfHighestScore1 = null;
        double highestScore2 = 0;
        String nameOfHighestScore2 = null;
        System.out.println("Enter the number of the students: ");
        int numOfStudents = input.nextInt();
        for(int i = 1; i <= numOfStudents; i++){
            System.out.println("Enter the name of students number " + i + ":");
            name = input.next();
            System.out.println("Enter the student's number " + i + " score:");
            score = input.nextDouble();
            if(score >= highestScore1){
                highestScore1 = score;
                nameOfHighestScore1 = name;
            }
            else if(score >= highestScore2 && score <= highestScore1){
                highestScore2 = score;
                nameOfHighestScore2 = name;
            }
        }
        System.out.println("The first student is " + nameOfHighestScore1 + " and his score is " + highestScore1);
        System.out.println("The second student is " + nameOfHighestScore2 + " and his score is " + highestScore2);
    }
}
