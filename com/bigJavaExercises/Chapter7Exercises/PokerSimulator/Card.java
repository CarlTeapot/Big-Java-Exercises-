package com.bigJavaExercises.Chapter7Exercises.PokerSimulator;

public class Card {
    String suit;
    String rank;

    public Card(String r, String s) {
        rank = r;
        suit = s;
    }

    public String getRanks() {
        return rank;
    }


    public String getSuits() {
        return suit;
    }
}
