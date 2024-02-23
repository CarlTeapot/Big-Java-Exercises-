package com.bigJavaExercises.Chapter10Exercises;

import java.util.Scanner;

public class QuestionDemo {
    public static void main(String[] args) {
        Question[] quiz = new Question[2];

        quiz[0] = new Question();
        quiz[0].setQuestion("Who was the inventor of Java?");
        quiz[0].setAnswer("James Gosling");

        ChoiceQuestion question = new ChoiceQuestion("In which country was the inventor of Java born?");
        NumericQuestion numericQuestion = new NumericQuestion();
        question.addChoice("Australia", false);
        question.addChoice("Canada", true);
        question.addChoice("Denmark", false);
        question.addChoice("United States", false);

        quiz[1] = question;

        Scanner in = new Scanner(System.in);

        for (Question q : quiz) {
            q.toString();
            System.out.print("Your answer: ");
            String response = in.nextLine();
            System.out.println(q.checkAnswer(response));
        }
        NumericQuestion question1 = new NumericQuestion();
        question1.setQuestion("whats 9 + 10");
        question1.setAnswer("19");
        question1.toString();
        String answer = in.next();
        question1.checkAnswer(answer);
    }
}
