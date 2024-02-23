package com.bigJavaExercises.Chapter6Exercises;

import java.util.Scanner;

public class DerivationCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number;
        double firstNumber;
        double count;
        double sum;
        double derivation;
        String yesOrNo;

        System.out.print("Enter the first number to calculate the Derivation: ");
        double numberInput = scanner.nextDouble();
        firstNumber = numberInput;
        sum = firstNumber;
        boolean done = false;
        count = 1;
        while (!done) {
            System.out.print("Do you want to continue : (Type yes or no) ");
            yesOrNo = scanner.next();

            if (yesOrNo.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using my standard derivation calculator");
                done = true;
            }
            else if (yesOrNo.equalsIgnoreCase("yes")) {
                count ++;
                System.out.print("Enter the next number: ");
                number = scanner.nextDouble();
                sum = sum + number;

                derivation = Math.sqrt(((sum * sum) - ((sum * sum)/count)) / count - 1);
                System.out.println(" Standard Derivation is: " + derivation);

                done = false;

            }
            else{
                System.out.println("Enter yes or no");
                done = false;
            }

        }
    }
}
