package com.bigJavaExercises.Chapter6Exercises;

import java.util.Scanner;

public class CurrencyConversion {
    Scanner scanner = new Scanner(System.in);

    public double dollars;
    public double euros;
    public double exchangeRate;

    public CurrencyConversion() {
        dollars = scanner.nextDouble();
        exchangeRate = 1.22;
    }

    public String getEuros() {
            euros = dollars * exchangeRate;
            return Double.toString(euros);

    }
}
