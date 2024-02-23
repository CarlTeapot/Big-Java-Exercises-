package com.bigJavaExercises.Chapter7Exercises;

public class PurseTester {
    public static void main(String[] args) {

        Purse purse = new Purse();
        Purse purse2 = new Purse();
        String[] coin = { "Tornike", "Zaza", "Goirgi"};
        String[] coin2 = {"Tornike", "Goirgi", "Zaza"};
        purse.addCoin(coin);
        purse2.addCoin(coin2);

        System.out.println(purse.getCoins());
        System.out.println(purse.reverse());
        System.out.println(purse.toString());
        System.out.println(purse.sameContents(purse2));
        System.out.println(purse.sameCoins(purse2));
    }
}