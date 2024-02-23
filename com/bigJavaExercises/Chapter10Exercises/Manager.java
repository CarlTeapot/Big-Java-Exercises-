package com.bigJavaExercises.Chapter10Exercises;

public class Manager extends Employee{
    private int salary;
    private String name;
    public String department;
    public Manager(String employeeName,int employeeSalary,String managerDepartment) {
        super(employeeName,employeeSalary);
        name = employeeName;
        salary = employeeSalary;
        department = managerDepartment;
    }
    public int getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return  department;
    }
    public String toString() {
        return "Name of the Manager: " + name + "\nSalary: " + salary +  " Dollars" + "\nDepartment: " + department;
    }
}
