package com.bigJavaExercises.Chapter5Exercises;

import java.util.Scanner;

public class LeapYearTester {
    public static void main(String[] args) {
        LeapYear year = new LeapYear();
        System.out.println(year.determineYear());
    }
}

class LeapYear {
    Scanner scanner = new Scanner(System.in);
    public int year;

    public LeapYear() {
        System.out.print("Enter the year to determine whether it is a leap year or not: ");
        year = scanner.nextInt();
    }
    public String determineYear() {
        if (year % 4 == 0)
            return year + " Is a leap year";
        return year + " Is not a leap year";
    }

}