/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX03_28;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Scanner;
public class Two_Recctangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter r1's center x-, y-coordinates, width and height: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double width1 = input.nextDouble();
        double height1 = input.nextDouble();
        System.out.println("Enter r2's center x-, y-coordinates, width and height: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double width2 = input.nextDouble();
        double height2 = input.nextDouble();
        double distanceX = Math.pow((x1 - x2) * (x1 - x2), 0.5);
        double distanceY = Math.pow((y1 - y2) * (y1 - y2), 0.5);
        if(0 <= distanceX && distanceX < width1 / 2 && 0 <= distanceY && distanceY < height1)
            System.out.println("r2 is inside r1");
        else if((width1 / 2 <= distanceX && distanceX <= width1 / 2 + width2) ^ (height1 / 2 <= distanceY && distanceY <= height1 / 2 + height2))
            System.out.println("r2 overlaps r1");
        else
            System.out.println("r2 is outside r1");
    }
}
