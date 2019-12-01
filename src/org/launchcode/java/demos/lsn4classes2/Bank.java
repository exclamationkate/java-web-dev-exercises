package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;

// This Class is an example of polymorphism

public class Bank {

    private ArrayList<BankAccount> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addSavingsAccount(double balance) {
        SavingsAccount account = new SavingsAccount(balance, 0.1);
        accounts.add(account);
    }

    public void addCheckingAccount(double balance) {
        CheckingAccount account = new CheckingAccount(balance, 5.00);
        accounts.add(account);
    }
}
