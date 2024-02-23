package com.bigJavaExercises.Chapter9Exercises;

public class PrimeSequence implements Sequence {

    private int[] sequence;
    public PrimeSequence(int sequenceLength) {
        sequence = new int[sequenceLength];
    };

    public int[] sequence() {
        sequence[0] = 1;
        for (int i = 1; i < sequence.length; i++) {
            sequence[i] = 6 * (i - 1) + 1;
        }
        return sequence;
    }
    public String toString() {
        String zaza = "";
        for (int i = 0; i < sequence.length; i++) {
            zaza = zaza + "\n" + i + ": " + sequence[i];
        }
        return zaza;
    }
    public void hasNext() {

    };
}
