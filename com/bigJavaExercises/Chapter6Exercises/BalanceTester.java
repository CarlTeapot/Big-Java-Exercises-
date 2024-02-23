package com.bigJavaExercises.Chapter6Exercises;

public class BalanceTester {
    public static void main(String[] args) {
        final double INITIAL_BALANCE = 10000;
        final double RATE = 5;
        Balance invest = new Balance(INITIAL_BALANCE, RATE);
        invest.waitForBalance(2 * INITIAL_BALANCE);
        int years = invest.getYears();
        System.out.println("The investment doubled after " + years + " years");
    }

}

class Balance {
    private static double balance;
    private static double targetBalance;
    private static int years;
    private static double rate;

    public Balance(double aBalance, double aRate) {
        balance = aBalance;
        rate = aRate;
        years = 0;
    }
    public void waitYears(int numberOfYears) {
        for (int i = 1; i <= numberOfYears; i++) {
            double interest = balance * rate / 100;
            balance = balance + interest;
        }
    }

    public void waitForBalance(double targetBalance) {
        while (balance < targetBalance) {
            years++;
            double interest = balance * rate / 100;
            balance = balance + interest;
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getYears() {
        return years;
    }
}
