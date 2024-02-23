package com.bigJavaExercises.Chapter7Exercises;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class BulgarianSolitaire {
    private Random random = new Random();
    private ArrayList<Integer> cards = new ArrayList<Integer>();
    boolean cont = true;
    boolean cont2 = true;

    public BulgarianSolitaire() {
        System.out.println("Started");
        int sum = 0;

        while (cont) {
            if (sum < 45) {
                cards.add(random.nextInt(45 - sum));
            } else {
                cont = false;
            }


            for (int i = 0; i < cards.size(); i++) {
                sum = sum + cards.get(i);

            }

            removeZeros(cards);

            System.out.println(cards);
        }

        System.out.println("Finished Generating Start");

        while (cont2) {
            solitaireStep();
            System.out.println(cards);
            if (checkCards()) {
                cont2 = false;
            }
        }

        Collections.sort(cards);
        System.out.println("Cards are sorted");
        System.out.println(cards);
    }

    public void removeZeros(ArrayList<Integer> list) {
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j) == 0) {
                list.remove(j);
                j--;
            }
        }
    }

    public void solitaireStep() {
        int numberRemoved = 0;
        for (int i = 0; i < cards.size(); i++) {
            int value = cards.get(i);
            cards.set(i, value - 1);
            removeZeros(cards);
            numberRemoved++;
        }
        cards.add(numberRemoved);
    }

    public boolean checkCards() {
        for(int i = 0; i < cards.size(); i++) {
            if(cards.get(i) != i + 1) {
                return false;
            }
        }
        return true;
    }
}