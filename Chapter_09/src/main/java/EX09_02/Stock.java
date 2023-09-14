/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX09_02;

/**
 *
 * @author Zeyad Ayman
 */
public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    public Stock(String symbol, String name){
        this.name = name;
        this.symbol = symbol;
    }
    public double getChangePercent(){
        return (currentPrice - previousClosingPrice) / previousClosingPrice * 100; 
    }
}
