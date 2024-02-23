package com.bigJavaExercises.Chapter10Exercises;

public class Employee {
    private int salary;
    private String name;

    public Employee(String employeeName,int employeeSalary) {
        name = employeeName;
        salary = employeeSalary;
    }
    public int getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return "Name of the Employee: " + name + "\n Salary: " + salary + " Dollars";
    }
}
