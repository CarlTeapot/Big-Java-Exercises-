package com.bigJavaExercises.Chapter16Exercises;

import java.util.*;

public class GradeMap {

    private Map<StudentName, String> grades;
    private StudentName name;
    private String grade;

    public GradeMap() {
        grades = new TreeMap<>();
    }

    public void add(StudentName aName, String aGrade) {
        grades.put(aName, aGrade);
    }

    public void changeName(StudentName name, String newName) {
        for (Map.Entry<StudentName, String> studentNameStringEntry : grades.entrySet()) {
            if (studentNameStringEntry.getKey().equals(name)) {
                studentNameStringEntry.getKey().rename(newName);
            }
        }
    }

    public void changeGrade(StudentName name, String to) {
        for (Map.Entry<StudentName, String> studentNameStringEntry : grades.entrySet()) {
            if (studentNameStringEntry.getKey().equals(name)) {
                studentNameStringEntry.setValue(to);
            }
        }
    }


    public String display() {
        String display = "";
        for (Map.Entry<StudentName, String> entry : grades.entrySet()) {
            display = display + "Name = " + entry.getKey().getName() + ", Grade = " + entry.getValue() + "\n";
        }
        return display;
    }
}

