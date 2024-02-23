package com.bigJavaExercises.Chapter7Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Purse {

    Scanner scanner = new Scanner(System.in);
    private ArrayList<String> coins;
    private ArrayList<String> rcoins;
    private int length;
    private boolean same;

    public Purse() {
        coins = new ArrayList<String>();
        rcoins = new ArrayList<String>();
    }

    public void addCoin(String[] strArr) {
        for (String s : strArr) {
            coins.add(s);
        }
    }

    public ArrayList<String> getCoins() {
        return coins;
    }

    public String toString() {
        if (coins.size() == 0)
            return "Purse[]";

        String output = "Purse[";

        for (String coin : coins)
            output = output + coin + ", ";

        output = output.substring(0, output.length() - 2);
        return output + "]";
    }

    public String reverse() {
        if (coins.size() == 0)
            return "Purse[]";

        String output = "Reverse Purse[";

        for (String coin : coins)
            rcoins.add(0, coin);

        for (String coin : rcoins)
            output += coin + ",";

        output = output.substring(0, output.length() - 1);
        return output + "]";

    }

    public ArrayList<String> transfer(Purse to) {
        for (String coin : coins) {
            to.coins.add(coin);
        }
        return to.getCoins();
    }

    public boolean sameContents(Purse second) {
        for (String coins1 : coins) {
            for (String coins2 : second.coins) {
                if (coins1 == coins2)
                    same = true;
                else
                    same = false;
            }
        }
        if (same == true)
            return true;
        else
            return false;
    }

    public boolean sameCoins(Purse other) {
        boolean samecoins = false;

        for (String a : coins)
            other.coins.remove(a);

        if (other.coins.size() == 0)
            samecoins = true;
        return samecoins;
    }
}