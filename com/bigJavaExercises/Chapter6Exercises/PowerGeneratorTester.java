package com.bigJavaExercises.Chapter6Exercises;

import java.util.Scanner;

public class PowerGeneratorTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number;
        double numberPower;
        String yesOrNo;
        boolean done = false;
        System.out.print("Enter the number you want to get powers of: ");
        number = scanner.nextDouble();
        numberPower = number * number;
        System.out.println(numberPower);

        while (!done) {
                System.out.print("Do you want to continue getting powers of the number?: (Type yes or no) ");
                yesOrNo = scanner.next();

                if (yesOrNo.equalsIgnoreCase("no")) {
                    System.out.println("Thank you for using this software");
                    done = true;
                }
                else if (yesOrNo.equalsIgnoreCase("yes")) {
                    numberPower *= number;
                    System.out.println(numberPower);
                    done = false;
                }

                else {
                    System.out.println("Enter yes or no");
                    done = false;
                }
        }
    }
}



