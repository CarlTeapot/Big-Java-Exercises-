package com.bigJavaExercises.Chapter10Exercises;

import com.bigJavaExercises.Chapter11Exercises.BankAccount;

public class SavingsAccount extends BankAccount  {
    public double minimum;
    public double cash;
    private double interestRate;
    /**
     Constructs a bank account with a given interest rate.
     @param rate the interest rate
     */
    public SavingsAccount(double rate, int accountNumber) {
        super(accountNumber);
        interestRate = rate;
        minimum = getBalance();
    }
    /**
     Adds the earned interest to the account balance.
     */
    public void getMinimum(){
        if (getBalance()< minimum)
        minimum = getBalance();
    }
    public void addInterest() {
        cash = cash - minimum;
        double deposit = minimum * (interestRate /100);

        deposit(deposit);
    }
}