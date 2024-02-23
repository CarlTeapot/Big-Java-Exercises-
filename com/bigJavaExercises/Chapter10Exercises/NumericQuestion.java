package com.bigJavaExercises.Chapter10Exercises;

public class NumericQuestion extends Question {
    public NumericQuestion() {
        super();
    }
    @Override
    public boolean checkAnswer(String response) {
        if (Double.parseDouble(answer) - Double.parseDouble(response) > 0.1 ||
                Double.parseDouble(response) - Double.parseDouble(answer) > 0.1 || Double.parseDouble(response) == Double.parseDouble(answer))
            return true;
        return false;
    }
}
