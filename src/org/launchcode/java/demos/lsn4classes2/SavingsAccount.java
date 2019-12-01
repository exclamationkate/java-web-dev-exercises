package org.launchcode.java.demos.lsn4classes2;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    public void compoundInterest() {
        this.balance += (this.balance * this.interestRate);
    }
}
