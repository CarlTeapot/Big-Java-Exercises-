package com.bigJavaExercises.Chapter5Exercises;

import java.util.Scanner;

public class CardTester {
    public static void main(String[] args) {
    Card card = new Card();
        System.out.println(card.getDescription());
    }
}

class Card {
    Scanner scanner = new Scanner(System.in);
    public final static int SPADES = 0;      // Codes for the 4 suits.
    public final static int HEARTS = 1;
    public final static int DIAMONDS = 2;
    public final static int CLUBS = 3;

    public final static int ACE = 1;          // Codes for the non-numeric cards.
    public final static int JACK = 11;        //   Cards 2 through 10 have their
    public final static int QUEEN = 12;      //   numerical values for their codes.
    public final static int KING = 13;


    private int rank;
    private int type;
    public Card() {
        System.out.print("Please enter the rank of your card: ");
        rank = scanner.nextInt();
        System.out.print("Please enter the type of your card: ");
        type = scanner.nextInt();
    }

    private int getType() {
        // Return the int that codes for this card's suit.
        return type;
    }
    private int getRank() {
        return rank;
    }
    private String getTypeAsString() {
        switch (type) {
            case SPADES: return "Spades";
            case HEARTS: return "Hearts";
            case DIAMONDS: return "Diamonds";
            case CLUBS: return "Clubs";
            default: return "unknown";

        }
    }
    private String  getRankAsString() {
        switch (rank) {
            case 1:   return "Ace";
            case 2:   return "2";
            case 3:   return "3";
            case 4:   return "4";
            case 5:   return "5";
            case 6:   return "6";
            case 7:   return "7";
            case 8:   return "8";
            case 9:   return "9";
            case 10:  return "10";
            case 11:  return "Jack";
            case 12:  return "Queen";
            case 13:  return "King";
            default:  return "??";
        }
    }
    public String getDescription() {
        return getRankAsString() + " of " + getTypeAsString();
    }
}