package com.bigJavaExercises.Chapter8Exercises;


public class GradeBook {

    public GradeBook() {
    }

    public static String[] getStudentNames(Student[] students) {
            String[] studentNames = new String[students.length];
            for (int i = 0; i < students.length; i++) {
                    studentNames[i] = students[i].getName();
            }
            return studentNames;
    }

    public static int[] getStudentScores(Student[] students) {
            int[] studentScores = new int[students.length];
            for (int i = 0; i < students.length; i++) {
                    studentScores[i] = students[i].getScore();
            }
            return studentScores;
    }
        public static String[] getStudentDescriptions(Student[] students) {
                String[] studentDescriptions = new String[students.length];
                for (int i = 0; i < students.length; i++) {
                        studentDescriptions[i] = students[i].description();
                }
                return studentDescriptions;
        }
}

