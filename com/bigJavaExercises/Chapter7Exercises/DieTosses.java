package com.bigJavaExercises.Chapter7Exercises;

import java.lang.reflect.Array;
import java.util.Random;

public class DieTosses {
    private Random random;
    private int[] diceRolls;
    private int size;
    private String output;
    private int firstRoll;
    private int lastRoll;
    private boolean inRun = false;

    public DieTosses() {
        size = 20;
        diceRolls = new int[size];
        random = new Random();
        output = "";
        firstRoll = diceRolls[0];
        lastRoll = diceRolls[18];
    }

    public void getRolls() {
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
    }
}
