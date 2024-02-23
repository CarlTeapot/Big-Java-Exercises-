package com.bigJavaExercises.Chapter5Exercises;

import java.util.Scanner;

public class DaysInMonthTester {
    public static void main(String[] args) {
    DaysInMonth daysInMonth = new DaysInMonth();
        System.out.println(daysInMonth.getDays());
    }
}

class DaysInMonth {
    Scanner scanner = new Scanner(System.in);

    private String month;

    public DaysInMonth() {
        System.out.print("Enter the month to get how many days it has: ");
        month = scanner.next();
    }
    public String getDays() {
        if (month.equalsIgnoreCase("January") || month.equalsIgnoreCase("March") || month.equalsIgnoreCase("May") ||
                month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August") || month.equalsIgnoreCase("October") ||
                month.equalsIgnoreCase("December"))
            return month + " Has " + 31 + " Days";
        else if (month.equalsIgnoreCase("April") || month.equalsIgnoreCase("June") || month.equalsIgnoreCase("September") ||
                month.equalsIgnoreCase("November"))
            return month + " Has " + 30 + " Days";
        else if (month.equalsIgnoreCase("February"))
            return month + " Has 28 or 29 Days, depending if it's a leap year or not";
        return "Enter the valid month ";
    }
}
