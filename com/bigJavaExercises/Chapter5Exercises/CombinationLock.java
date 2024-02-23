package com.bigJavaExercises.Chapter5Exercises;

import java.util.Scanner;

public class CombinationLock {
    public static void main(String[] args) {
        Combination lock = new Combination();
        System.out.println(lock.getLock());

    }
}


class Combination {
    Scanner scanner = new Scanner(System.in);

    private String lock1;
    private String lock2;
    private String lock3;
    private String attempt1;
    private String attempt2;
    private String attempt3;
    private String tornike;

    public Combination() {
        int i = 10001;
        while(i < 1000){
           break;
        }




        System.out.println("enter your new password (maximum three letters or symbols): ");
        tornike = scanner.next();
        lock1 = tornike.substring(0,1);
        lock2 = tornike.substring(1,2);
        lock3 = tornike.substring(2,3);

        System.out.println("Enter the first Letter of the lock: ");
        attempt1 = scanner.next();
        System.out.println("Enter the second Letter of the lock: ");
        attempt2 = scanner.next();
        System.out.println("Enter the second Letter of the lock: ");
        attempt3 = scanner.next();
    }

    public String getLock() {
        if (lock1.equalsIgnoreCase(" ") || lock1.equalsIgnoreCase("")
                || lock2.equalsIgnoreCase(" ") || lock2.equalsIgnoreCase("")
                || lock3.equalsIgnoreCase("") || lock3.equalsIgnoreCase(" "))
            return "enter something and don't use spaces when entering";
        else if (attempt1.equalsIgnoreCase(lock1) && attempt2.equalsIgnoreCase(lock2) || attempt3.equalsIgnoreCase(lock3))
            return "Correct password";
        return "Incorrect";
    }


}
