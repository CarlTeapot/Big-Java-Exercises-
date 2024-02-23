package com.bigJavaExercises.Chapter6Exercises;

import java.util.Scanner;

public class DartTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of tries: ");
        int n = in.nextInt();
        int miss = 0;
        int hit = 0;
        double x = 0;
        double y = 0;
        double func = 0;
        for (int i = 0; i < n; i++) {
            x = Math.random() * 2 - 1;
            y = Math.random() * 2 - 1;
            func = x * x + y * y;
            if (func <= 1) {
                hit++;
            } else {
                miss++;
            }
        }
        System.out.println("Probability: " + hit / (hit + miss) * 4);
    }

}
