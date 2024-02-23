package com.bigJavaExercises.Chapter10Exercises;

public class Question {
    protected String text;
    protected String answer;
    public Question() {
        text = "";
        answer = "";
    }
    public void setQuestion(String questionText) {
        text = questionText;
    }

    public void setAnswer(String correctResponse) {
        answer = correctResponse;
    }

    public boolean checkAnswer(String response) {
        if (response.equalsIgnoreCase(answer))
            return true;
        return false;
    }
    public String toString() {
        return text + " ~ Answer: " + answer;
    }
}