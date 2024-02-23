package com.bigJavaExercises.Chapter7Exercises.PokerSimulator;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

        //Initialize Variables
        ArrayList<Card> deckOfCards = new ArrayList<Card>();
        ArrayList<Card> hand = new ArrayList<Card>();
        //Card card = new Card("", "");
        Card card;
        String[] rankTester;
        String[] suitTester;

        /**
         * Constructor. Does not construct anything
         */
        public Deck() {
        }

        /**
         * Constructor used for when the user has a specified hand
         * @param rankTester rank of the card
         * @param suitTester  suit of the card
         */
        public Deck(String[] rankTester, String[] suitTester) {
            this.rankTester = rankTester;
            this.suitTester = suitTester;
        }

        /**
         * Creates a deck of cards.
         */

        // ES ARIS SAUKETESO METODI RAC VINMES MOUGONIA
        public void createDeck() {
            String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
            String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
            for (int i = 0; i < ranks.length; i++) {
                for (int x = 0; x < suits.length; x++) {
                    Card card = new Card(ranks[i], suits[x]);
                    deckOfCards.add(card);
                }
            }
        }

        /**
         * Creates a deck of cards with all possible combinations that a player can have to win or not win Java Dollars
         */
        public void createDeckTester() {
            for (int i = 0; i < rankTester.length; i++) {
                Card card = new Card(rankTester[i], suitTester[i]);
                deckOfCards.add(card);
            }
        }

        /**
         * Shuffles the deck of cards.
         */
        public void shuffleDeck() {
            Collections.shuffle(deckOfCards);
        }


        /**
         * Deals 5 cards to player. If player has cards in his hands already, it removes them.
         * @return 5 cards
         */
        public ArrayList<Card> dealHand() {
            if (hand.size() > 0) {
                hand.remove(0);
                hand.remove(0);
                hand.remove(0);
                hand.remove(0);
                hand.remove(0);
            }
            for (int i=0; i < 5; i++) {
                hand.add(deckOfCards.get(0));
                deckOfCards.remove(0);
            }
            return hand;
        }

        /**
         * Deals 1 card to the player.
         * @return 1 card
         */
        public Card getCard() {
            Card giveCard;
            giveCard = deckOfCards.get(0);
            deckOfCards.remove(0);
            return giveCard;
        }

        /**
         * Returns the deck so it can be printed since the PokerSimulator or the PokerTester are the only classes that can print
         * @return users deck
         */

        public ArrayList<Card> printDeck() {
            return deckOfCards;
        }

        /**
         * Returns the user hand so it can be printed since the PokerSimulator or the PokerTester are the only classes that can print
         * @return user hand
         */
        public ArrayList<Card> printHand() {
            return hand;
        }
}
