/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX09_07;

/**
 *
 * @author Zeyad Ayman
 */
public class Test {
    public static void main(String[] args) {
        Account user1 = new Account(1122, 20000);
        user1.setAnnualInterestRate(4.5);
        user1.withdraw(2500);
        user1.deposit(3000);
        System.out.println("User balance is " + user1.getBalance()
                + "\nUser monthly interest is "
                + user1.getMonthlyInterest() + "\nThe account was created in "
                + user1.getDateCreated());
    }
}
