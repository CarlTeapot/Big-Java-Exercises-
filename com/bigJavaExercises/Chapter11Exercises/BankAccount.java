package com.bigJavaExercises.Chapter11Exercises;

import java.io.IOException;
import java.util.Formattable;
import java.util.Formatter;

public class BankAccount implements Formattable {
    private double balance;
    private int number;

    public BankAccount(int accountNumber) {
        balance = 0;
        number = accountNumber;
    }

    public BankAccount(int accountNumber, double initialBalance) {
        balance = initialBalance;
        number = accountNumber;

        if (initialBalance < 0)
            throw new IllegalArgumentException("initial balance can not be lower than 0");


    }

    public int getAccountNumber() {
        return number;
    }
    public void deposit(double amount) {
        balance = balance + amount;
        if (amount < 0)
            throw new IllegalArgumentException("amount can not be a negative number");
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        if (amount < 0 || amount > balance)
            throw new IllegalArgumentException("amount of withdrawal can not be lower than zero and higher than the amount you have in the bank");
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void formatTo(Formatter formatter, int flags, int width, int precision)
    {
        Appendable a = formatter.out();

        String padding = "";
        for(int i = 0; i < width; i++)
        {
            padding = padding.concat(" ");
        }

        String bankBalance = padding + String.valueOf(getBalance());

    }
}
