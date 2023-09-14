/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX03_20;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Wind_Chill_Temperature {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit between -58°F and 41°F: ");
        double degreeInFahrenheit = input.nextDouble();
        System.out.println("Enter the wind speed (>=2) in miles per hour: ");
        double speedOfWind = input.nextDouble();
        if((speedOfWind < 2)){
            System.out.println("You entered an invalid speed");
            System.exit(0);
        }
        else if((degreeInFahrenheit < -58) || (degreeInFahrenheit > 41)){
            System.out.println("You entered an invalid degree");
            System.exit(0);
        }
        else if((degreeInFahrenheit < -58) && (degreeInFahrenheit > 41) && (speedOfWind < 2)){
            System.out.println("You entered invalid degree and speed");
            System.exit(0);
        }
        else{
        double theWindChillIndex = 35.74 + 0.6215 * degreeInFahrenheit - 35.75 * Math.pow(speedOfWind, 0.16) + 0.4275 * degreeInFahrenheit * Math.pow(speedOfWind, 0.16);
        System.out.println("The wind chill index is " + theWindChillIndex);
        }
    }
}
