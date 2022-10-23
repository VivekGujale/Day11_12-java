//Program for debit money from an Account's balance.
// if debit amount exceed the Account’s balance then message shouuld  be - Debit amount exceeded account balance.

package AccountCheck;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance > 0.0)
            balance = initialBalance;
    }

    public void credit(double amount) {
        balance = balance + amount;
    }

    public void debit(double debitAmount) {
        if (debitAmount > balance) {
            debitAmount = 0.0;
            System.out.println("Debit amount exceeded account balance.");
        } else {
            double withdraw = balance - debitAmount;
            System.out.println("Balance in account : " + withdraw);
        }
    }

    public double getBalance() {

        return balance;
    }

    public static void main(String[] args) {
        Account account1 = new Account(01.00);
        Account account2 = new Account(500.00);
        System.out.println("Account1 balance : " + account1.getBalance());
        System.out.println("Account1 balance : " + account2.getBalance());
        Scanner input = new Scanner(System.in);
        double withdrawAmount;
        System.out.println("Enter debit amount for account1:");
        withdrawAmount = input.nextDouble();
        account1.debit(withdrawAmount);
        System.out.println("Enter withdraw amount for account2:");
        withdrawAmount = input.nextDouble();
        account2.debit(withdrawAmount);
    }
}


