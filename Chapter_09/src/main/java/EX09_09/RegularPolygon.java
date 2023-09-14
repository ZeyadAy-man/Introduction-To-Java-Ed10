/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX09_09;

/**
 *
 * @author Zeyad Ayman
 */
public class RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;
    RegularPolygon(){
        
    }
    RegularPolygon(int n, double side){
        this.side = side;
        this.n = n;
    }
    RegularPolygon(int n, double side, double x, double y){
        this(n, side);
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    double getPerimeter(){
        return n * side;
    }
    double getArea(){
        return ((n * side * side) / (4 * Math.tan(Math.PI / n)));
    }
}
