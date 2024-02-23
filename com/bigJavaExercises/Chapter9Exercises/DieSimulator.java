package com.bigJavaExercises.Chapter9Exercises;

public class DieSimulator {
    public static void main(String[] args) {
        Die die = new Die(10);
        final int TRIES = 10;

        for (int i = 1; i <= TRIES; i++) {
            double n = die.cast();
            System.out.println(n + " ");
        }
        System.out.println();
    }
}