package com.bigJavaExercises.Chapter8Exercises;

import java.util.Arrays;

public class GradeBookTester {
    public static void main(String[] args) {
        Student zaza = new Student("zaza", 10);
        Student tornike = new Student("tornike", 8);
        Student guga = new Student("guga", 7);
        Student nana = new Student("nana", 6);
        Student manana = new Student("manana", 5);

        Student[] students = {zaza,tornike,guga,nana,manana};

        System.out.println((Arrays.toString(GradeBook.getStudentScores(students))));
        System.out.println(Arrays.toString(GradeBook.getStudentNames(students)));
        System.out.println(Arrays.toString(GradeBook.getStudentDescriptions(students)));
    }
}
