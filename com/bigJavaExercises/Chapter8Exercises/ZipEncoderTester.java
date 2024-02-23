package com.bigJavaExercises.Chapter8Exercises;

import java.util.Scanner;

public class ZipEncoderTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the zipcode. remember, length of a zipcode is 6 digits: ");
        int zipCode = scanner.nextInt();
        String code = Integer.toString(zipCode);
        if (code.length() > 6)
            throw new IllegalStateException();

        System.out.println(ZipEncoder.encode(zipCode));
    }
}
