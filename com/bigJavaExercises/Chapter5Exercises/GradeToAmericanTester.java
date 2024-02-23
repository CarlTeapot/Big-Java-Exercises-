package com.bigJavaExercises.Chapter5Exercises;

import java.util.Scanner;

public class GradeToAmericanTester {
    public static void main(String[] args) {
    GradeToAmerican grade = new GradeToAmerican();
        System.out.println(grade.convertToAmerican());
    }
}

class GradeToAmerican {
    Scanner scanner = new Scanner(System.in);

    private double grade;

    public GradeToAmerican() {
        System.out.println("Please enter your numerical grade: ");
        grade = scanner.nextDouble();
    }
    public String convertToAmerican() {
        if (grade >= 4.15 && grade <= 4.3)
            return "A+";
        else if (grade < 4.15 && grade >=3.85)
            return "A";
        else if (grade >= 3.55 && grade < 3.85)
            return "A-";
        else if (grade < 3.55 && grade >= 3.15)
            return "B+";
        else if (grade < 3.15 && grade >= 2.85)
            return "B";
        else if (grade < 2.85 && grade >= 2.55)
            return "B-";
        else if (grade < 2.55 && grade >= 2.15)
            return "C+";
        else if (grade < 2.15 && grade >= 1.85)
            return "C";
        else if (grade < 1.85 && grade >= 1.55)
            return "C-";
        else if (grade < 1.55 && grade >= 1.15)
            return "B+";
        else if (grade < 1.15 && grade >= 0.85)
            return "B";
        else if (grade < 0.85 && grade >= 0.55)
            return "B-";
        return "Error";
    }
}