package com.bigJavaExercises.Chapter8Exercises;

//import jdk.jshell.spi.ExecutionControl;

public class PayCheck {



    public PayCheck() {

    }

    public static String getPaycheck(Student name, int hourlyWage, int montlyHoursWorked) {
        int paycheck = (hourlyWage * montlyHoursWorked) / 2;
        String zaza = name.getName() + "'s paycheck is: ";

        int tax = 0;

        if (hourlyWage < 0)
            throw new IllegalStateException();
        if (montlyHoursWorked < 0)
            throw new IllegalStateException();
        if (paycheck > 0 && paycheck < 750) {
            tax = (paycheck / 100) * 15;
        }
        if (paycheck > 750 && paycheck < 2000) {
            tax = (paycheck / 100) * 20;
        }
        if (paycheck > 2000 && paycheck < 10000) {
            tax = (paycheck / 100) * 40;
        }
        if (paycheck > 10000 && paycheck < 30000) {
            tax = (paycheck / 100) * 60;
        }
        if (paycheck > 30000) {
            tax = (paycheck / 100) * 70;
        }
        int socialSecurityTax = (paycheck / 100) * 6;
        int  afterTaxes = paycheck - tax - socialSecurityTax;
        return zaza + afterTaxes;
    }
}
