package com.bigJavaExercises.Chapter6Exercises;

import java.util.Random;

public class RandomDataAnalyzer {
    public static int number = 1000;
    public static Random random = new Random();



    public static void main(String[] args) {

        for (int i =1; i <= 100; i++) {
            System.out.println(random.nextInt(number));
        }
    }
}
