package com.bigJavaExercises.Chapter5Exercises;

import java.util.Scanner;

public class SeasonPrinterTester {
    public static void main(String[] args) {
        SeasonPrinter season = new SeasonPrinter();
        System.out.println(season.getMonth());
    }
}

class SeasonPrinter {
    Scanner scanner = new Scanner(System.in);

    private int month;

    public SeasonPrinter() {
        System.out.print("Enter the number of the month: ");
        month = scanner.nextInt();
    }

    public String getMonth() {
        if (month == 12 || month == 1 || month == 2)
            return "Winter";
        else if (month == 3 || month == 4 || month == 5)
            return "Spring";
        else if (month == 6 || month == 7 || month == 8)
            return "Summer";
        else if (month == 9 || month == 10 || month == 11)
            return "Fall";
        return "Please re-run the program and enter the correct month number.";
    }
}
