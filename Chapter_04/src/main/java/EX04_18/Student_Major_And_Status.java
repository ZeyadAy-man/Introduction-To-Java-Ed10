/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX04_18;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Student_Major_And_Status {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two characters: ");
        String s = input.next();
        String major = null;
        String status = null;
        if(s.charAt(0) == 'M')
            major = "Mathematics";
        else if(s.charAt(0) == 'C')
            major = "Computer Science";
        else if(s.charAt(0) == 'I')
            major = "Information Technology";
        if(s.charAt(1) == '1')
            status = "Freshman";
        else if(s.charAt(1) == '2')
            status = "Sophomore";
        else if(s.charAt(1) == '3')
            status = "Junior";
        else if(s.charAt(1) == '4')
            status = "Senior";
        System.out.println(major + " " + status);
            
    }
}
