/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX09_07;

/**
 *
 * @author Zeyad Ayman
 */
import java.util.Date;
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    Account(){
        
    }
    Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        this.dateCreated = new Date();
        return dateCreated;
    }
    
    double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }
    
    double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }
    
    void deposit(double amount){
        balance = balance + amount;
    }
    
    void withdraw(double amount){
        balance = balance - amount;
    }
}
