package org.launchcode.java.demos.lsn4classes2;

public class CheckingAccount extends BankAccount {

    private double fee;

    public CheckingAccount(double balance, double fee) {
        super(balance);
        this.fee = fee;
    }

    public void chargeFee() {
        this.balance -= this.fee;
    }

}
