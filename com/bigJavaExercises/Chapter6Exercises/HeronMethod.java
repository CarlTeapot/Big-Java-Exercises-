package com.bigJavaExercises.Chapter6Exercises;

import java.util.Scanner;


public class HeronMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number;
        double root;
        double guess = 1;

        System.out.print("Enter the number you want to get square root  of: ");
        number = scanner.nextInt();
        root = Math.sqrt(number);

        for (int i = 1; i <= root; ) {
            guess = (guess + (number / guess)) / 2;
            System.out.println(guess);

            if (guess == root)
                System.out.println("Done");
            break;
        }
    }
}
