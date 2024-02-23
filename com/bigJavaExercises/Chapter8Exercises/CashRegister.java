package com.bigJavaExercises.Chapter8Exercises;

import com.bigJavaExercises.Chapter16Exercises.Coin;

public class CashRegister {
    public static final double QUARTER_VALUE = 0.25;
    public static final double DIME_VALUE = 0.1;
    public static final double NICKEL_VALUE = 0.05;
    public static final double PENNY_VALUE = 0.01;

    private double purchase;
    private double payment;
    private double totalpurchase;
    private int count;

    public CashRegister() {

        purchase = 0;
        payment = 0;
        count = 0;
        totalpurchase = 0;
    }

    public void recordPurchase(double amount) {
        purchase = purchase + amount;
        totalpurchase = totalpurchase + amount;
        count = count + 1;
    }

    public void enterPayment(int coinCount, Coin coinType) {
        payment = payment + coinType.getValue();
    }

    public void salesTax(double rate) {
        purchase = purchase + (purchase * rate) / 100;
    }

    public double getSalesTotal() {
        return totalpurchase;
    }

    public double getSalesCount() {
        return count;
    }

    public double giveChange() {
        double change = payment - purchase;
        return change;
    }

    public double enterDollars(double dollars) {
        return dollars;
    }

    public void enterQuarters(double quarters) {
        payment = quarters * QUARTER_VALUE;
    }

    public void enterDime(double dime) {
        payment = dime * DIME_VALUE;
    }

    public void enterNickels(double nickels) {
        payment = nickels * NICKEL_VALUE;
    }

    public void enterPennies(double pennies) {
        payment = pennies * PENNY_VALUE;

    }

    public double giveDollars() {
        return Math.round(giveChange());
    }
    public double giveQuarters() {
        double quarterChange = giveChange() / QUARTER_VALUE;
        return quarterChange;
    }
    public double giveDimes() {
        double dimeChange = giveChange() / DIME_VALUE;
        return dimeChange;
    }
    public double giveNickels() {
        double nickelChange = giveChange() / NICKEL_VALUE;
        return nickelChange;
    }
    public double givePennies() {
        double pennyChange = giveChange() / PENNY_VALUE;
        return pennyChange;
    }
    public void reset() {
        payment = 0;
        purchase = 0;
        totalpurchase = 0;
    }
}
