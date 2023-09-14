/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX06_08;

/**
 *
 * @author Zeyad Ayman
 */
public class Conversions_Between_Celsius_And_Fahrenheit {
    public static void main(String[] args) {
        System.out.printf("%-13s%-15s%-7s%-15s%-9s\n", "Celsius", "Fahrenheit", "|", "Fahrenheit", "Celsius");
        System.out.println("--------------------------------------------------------------");
        int fahrenheit = 120;
        for(int celsius = 40; celsius >= 31; celsius--){
            System.out.printf("%-13.1f", (double)celsius);
            celsiusToFahrenheit(celsius);
            System.out.printf("%-7s", "|");
            System.out.printf("%-15.1f", (double)fahrenheit);
            fahrenheitToCelsius(fahrenheit);
            fahrenheit = fahrenheit - 10;
        }
    }
    public static void celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.printf("%-15.1f", fahrenheit);
    }
    public static void fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.printf("%-9.2f\n", celsius);
    }
}
