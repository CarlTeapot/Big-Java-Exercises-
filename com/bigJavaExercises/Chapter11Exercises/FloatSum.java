package com.bigJavaExercises.Chapter11Exercises;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FloatSum {
    public static void main(String[] args) {
        Scanner zaza = new Scanner(System.in);
        boolean done = false;
        double xd = 0;
        for (int i = 0; i < 3; i++) {
            xd = xd + zaza.nextDouble();

            while (done)
                if (zaza.hasNext())
                    throw new InputMismatchException("enter a normal number");

                if (!zaza.hasNext()) {
                    done = true;
                    zaza.close();
                }
            }
        System.out.println(xd);
        }
}

