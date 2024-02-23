package com.bigJavaExercises.Chapter3Exercises;

class SavingsAccountTester {
    private double balance;

    public SavingsAccountTester() {
        balance = 1000;
    }

    public SavingsAccountTester(double initialBalance) {
        balance = initialBalance;

    }

    public void deposit(double amount) {

        balance = balance + amount;
    }

    public void withdraw(double amount) {

        balance = balance - amount;
    }

    public void addInterest(double rate) {
        balance = balance + (balance * rate) / 100;
    }

    public double getBalance() {
        return balance;
    }

}
public class SavingsAccount {
    public static void main(String[] args) {
        SavingsAccountTester savingsAccountTester = new SavingsAccountTester();
        savingsAccountTester.addInterest(10);
        System.out.println(savingsAccountTester.getBalance());

    }
}
