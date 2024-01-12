package com.oops.encapsulation;

/**
 * BankAccount class demonstrating encapsulation
 */
public class BankAccountEncapsulated {
    private String accountNumber;
    private double balance;

    public BankAccountEncapsulated(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Methods to modify balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
            System.out.println("New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("New balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds");
        }
    }

    public void displayInfo() {
        System.out.println("Account Information:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        BankAccountEncapsulated account = new BankAccountEncapsulated("1234567890", 1000.0);
        
        account.displayInfo();
        account.deposit(500.0);
        account.withdraw(200.0);
        account.withdraw(2000.0); // Should fail
    }
} 