package com.bigJavaExercises.Chapter11Exercises;

import java.util.ArrayList;

public class Bank2 {
    private ArrayList<BankAccount> accounts;
    private String zaza;
    public Bank2(ArrayList<BankAccount> bankAccounts) {
        accounts = bankAccounts;
        zaza = "";
    }

    public String read() {
        for (int i = 0; i < accounts.size(); i++) {
            zaza = zaza + "[Account number: " +  accounts.get(i).getAccountNumber() + "] {Account balance " + accounts.get(i).getBalance() + "}\n";
        }
        return zaza;
    }
}
