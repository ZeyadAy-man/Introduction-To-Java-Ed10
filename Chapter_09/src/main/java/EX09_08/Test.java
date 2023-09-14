/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX09_08;

/**
 *
 * @author Zeyad Ayman
 */
public class Test {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        fan1.setRadius(10);
        fan2.setRadius(5);
        fan2.setOn(false);
        fan2.setColor("Blue");
        fan2.setSpeed(fan2.MEDIUM);
        System.out.println(fan1);
        System.out.println(fan2);
    }
}
