package com.bigJavaExercises.Chapter2Exercises;

import java.lang.reflect.Array;
import java.util.Random;

public class LotteryPrinter {
    public static void main(String[] args) {
        System.out.println("Play this combination - it'll make you rich!");
        Random rnd = new Random();
        for (int i = 0; i < 6; i++) {
            System.out.print(rnd.nextInt(49) + 1);
            System.out.print(" ");
        }
        System.out.println();
            }
        }
