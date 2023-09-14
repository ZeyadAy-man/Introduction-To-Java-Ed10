/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX03_04;

/**
 *
 * @author Zeyad Ayman
 */
public class Random_Month {
    public static void main(String[] args){
        int randomNum = (int)(Math.random() * 13);
        if(randomNum == 1)
            System.out.println("January");
        else if(randomNum == 2)
            System.out.println("Feburary");
        else if(randomNum == 3)
            System.out.println("March");
        else if(randomNum == 4)
            System.out.println("April");
        else if(randomNum == 5)
            System.out.println("May");
        else if(randomNum == 6)
            System.out.println("June");
        else if(randomNum == 7)
            System.out.println("July");
        else if(randomNum == 8)
            System.out.println("August");
        else if(randomNum == 9)
            System.out.println("Septemper");
        else if(randomNum == 10)
            System.out.println("October");
        else if(randomNum == 11)
            System.out.println("November");
        else
            System.out.println("December");
    }
}
