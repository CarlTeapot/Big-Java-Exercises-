package com.bigJavaExercises.Chapter9Exercises;


import javax.sound.midi.Sequence;

public class LastDigitDistribution {
    private int[] counters;

    public LastDigitDistribution() {
        counters = new int[10];
    }

    public void display() {
        for (int i = 0; i < counters.length; i++) {
            System.out.println(i + ": *************");
        }
    }
}