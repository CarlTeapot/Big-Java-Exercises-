package com.bigJavaExercises.Chapter12Exercises;

import java.util.Random;
import java.util.Scanner;

public class Arithmetic {

    public int state;
    public final int BEGINNER = 1;
    public final int INTERMEDIATE = 2;
    public final int EXPERT = 3;

    private Random add1;
    private Random add2;
    private Random add3;
    private Random add4;
    private Random subtracter;
    private Random subtracted;
    private Scanner answer;

    public Arithmetic() {
        state = 0;
        add1 = new Random();
        add2 = new Random();
        add3 = new Random();
        add4 = new Random();
        subtracter = new Random(9);
        subtracted = new Random(subtracter.nextInt());
        answer = new Scanner(System.in);
    }
    public void beginnerTests() {
        System.out.println("[beginner Tests begin]");
        for (int i = 0; i < 2; i++) {
            int adder1 = add1.nextInt(6);
            int adder2 = add2.nextInt(6);
            int sum = adder1 + adder2;

            System.out.print("whats " + adder1 + " + " + adder2 + ": ");

            if (answer.nextInt() == sum) {
                System.out.println("Correct answer, proceed");
                continue;
            }
            else if (answer.nextInt() == sum && i == 1) {
                System.out.println("Correct answer, move to the next level");
                continue;
            }

            else if (answer.nextInt() != sum && i == 1) {
                System.out.println("incorrect, try again");
                continue;
            }
            else {
                System.out.println("incorrect");
                break;
            }

        }
    }
    public void intermediateTests() {
        System.out.println("[Intermediate Tests begin]");
        for (int i = 0; i < 2; i++) {
            int adder1 = add3.nextInt(10);
            int adder2 = add4.nextInt(10);
            int zura = adder1 + adder2;
            System.out.print("whats " + adder1 + " + " + adder2 + ": ");

            if (answer.nextInt() == zura ) {
                System.out.println("Correct answer, proceed");
                continue;
            }
            else if (answer.nextInt() == zura && i == 1) {
                System.out.println("Correct answer, move to the next level");
                continue;
            }
            else if (answer.nextInt() != zura && i == 1) {
                System.out.println("incorrect, try again");
                continue;
            }
            else {
                System.out.println("incorrect");
                break;
            }
        }
    }
    public void expertTests() {
        System.out.println("[Expert Tests begin]");
        for (int i = 0; i < 2; i++) {
            int subtract = subtracter.nextInt(10);
            int subtract2 = subtracted.nextInt(subtract);
            int zura = subtract - subtract2;
            System.out.print("whats " + subtract + " - " + subtract2 + ": ");

            if (answer.nextInt() == zura) {
                System.out.println("Correct answer, proceed");
                continue;
            }
            else if (answer.nextInt() == zura && i == 1) {
                System.out.println("Correct answer, you are done");
                System.out.println("[You have successfully completed the arithmetic exam]");
                System.out.println("[sneed]");
                continue;
            }

            else if (answer.nextInt() != zura && i == 1) {
                System.out.println("incorrect, try again");
                continue;
            }
            else {
                System.out.println("incorrect");
                break;
            }
        }
    }

}
