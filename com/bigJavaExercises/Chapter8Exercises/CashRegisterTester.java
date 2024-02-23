package com.bigJavaExercises.Chapter8Exercises;

import com.bigJavaExercises.Chapter16Exercises.Coin;

public class CashRegisterTester {
    public static void main(String[] args) {
        Coin dollars = new Coin(1,"Dollars");
        Coin quarters =  new Coin(0.25,"Dollars");
        Coin dimes = new Coin(0.1,"Dollars");
        Coin nickels = new Coin(0.05,"Dollars");
        Coin pennies = new Coin(0.01,"Dollars");
        CashRegister register = new CashRegister();
        register.recordPurchase(45);
        register.enterPayment(5, dollars);
        register.enterPayment(10, quarters);
        register.enterDollars(5);
        register.enterQuarters(2);
        System.out.println("Change: " + register.giveChange());
        System.out.println(register.giveDollars());
        System.out.println(register.giveQuarters());
    }
}

