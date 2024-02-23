package com.bigJavaExercises.Chapter10Exercises;

import java.util.Scanner;

public class FillInQuestion extends Question {
    public FillInQuestion() {
        super();
    }
    @Override
    public void setQuestion(String questionText) {
        text = questionText + "____";
    }
    @Override
    public void setAnswer(String correctResponse) {
        answer = text + " _" + correctResponse + "_";
    }

    public void display() {
        System.out.println(text);
        System.out.print("Answer:  _____");

        Scanner scanner = new Scanner(System.in);
        answer = scanner.next();
        System.out.println(checkAnswer(answer));
    }
}

