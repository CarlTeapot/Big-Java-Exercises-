package com.bigJavaExercises.Chapter8Exercises;


public class NeedleSimulator {
    public static void main(String[] args) {
        Needle needle = new Needle();
        final int TRIES1 = 10000;
        final int TRIES2 = 1000000;

        for (int i = 1; i <= TRIES1; i++)
            needle.drop();
        System.out.printf("Tries = %d, Tries / Hits = %8.5f\n",
                TRIES1, (double) needle.getTries() / needle.getHits());

        for (int i = TRIES1 + 1; i <= TRIES2; i++)
            needle.drop();
        System.out.printf("Tries = %d, Tries / Hits = %8.5f\n",
                TRIES2, (double) needle.getTries() / needle.getHits());
    }
}

