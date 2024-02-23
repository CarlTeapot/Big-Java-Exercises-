package com.bigJavaExercises.Chapter19Exercises;

public class LetterFrequencyTester {
    public static void main(String[] args) {
        LetterFrequency frequency = new LetterFrequency();
        frequency.calculateFrequencies("damexmaret kuku download mishvelet");
        System.out.println(frequency.printFrequencies());
    }
}
