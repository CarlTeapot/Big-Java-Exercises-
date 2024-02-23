package com.bigJavaExercises.Chapter10Exercises;

import java.util.ArrayList;

public class MultipleChoiceQuestion extends Question {
    ArrayList<String> answers;
    public MultipleChoiceQuestion() {
        super();
    }
    @Override
    public void setAnswer(String correctResponse) {
        answers.add(correctResponse);
    }
    public boolean checkAnswer(ArrayList<String> response) {
        return answers == response;
    }
}


