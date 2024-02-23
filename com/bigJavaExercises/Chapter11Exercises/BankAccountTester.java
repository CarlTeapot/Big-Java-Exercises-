package com.bigJavaExercises.Chapter11Exercises;

import java.util.Formatter;

public class BankAccountTester {
        public static void main(java.lang.String[] args) {
            BankAccount harrysChecking = new BankAccount(2500);
            Formatter formatter = new Formatter();
            harrysChecking.deposit(2000);
            harrysChecking.withdraw(500);
            System.out.println(harrysChecking.getBalance());
            System.out.println("Expected: 1500");
        }
}
