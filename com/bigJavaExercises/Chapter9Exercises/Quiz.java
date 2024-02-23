package com.bigJavaExercises.Chapter9Exercises;

public class Quiz implements Measurable {
    private int score;
    public Quiz(int score) {
        this.score = score;
    }

    @Override
    public int getMeasure() {
        return score;
    }

    @Override
    public double measure(Object anObject) {
        return score;
    }
}
