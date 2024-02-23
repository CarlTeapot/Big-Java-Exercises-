package com.bigJavaExercises.Chapter12Exercises.ATMMachine;

import com.bigJavaExercises.Chapter11Exercises.BankAccount;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A bank contains customers with bank accounts.
 */
public class Bank {
    private ArrayList<BankAccount> accounts;

    /**
     * Constructs a bank with no customers.
     */
    public Bank() {
        accounts = new ArrayList<>();
    }

    /**
     * Reads the customer numbers and pins
     * and initializes the bank accounts.
     *
     * @param filename the name of the customer file
     */
    public void readAccounts(String filename) throws IOException {
        Scanner in = new Scanner(new File(filename));
        while (in.hasNext()) {
            int number = in.nextInt();
            double balance = in.nextDouble();
            BankAccount c = new BankAccount(number, balance);
            addAccount(c);
        }
        in.close();
    }

    /**
     * Adds a customer to the bank.
     *
     * @param c the customer to add
     */
    public void addAccount(BankAccount c) {
        accounts.add(c);
    }

    public BankAccount findAccount(int accountNumber) {
        for (BankAccount c : accounts) {
            if (c.getAccountNumber() == accountNumber)
                return c;
        }
        return null;
    }
}
