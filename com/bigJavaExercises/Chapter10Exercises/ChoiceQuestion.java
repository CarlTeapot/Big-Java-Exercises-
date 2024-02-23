package com.bigJavaExercises.Chapter10Exercises;

import java.util.ArrayList;

public class ChoiceQuestion extends Question {
    private ArrayList<String> choices;

    public ChoiceQuestion(String questionText) {
        super();
        super.setQuestion(questionText);
        choices = new ArrayList<>();
    }

    public void addChoice(String choice, boolean correct) {
        choices.add(choice);
        if (correct) {
// Convert choices.size() to string
            String choiceString = "" + choices.size();
            setAnswer(choiceString);
        }
    }
    @Override
    public String toString() {
        String zaza = "";
        for (int i = 0; i < choices.size(); i++) {
            int choiceNumber = i + 1;
            zaza = zaza + "\n" + choiceNumber + ": " + choices.get(i);
        }
        return zaza;
    }
}
