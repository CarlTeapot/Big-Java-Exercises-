package com.bigJavaExercises.Chapter8Exercises;

public class Student {

    private String name;
    private int score;
    public Student(String studentName, int studentScore) {
        name = studentName;
        score = studentScore;

    }
    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }
    public String description() {
        return "Name of the Student: " + name + "; His score ~ " + score;
    }

}
