package com.bigJavaExercises.Chapter6Exercises;

import java.util.Random;

public class DieSimulator {
    public static void main(String[] args) {
        Die die = new Die(10);
        final int TRIES = 10;

        for (int i = 1; i <= TRIES; i++) {
            int n = die.cast();
            System.out.println(n + " ");
        }
        System.out.println();
    }
}

class Die {
    private Random generator;
    private int sides;

    public Die(int s) {
        sides = s;
        generator = new Random();
    }

    public int cast() {
        return 1 + generator.nextInt(sides);
    }
}

