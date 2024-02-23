package com.bigJavaExercises.Chapter9Exercises;

import com.bigJavaExercises.Chapter11Exercises.Bank2;
import com.bigJavaExercises.Chapter11Exercises.BankAccount;

import java.util.ArrayList;

public class BankTester {
    public static int calculateFactorial(int number) {
        if (number == 1)
            return 1;
        return number * calculateFactorial(number - 1);
    }
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.add(new BankAccount(25000, 1));
        accounts.add(new BankAccount(22000, 2));
        accounts.add(new BankAccount(15000, 3));
        accounts.add(new BankAccount(13000, 4));
        accounts.add(new BankAccount(23000, 5));
        accounts.add(new BankAccount(15000, 6));

        Bank2 bank = new Bank2(accounts);

        System.out.println(calculateFactorial(5));
    }
}
