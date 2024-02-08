package com.oops.classes;

/**
 * BankAccount class with accountNumber, balance, and methods for deposit and withdraw
 */
public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

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
        System.out.println("Bank Account Information:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("1234567890", 1000.0);
        account.displayInfo();
        account.deposit(500.0);
        account.withdraw(200.0);
        account.displayInfo();
    }
} 