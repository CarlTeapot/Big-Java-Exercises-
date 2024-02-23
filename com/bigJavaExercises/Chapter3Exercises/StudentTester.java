package com.bigJavaExercises.Chapter3Exercises;

class Student {
    public Student student;
    private String studentName;
    private int score;
    private int quizNumber;

    public Student(String studentName) {
        quizNumber = 0;
        score = 0;
        this.studentName = studentName;

    }

    public String getName(String name) {
        return studentName;
    }
    public void addQuiz(int score) {
        // record a new quiz
        this.score = this.score + score;
        quizNumber++;
    }
    public int getToTalScore() {
        return (int) score;
    }
    private double calculateAverageScore() {
        // calculate average quiz grade
        if (quizNumber == 0) return 0.0;
        else
            return (double)score / (double)quizNumber;
    }
    public double getAverageScore() {
        return calculateAverageScore();
    }
}



public class StudentTester {
    public static void main(String[] args) {
        Student student = new Student("Zaza");
        student.addQuiz(50);
        student.addQuiz(75);
        student.addQuiz(85);
        student.getAverageScore();

        System.out.println();
        System.out.println(student.getAverageScore());
    }
}
