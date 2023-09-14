/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX09_05;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.GregorianCalendar;
public class Using_GregorianCalendar {
    public static void main(String[] args) {
        GregorianCalendar G1 = new GregorianCalendar();
        System.out.println("The year is " + G1.get(GregorianCalendar.YEAR)
                + "\nThe month is " + G1.get(GregorianCalendar.MONTH)
                + "\nThe day is " + G1.get(GregorianCalendar.DAY_OF_MONTH));
        G1.setTimeInMillis(1234567898765L);
        System.out.println("The year is " + G1.get(GregorianCalendar.YEAR)
                + "\nThe month is " + G1.get(GregorianCalendar.MONTH)
                + "\nThe day is " + G1.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
