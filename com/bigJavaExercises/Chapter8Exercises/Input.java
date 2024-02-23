package com.bigJavaExercises.Chapter8Exercises;

import java.util.Scanner;

public class Input {
    public static String readInt(Scanner in, String prompt, String error, int min, int max) {
        int input = in.nextInt();
        if (input >= min && input <= max)
            return prompt;
        else
            return error;
    }
}
