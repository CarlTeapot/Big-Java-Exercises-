package com.bigJavaExercises.Chapter9Exercises;

public class PrimeSequenceTester {
    public static void main(String[] args) {
        Sequence sequence = new PrimeSequence(15);
        sequence.sequence();
        System.out.println(sequence.toString());
    }
}
