package com.bigJavaExercises.Chapter3Exercises;


import java.text.NumberFormat;

class EmployeeTester {
    private String employeename;
    private double currentSalary;

    public EmployeeTester() {
        currentSalary = 0;
    }
    public String getName(String name) {
        employeename = name;
        return name;
    }
    public double getSalary(int salary) {
        currentSalary = salary;
        return salary;
    }
    public double raiseSalary(double byPercent) {
        currentSalary = currentSalary + (currentSalary * byPercent / 100);
        return currentSalary;
    }
}

public class Employee {
    public static void main(String[] args) {
        EmployeeTester employee = new EmployeeTester();
        String zaza = employee.getName("Tornike");
        double salary = employee.getSalary(20000);
        double salaryAfterRaise = employee.raiseSalary(5);
         Math.round(salary);
         Math.round(salaryAfterRaise);
        NumberFormat valuta = NumberFormat.getCurrencyInstance();
        String zesvi =  valuta.format(salary);
        String nana = valuta.format(salaryAfterRaise);


        System.out.println("His name is " + zaza);
        System.out.println("His Salary is " + zesvi);
        System.out.println("His Salary after raise is " + nana);
    }
}
