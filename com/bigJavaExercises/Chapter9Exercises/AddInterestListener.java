package com.bigJavaExercises.Chapter9Exercises;

import com.bigJavaExercises.Chapter11Exercises.BankAccount;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddInterestListener implements ActionListener {
    BankAccount account;
    private final int FRAME_WIDTH = 120;
    private final int FRAME_HEIGHT = 60;
    private final double INTEREST_RATE = 10;
    private final double INITIAL_BALANCE = 1000;
    public AddInterestListener(BankAccount account) {
        this.account = account;
    }

    public void actionPerformed(ActionEvent event) {
// The listener method accesses the account variable
// from the surrounding block
        double interest = account.getBalance() * INTEREST_RATE / 100;
        account.deposit(interest);
        System.out.println("balance: " + account.getBalance());
    }
}