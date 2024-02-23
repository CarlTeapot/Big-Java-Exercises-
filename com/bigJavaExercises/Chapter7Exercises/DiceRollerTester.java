package com.bigJavaExercises.Chapter7Exercises;

import java.util.Random;
import java.util.Scanner;

public class DiceRollerTester {
    public static void main(String[] arg) {

        Scanner in = new Scanner(System.in);

        Random randomRoll = new Random();
        System.out.print("Please enter size:");
        int size = in.nextInt();
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

