/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX09_08;

/**
 *
 * @author Zeyad Ayman
 */
public class Fan {
    public final int SLOW = 1;
    public final int MEDIUM = 2;
    public final int FAST = 3;
    private int speed = SLOW;
    private boolean on;
    private double radius = 5;
    String color = "blue";
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Fan(){
        
    }
    public String toString(){
        return (on) ? "The fan is on and it's speed is "
        + getSpeed() + ", it's color is " + getColor() +
        " and it's radius is " + getRadius() : 
        "The fan is off and it's color is " + getColor() +
        " and it's radius is " + getRadius();
    }
}
