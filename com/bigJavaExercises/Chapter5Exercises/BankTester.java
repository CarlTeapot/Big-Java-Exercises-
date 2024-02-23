package com.bigJavaExercises.Chapter5Exercises;

class BankAccountTester {
    private double balance;
    private double fee;
    public BankAccountTester() {
        balance = 0;
        fee = balance/30;
    }
    public BankAccountTester(double initialBalance) {
        balance = initialBalance;
    }
    public void deposit(double amount) {
    if (amount > 0)
        balance = (balance + amount) - fee ;
    else
        balance = balance;
    }
    public void withdraw(double amount) {
    if (amount > 0)
        balance = balance - amount - fee;
    else
        balance = balance;

    }
    public void addInterest(double rate) {
        if (rate > 0)
        balance = balance + (balance * rate) / 100;
        else balance = balance;

    }
    public double getBalance() {
        return balance;
    }

}
public class BankTester {
    public static void main(String[] args) {
        BankAccountTester customer = new BankAccountTester();
        customer.deposit(1000);
        customer.deposit(-200);
        System.out.println( "Your balance is: " + Math.round(customer.getBalance()));
    }
}

