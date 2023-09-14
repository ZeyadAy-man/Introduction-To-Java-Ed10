/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX09_02;

/**
 *
 * @author Zeyad Ayman
 */
public class Test {
    public static void main(String[] args) {
        Stock s1 = new Stock("ORCL", "Oracle Corporation");
        s1.currentPrice = 34.35;
        s1.previousClosingPrice = 34.5;
        System.out.println(s1.getChangePercent() + "%");
    }
}
