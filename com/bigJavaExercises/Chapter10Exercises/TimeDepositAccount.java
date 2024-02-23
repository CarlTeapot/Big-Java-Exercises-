package com.bigJavaExercises.Chapter10Exercises;

public class TimeDepositAccount extends SavingsAccount {
    private double interestRate;
    private double months;
    private double elapsedMonths;
    public TimeDepositAccount(int rate, double numberOfMonths, int accountNumber) {
        super(rate,accountNumber);
        elapsedMonths = 0;
        interestRate = rate;
        months = numberOfMonths;
    }
    public void addInterest() {
        elapsedMonths++;
        super.addInterest();

    }
    @Override
    public void withdraw(double amount) {
        if (elapsedMonths < months)
            super.withdraw(20);
        super.withdraw(amount);
    }
}
