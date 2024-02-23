package com.bigJavaExercises.Chapter10Exercises;

public class Instructor extends Person{
    private final int birthYear;
    private final String name;
    private final int salary;
    public Instructor(String personName, int personBirthYear, int salary) {
        super(personName, personBirthYear);
        name = personName;
        birthYear = personBirthYear;
        this.salary = salary;
    }
    public String toString() {
        return "Name of the Instructor: " + name + "\n Age: " + birthYear + "\n Salary: " + salary;
    }

}
