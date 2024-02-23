package com.bigJavaExercises.Chapter4Exercises;


import java.util.Scanner;

public class MonthTester {
    public static void main(String[] args) {
        Months month = new Months();
        System.out.println(month.getName());
    }
}
class Months {
    Scanner scanner = new Scanner(System.in);
    private String months;
    private int monthNumber;
    public Months() {
        months = "January February March April May June July August September October November December";
        System.out.print("Month Number is: ");
        monthNumber = scanner.nextInt();

    }
    public String getName() {
    if (monthNumber == 1)
        return months.substring(0,8);
    else if (monthNumber == 2)
        return months.substring(8,17);
    else if (monthNumber == 3)
        return months.substring(17,23);
    else if (monthNumber == 4)
        return months.substring(23,29);
    else if (monthNumber == 5)
        return months.substring(29,33);
    else if (monthNumber == 6)
        return months.substring(33,38);
    else if (monthNumber == 7)
        return months.substring(38,43);
    else if (monthNumber == 8)
        return months.substring(43,50);
    else if (monthNumber == 9)
        return months.substring(50,60);
    else if (monthNumber == 10)
        return months.substring(60,68);
    else if (monthNumber == 11)
        return months.substring(68,77);
    else if (monthNumber == 12)
        return months.substring(77,85);
    return "Invalid month number, try again";

    }
}
