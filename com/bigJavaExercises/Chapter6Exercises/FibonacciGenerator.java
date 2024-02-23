package com.bigJavaExercises.Chapter6Exercises;

import java.util.Scanner;

public class FibonacciGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fold1;
        double fold2;
        String yesOrNo;
        System.out.print("Enter the first numbers of Fibonacci sequence: ");
        double number = scanner.nextDouble();
        fold1 = number;
        fold2 = number;
        double foldNew = fold1 + fold2;
        System.out.println("Next number in the sequence is: " + foldNew);
        boolean done = false;

        while (!done) {
            System.out.print("Do you want to continue : (Type yes or no) ");
            yesOrNo = scanner.next();

            if (yesOrNo.equalsIgnoreCase("no")) {
                    System.out.println("Thank you for using this software");
                    done = true;
            }
            else if (yesOrNo.equalsIgnoreCase("yes")) {
                fold1 = fold2;
                fold2 = foldNew;
                foldNew = fold1 + fold2;
                System.out.println("Next number in the sequence is: " + foldNew);
                done = false;
            }
            else{
                    System.out.println("Enter yes or no");
                    done = false;
            }
            }
        }
    }
