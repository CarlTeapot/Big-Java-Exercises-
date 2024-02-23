package com.bigJavaExercises.Chapter5Exercises;

import java.util.Scanner;

public class TimeComparingTester {
    public static void main(String[] args){
        System.out.println(args[0]);
    }
}
class TimeComparing {
    Scanner scanner = new Scanner(System.in);

    private int hours1;
    private int hours2;
    private int minutes1;
    private int minutes2;

    public TimeComparing() {
        System.out.print("Enter the random time in military format: ");
        String tornike = scanner.next();
        hours1 = Integer.parseInt(tornike.substring(0,2));
        minutes1 = Integer.parseInt(tornike.substring(3,5));
        System.out.print("Enter the second random time in military format: ");
        String tornike1 = scanner.next();
        hours2 = Integer.parseInt(tornike1.substring(0,2));
        minutes2 = Integer.parseInt(tornike1.substring(3,5));
    }

    public String compareTimes() {
    if (hours1 < 24 && hours2 < 24 && minutes1 < 60 && minutes2 < 60) {
        if (hours1 > hours2)
            return "The first time is: " + hours2 + ":" + minutes2;
        else if (hours2 > hours1)
            return"The first time is: " +  hours1 + ":" + minutes1;
        else if (hours2 == hours1) {
            if (minutes1 > minutes2)
                return "The first time is: " + hours2 + ":" + minutes2;
            else if (minutes2 > minutes1)
                return "The first time is: " + hours1 + ":" + minutes1;
            return "They are equal, try again";
            }
        return "Error";
         }
    return "Error";
    }
}
