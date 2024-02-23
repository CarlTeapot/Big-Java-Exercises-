package com.bigJavaExercises.Chapter5Exercises;

import java.util.Scanner;

public class PaycheckTester {
    public static void main(String[] args) {
    Paycheck paycheck = new Paycheck();
        System.out.println(paycheck.paycheck());
    }
}

class Paycheck {
    Scanner scanner = new Scanner(System.in);

    private double hourlyWages;
    private double hours;

    public Paycheck() {
        System.out.print("Enter your hourly wage: ");
        hourlyWages = scanner.nextDouble();

        System.out.print("Enter the amount of hours you work per week: ");
        hours = scanner.nextDouble();
    }

    public String paycheck() {
        double wage = hourlyWages * hours;
        if (hours <= 0)
            return "Enter the correct number";
        else if (hours > 0 && hours < 40)
            return "Your paycheck is " + wage + " Dollars.";
        return "Your paycheck is " + wage * 1.5 + " Dollars.";
    }
}