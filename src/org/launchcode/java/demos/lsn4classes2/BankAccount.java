package org.launchcode.java.demos.lsn4classes2;

import java.util.Objects;

public class BankAccount {

    // To determine if variable should be included in class, say "BankAccount has a (insert variable name)"
    protected double balance; // This is protected because Class CheckingAccount accesses and changes it
    private int accountNo;
    private static int nextAccountNumber = 1;

    // Constructor: The role of the constructor is to make sure all the variables within the class have values.
    public BankAccount(double balance) {
        this.balance = balance;
        this.accountNo = nextAccountNumber;
        this.nextAccountNumber++;
    }

    // Getters & Setters

    public double getBalance() { return balance; }

    public int getAccountNo() { return accountNo; }

    // Instance Methods

    public boolean withdrawFunds(double withdrawalAmount) {
        if (withdrawalAmount < this.balance && withdrawalAmount > 0) {
            this.balance -= withdrawalAmount;
            return true;
        }
        return false;
    }

    public boolean depositFunds(double depositAmount) {
        if (depositAmount <= 0) {
            throw new IllegalArgumentException();
        }
        this.balance += depositAmount;
        return true;
    }

    // Overrides


    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", accountNo=" + accountNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return accountNo == that.accountNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNo);
    }

    // Test prints

    public static void main(String[] args) {
        BankAccount newAccount = new BankAccount(1000);
        BankAccount duplicateAccount = newAccount; // Both variables point to the exact same object.

//        System.out.println(newAccount);
//        newAccount.withdrawFunds(50);
//        System.out.println(newAccount.getBalance());
//        System.out.println(duplicateAccount.getBalance());

        // Exceptions are used for unexpected situations. They're not for users, they're for us.
        try {
            newAccount.depositFunds(-30); // perform code that might throw an error
        } catch (IllegalArgumentException e){ // if error is thrown, code in catch {} is executed
            e.printStackTrace(); // shows red error text information
            System.out.println("In catch");
            newAccount.depositFunds(30);
        }
    }
}
