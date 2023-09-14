/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX04_03;

/**
 *
 * @author Zeyad Ayman
 */
public class Estimate_Area {
    public static void main(String[] args) {
        //Atlanta : Latitude: 33.7490, Longitude: -84.3880
        //Orlando : Latitude: 28.5383, Longitude: -81.3792
        //Savannah : Latitude: 32.0761, Longitude: -81.0883
        //Charlotte : Latitude: 35.2270, Longitude: -80.8431
        double x1 = 33.7490;
        double y1 = -84.3880;
        double x2 = 28.5383;
        double y2 = -81.3792;
        double x3 = 32.0761;
        double y3 = -81.0883;
        double x4 = 35.2270;
        double y4 = -80.8431;
        double side11 = Math.pow((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1), 0.5);
        double side21 = Math.pow((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1), 0.5);
        double side31 = Math.pow((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3), 0.5);
        double s1 = (side11 + side21 + side31) / 2;
        double area1 = Math.pow(s1 * (s1 - side11) * (s1 - side21) * (s1 - side31), 0.5);
        double side12 = Math.pow((x4 - x1) * (x4 - x1) + (y4 - y1) * (y4 - y1), 0.5);
        double side22 = Math.pow((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1), 0.5);
        double side32 = Math.pow((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3), 0.5);
        double s2 = (side12 + side22 + side32) / 2;
        double area2 = Math.pow(s2 * (s2 - side12) * (s2 - side22) * (s2 - side32), 0.5);
        double distance1 = 6371.01 * Math.acos(Math.sin(Math.toRadians(x1)) 
            * Math.sin(Math.toRadians(x2)) + 
            Math.cos(Math.toRadians(x1)) * 
            Math.cos(Math.toRadians(x2)) 
            * Math.cos(Math.toRadians(y2) - Math.toRadians(y1)));
        double distance2 = 6371.01 * Math.acos(Math.sin(Math.toRadians(x1)) 
            * Math.sin(Math.toRadians(x3)) + 
            Math.cos(Math.toRadians(x1)) * 
            Math.cos(Math.toRadians(x3)) 
            * Math.cos(Math.toRadians(y3) - Math.toRadians(y1)));
        double distance3 = 6371.01 * Math.acos(Math.sin(Math.toRadians(x1)) 
            * Math.sin(Math.toRadians(x4)) + 
            Math.cos(Math.toRadians(x1)) * 
            Math.cos(Math.toRadians(x4)) 
            * Math.cos(Math.toRadians(y4) - Math.toRadians(y1)));
        double distance4 = 6371.01 * Math.acos(Math.sin(Math.toRadians(x2)) 
            * Math.sin(Math.toRadians(x3)) + 
            Math.cos(Math.toRadians(x2)) * 
            Math.cos(Math.toRadians(x3)) 
            * Math.cos(Math.toRadians(y2) - Math.toRadians(y3)));
        double distance5 = 6371.01 * Math.acos(Math.sin(Math.toRadians(x2)) 
            * Math.sin(Math.toRadians(x4)) + 
            Math.cos(Math.toRadians(x2)) * 
            Math.cos(Math.toRadians(x4)) 
            * Math.cos(Math.toRadians(y2) - Math.toRadians(y4)));
        double distance6 = 6371.01 * Math.acos(Math.sin(Math.toRadians(x3)) 
            * Math.sin(Math.toRadians(x4)) + 
            Math.cos(Math.toRadians(x3)) * 
            Math.cos(Math.toRadians(x4)) 
            * Math.cos(Math.toRadians(y3) - Math.toRadians(y4)));
        System.out.println("The distance between the two cities (Savannah and Charlotte) is " + distance6);
        System.out.println("The distance between the two cities (Orlando and Charlotte) is " + distance5);
        System.out.println("The distance between the two cities (Orlando and Savannah) is " + distance4);
        System.out.println("The distance between the two cities (Atlanta and Charlotte) is " + distance3);
        System.out.println("The distance between the two cities (Atlanta and Savannah) is " + distance2);
        System.out.println("The distance between the two cities (Atlanta and Orlando) is " + distance1);
        System.out.println("The area between the four cities is " + (area1 + area2));
        
        
    }
}
