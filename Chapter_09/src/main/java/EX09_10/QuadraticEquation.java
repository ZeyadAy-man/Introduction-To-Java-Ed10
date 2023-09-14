/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX09_10;

/**
 *
 * @author Zeyad Ayman
 */
public class QuadraticEquation {
    private double a, b, c;
    QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    
    public double getDiscriminant(){
        return b * b - 4 * a * c;
    }
    
    public double getRoot1(){
        return (getDiscriminant() >= 0) ? (-1 * b + Math.pow(getDiscriminant(), 0.5)) / 2 * a : 0;
    }
    
    public double getRoot2(){
        return (getDiscriminant() >= 0) ? (-1 * b - Math.pow(getDiscriminant(), 0.5)) / 2 * a : 0;
    }
}
