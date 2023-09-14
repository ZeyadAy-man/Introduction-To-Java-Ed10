/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX09_03;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Date;
public class Use_Data_Class {
    public static void main(String[] args) {
        Date date = new Date();
        //int s = 1000000000;
        //long s1 = 1000000000;
        for(long i = 10000; i < 100000000000L; i = i * 10){
            date.setTime(i);
            System.out.println(date.toString());
        }
    }
}
