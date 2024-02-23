package com.bigJavaExercises.Chapter5Exercises;

import java.util.Scanner;

public class RoundingTester {
    public static void main(String[] args) {
    Rounding rounding = new Rounding();
        System.out.println(rounding.round());
    }
}

class Rounding {
    Scanner scanner = new Scanner(System.in);

    private double number;
    private double number2;

    public Rounding() {
        System.out.print("Enter the first decimal number: ");
        number = scanner.nextDouble();
        System.out.print("Enter the second decimal number: ");
        number2 = scanner.nextDouble();
    }

    public String round() {
        if (number > number2) {
            if (number - number2 < 0.01)
                return "They are the same when rounded to two decimal places";
            return "They are different when rounded to two decimal places";
        }
        else if (number2 > number) {
            if (number2 - number < 0.01)
                return "They are the same when rounded to two decimal places";
            return "They are different when rounded to two decimal places";
        }
        return "They are same";
    }

}
