package com.bigJavaExercises.Chapter5Exercises;

import java.util.Scanner;

public class SortingTester {
    public static void main(String[] args) {
      //  Scanner scanner = new Scanner(System.in);
        //int[] numbers = new int[3];
        //System.out.print("Enter the first number: ");
        //numbers[0] = scanner.nextInt();
        //System.out.print("Enter the second number: ");
        //numbers[1] = scanner.nextInt();
        //System.out.print("Enter the third number: ");
        //numbers[2] = scanner.nextInt();
        //Arrays.sort(numbers);
        //System.out.println(Arrays.toString(numbers));
        Sorting numbers = new Sorting();
        System.out.println(numbers.sort());
    }
}

class Sorting {
    Scanner scanner = new Scanner(System.in);
    private double number1;
    private double number2;
    private double number3;

    public Sorting() {
        System.out.print("Enter the first number: ");
        number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        number2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        number3 = scanner.nextInt();
    }

    public String sort() {
        if (number1 >= number2 && number1 >= number3) {
            if (number2 >= number3)
                return "First number is: " + number1 + "\nSecond number is: " + number2 + "\nThird number is: " + number3;
            return "First number is: " + number1 + "\nSecond number is: " + number3 + "\nThird number is: " + number2;
        } else if (number2 >= number1 && number2 >= number3) {
            if (number1 >= number3)
                return "First number is: " + number2 + "\nSecond number is: " + number1 + "\nThird number is: " + number3;
            return "First number is: " + number2 + "\nSecond number is: " + number3 + "\nThird number is: " + number1;
        } else if (number3 >= number1 && number3 >= number2) {
            if (number1 >= number2)
                return "First number is: " + number3 + "\nSecond number is: " + number1 + "\nThird number is: " + number2;
            return "First number is: " + number3 + "\nSecond number is: " + number2 + "\nThird number is: " + number1;
        }
        return "Error";
    }
}

