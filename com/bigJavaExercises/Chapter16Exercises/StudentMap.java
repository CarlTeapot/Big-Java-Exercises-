package com.bigJavaExercises.Chapter16Exercises;

import java.util.Map;
import java.util.TreeMap;

public class StudentMap {
    private Map<Student, String> grades;
    private Student name;
    private String grade;

    public StudentMap() {
        grades = new TreeMap<>();
    }

    public void add(Student aName, String aGrade) {
        grades.put(aName, aGrade);
    }

    public void changeFirstName(Student name, String newName) {
        for (Map.Entry<Student, String> studentNameStringEntry : grades.entrySet()) {
            if (studentNameStringEntry.getKey().id == (name.id)) {
                studentNameStringEntry.getKey().changeFirstName(newName);
            }
        }
    }
    public void changeLastName(Student name, String newName) {
        for (Map.Entry<Student, String> studentNameStringEntry : grades.entrySet()) {
            if (studentNameStringEntry.getKey().id == (name.id)) {
                studentNameStringEntry.getKey().changeFirstName(newName);
            }
        }
    }
    public void changeGrade(Student name, String to) {
        for (Map.Entry<Student, String> studentNameStringEntry : grades.entrySet()) {
            if (studentNameStringEntry.getKey().id == (name.id)) {
                studentNameStringEntry.setValue(to);
            }
        }
    }

    public String display() {
        String display = "";
        for (Map.Entry<Student, String> entry : grades.entrySet()) {
            display = display + "Name = " + entry.getKey().getName()+ "   Grade = " + entry.getValue() + "\n";
        }
        return display;
    }
}
