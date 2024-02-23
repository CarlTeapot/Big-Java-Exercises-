package com.bigJavaExercises.Chapter2Exercises;

import java.util.Random;

public class DieSimulator {
    public static void main(String[] args) {
        Random random = new Random();
        int nxt = random.nextInt(7);
        System.out.println("SHENI IGBLIANI NOMERIA - " + nxt);
    }
}
