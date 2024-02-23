package com.bigJavaExercises.Chapter10Exercises;

public class Person {
    private final int birthYear;
    private final String name;

    public Person(String personName, int personBirthYear) {
        name = personName;
        birthYear = personBirthYear;
    }
    public String getName() {
        return name;
    }
    public int getBirthYear() {
        return birthYear;
    }
    public String toString() {
        return "Name of the person: " + name + "\nAge: " + birthYear;
    }
}
