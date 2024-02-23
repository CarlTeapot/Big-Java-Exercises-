package com.bigJavaExercises.Chapter7Exercises;

import java.util.Random;
import java.util.Scanner;

public class DieTossesTester {
    public static void main(String[] args) {

        Random randomRoll = new Random();
        int size = 20;
        int[] diceRolls = new int[size];
        for (int i = 0; i < size; i++) {
            diceRolls[i] = randomRoll.nextInt(6);
        }

        boolean inRun = false;

        for (int i = 0; i < size - 1; i++) {
            if (inRun == true) {

                if (diceRolls[i] != diceRolls[i - 1]) {
                    System.out.print(")");

                    inRun = false;

                }

            }
            if (inRun == false) {
                if (diceRolls[i] == diceRolls[i + 1]) {

                    System.out.print("(");

                    inRun = true;

                }

            }
            System.out.print(diceRolls[i]);
        }
        if (inRun) {
            System.out.print(diceRolls[size - 1]);
            System.out.print(")");
        } else {
            System.out.print(diceRolls[size - 1]);
        }
    }
}