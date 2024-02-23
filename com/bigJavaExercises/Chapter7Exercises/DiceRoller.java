package com.bigJavaExercises.Chapter7Exercises;

import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
    private Scanner scanner;
    private Random random;
    private int size;
    private int[] diceRolls;
    boolean inRun = false;

    public DiceRoller() {
        scanner = new Scanner(System.in);
        random = new Random();
        System.out.print("Please enter size: ");

        size = scanner.nextInt();

        diceRolls = new int [size];
        for (int i = 0; i < size; i++) {
            diceRolls[i] = random.nextInt(6);
        }

    }
    public int[] getDiceRolls() {
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
        }
        if (inRun) {
                System.out.print(diceRolls[size - 1]);
                System.out.print(")");
            } else {
                System.out.print(diceRolls[size - 1]);
            }
        return diceRolls;
        }
    }


