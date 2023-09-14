/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX01_11;

/**
 *
 * @author Zeyad Ayman
 */
public class Population_Projection {
    public static void main(String[] args){
        int population = 312032486;
       int time = 365 * 24 * 60 * 60;
       double birth = time / 7.0;
       double death = time / 13.0;
       double immigrant = time / 45.0;
       population = (int)(population + birth + immigrant - death);
       System.out.println("The population after one year is " + population);
       population = (int)(population + birth + immigrant - death);
       System.out.println("The population after two year is " + population);
       population = (int)(population + birth + immigrant - death);
       System.out.println("The population after three year is " + population);
       population = (int)(population + birth + immigrant - death);
       System.out.println("The population after four year is " + population);
       population = (int)(population + birth + immigrant - death);
       System.out.println("The population after five year is " + population);
    }
}
