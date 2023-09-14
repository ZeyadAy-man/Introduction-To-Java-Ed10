/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX09_01;

/**
 *
 * @author Zeyad Ayman
 */
public class Rectangle {
    double width = 1;
    double height = 1;
    public Rectangle(){
        
    }
    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }
    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return (width + height) * 2;
    }
}
