package com.bigJavaExercises.Chapter6Exercises;

import java.util.Scanner;

public class ExpApproximate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number;
        double power;
        double number2;
        double approximateAnswer;

        System.out.print("Enter the number you want to get the approximate power of: ");
        number = scanner.nextDouble();

        System.out.print("Now enter the power number: ");
        power = scanner.nextDouble();

        double correctAnswer = Math.pow(number,power);
        System.out.println("lets try guessing the number: ");

        for (number2 = 1; number2 <= correctAnswer; number2 ++) {
            approximateAnswer = (Math.pow(power, number2)) / Math.abs(number2);

            if (approximateAnswer >= correctAnswer) {
                System.out.println(approximateAnswer + " - sworia");
                break;
            }
            System.out.println(approximateAnswer);
        }


    }
}
