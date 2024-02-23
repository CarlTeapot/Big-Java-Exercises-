package com.bigJavaExercises.Chapter10Exercises;

public class Student extends Person{
    private final int birthYear;
    private final String name;
    private final String major;
    public Student(String name, int birthYear, String major) {
        super(name,birthYear);
        this.name = name;
        this.birthYear = birthYear;
        this.major = major;
    }
    public String toString() {
        return "Name of the Student: " + name + "\n Age: " + birthYear + "\n Major: " + major;
    }
}
