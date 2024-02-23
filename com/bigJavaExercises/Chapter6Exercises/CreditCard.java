package com.bigJavaExercises.Chapter6Exercises;

import java.util.Scanner;

public class CreditCard {
    Scanner scanner = new Scanner(System.in);

    private String number;

    public CreditCard() {
        System.out.print("Enter your 8 digit credit card number: ");
        number = scanner.next();

    }

    public String step1() {
        if (number.length() > 8)
            return "Error, use a 8 digit number";
        else if (number.contains(" "))
            return "Please don't use spaces and don't separate the numbers in any way";
        else {
            int a = Integer.parseInt(number.substring(7, 8));
            int b = Integer.parseInt(number.substring(5, 6));
            int c = Integer.parseInt(number.substring(3, 4));
            int d = Integer.parseInt(number.substring(1, 2));
            return Integer.toString(a + b + c + d);
        }
    }

    public String step2() {
        int a1 = Integer.parseInt(number.substring(6, 7));
        String a2 = Integer.toString(a1 * 2);
        int a;
        if (a2.length() >= 2) {
            a = Integer.parseInt(a2.substring(0, 1)) + Integer.parseInt(a2.substring(1, 2));
        } else {
            a = Integer.parseInt(a2);
        }

        int b1 = Integer.parseInt(number.substring(4, 5));
        String b2 = Integer.toString(b1 * 2);
        int b;
        if (b2.length() >= 2) {
            b = Integer.parseInt(b2.substring(0, 1)) + Integer.parseInt(b2.substring(1, 2));
        } else {
            b = Integer.parseInt(b2);
        }

        int c1 = Integer.parseInt(number.substring(2, 3));
        String c2 = Integer.toString(c1 * 2);
        int c;
        if (c2.length() >= 2) {
            c = Integer.parseInt(c2.substring(0, 1)) + Integer.parseInt(c2.substring(1, 2));
        } else {
            c = Integer.parseInt(c2);
        }

        int d1 = Integer.parseInt(number.substring(0, 1));
        String d2 = Integer.toString(d1 * 2);
        int d;
        if (d2.length() >= 2) {
            d = Integer.parseInt(d2.substring(0, 1)) + Integer.parseInt(d2.substring(1, 2));
        } else {
            d = Integer.parseInt(d2);
        }
        return Integer.toString(a + b + c + d);
    }

    public String step3() {
        return Integer.toString(Integer.parseInt(step1()) + Integer.parseInt(step2()));
    }

    public String checkValidity() {
        String xd = step3().substring(1,2);
        if (xd.equals("0"))
            return "Valid number, you are good to go";
        return "Invalid card number";
    }

}
