package com.bigJavaExercises.Chapter5Exercises;

import java.util.Scanner;

public class GradeTester {
    public static void main(String[] args) {
    Grade grade = new Grade();
        System.out.print("Your grade in the numerical system is: " + grade.getNumericGrade());
    }
}

class Grade {
    Scanner scanner = new Scanner(System.in);
    private String gradeString;
    private double gradeNumber;

    public Grade() {
        System.out.println("Enter your grade in American system: ");
        gradeString = scanner.next();
    }
    public String getNumericGrade() {

        switch (gradeString) {
            case "A+":
                return Double.toString(4);
            case "A":
                return Double.toString(4);
            case "A-":
                return Double.toString(3.7);
            case "B+":
                return Double.toString(3.3);
            case "B":
                return Double.toString(3);
            case "B-":
                return Double.toString(2.7);
            case "C+":
                return Double.toString(2.3);
            case "C":
                return Double.toString(2);
            case "C-":
                return Double.toString(1.7);
            case "D+":
                return Double.toString(1.3);
            case "D":
                return Double.toString(1);
            case "D-":
                return Double.toString(0.7);
            default:
                return "Not a valid grade";
        }
    }
}