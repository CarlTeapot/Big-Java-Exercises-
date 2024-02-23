package com.bigJavaExercises.Chapter14Exercises;

import com.bigJavaExercises.Chapter16Exercises.Coin;

import java.util.Arrays;

public class CoinSelectionSorterDemo {
    public static void main(String[] args) {
        Coin[] coins = new Coin[9];
        coins[0] = new Coin(15, "zura");
        coins[1] = new Coin(25, "zura");
        coins[2] = new Coin(38, "zura");
        coins[3] = new Coin(9, "zura");
        coins[4] = new Coin(12, "zura");
        coins[5] = new Coin(3, "zura");
        coins[6] = new Coin(8, "zura");
        coins[7] = new Coin(5, "zura");
        coins[8] = new Coin(2,"zaza");


        System.out.println(Arrays.toString(coins));
        CoinSelectionSorter sorter = new CoinSelectionSorter(coins);
        sorter.sort();
        System.out.println(Arrays.toString(coins));
    }
}
