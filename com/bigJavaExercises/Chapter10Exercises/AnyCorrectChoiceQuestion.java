package com.bigJavaExercises.Chapter10Exercises;

import java.util.ArrayList;

public class AnyCorrectChoiceQuestion extends Question {
    ArrayList<String> answers;
    public AnyCorrectChoiceQuestion() {
        super();
    }
    @Override
    public void setAnswer(String correctResponse) {
        answers.add(correctResponse);
    }
    @Override
    public boolean checkAnswer(String response) {
        for (int i = 0; i < answers.size(); i++) {
            if (response.equalsIgnoreCase(answers.get(i))) {
                return true;
            }
        }
        return false;
    }
}
