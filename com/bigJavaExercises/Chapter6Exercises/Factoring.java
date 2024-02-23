package com.bigJavaExercises.Chapter6Exercises;

import java.util.Scanner;

public class Factoring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int factor;
        System.out.print("Enter the number you want to get factors of: ");
        number = scanner.nextInt();
        for (factor = 1; factor <= 6; factor++) {
            if (number % factor == 0)
                System.out.println(factor);
        }
    }
}
