package com.bigJavaExercises.Chapter6Exercises;

import java.util.Scanner;

public class CurrencyConversionTester {

    public static void main(String [] args) {

        double USD;

        double USDToEuro;

        boolean done = false;

        Scanner console = new Scanner(System.in);

        System.out.print("USD to Euro conversion rate: ");

        USDToEuro = console.nextDouble();

        while (!done) {

            System.out.print("How many USD will you convert to Euros? Enter 0 to quit: ");

            USD = console.nextDouble();

            if (USD == 0) {
                System.out.println("Thanks for using our software");
                done = true;

            } else {

                System.out.println(USD + " USD is worth " + Convert(USD, USDToEuro) + " Euros");

            }

        }


    }

        public static double Convert(double USD, double USDToEuro) {
        return USD * USDToEuro;

    }

}

