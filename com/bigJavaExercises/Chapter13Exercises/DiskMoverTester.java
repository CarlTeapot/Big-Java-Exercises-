package com.bigJavaExercises.Chapter13Exercises;

import java.util.Scanner;

public class DiskMoverTester {
    public static void main(String[] args) {
        boolean done = false;
        int control = 0;
        DiskMover mover = new DiskMover(9);
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println(mover.createDisks());
        System.out.println(mover.getDisks());
        while (!done) {
            System.out.print("Swap from: ");
            int zura = scanner.nextInt();
            System.out.print("Swap to: ");
            int zura1 = scanner2.nextInt();
            mover.change(zura, zura1);
            System.out.println(mover.getDisks());
            for (int i = 1; i < mover.strings.size(); i++) {
                if (mover.strings.get(i).length() >= mover.strings.get(i - 1).length()) {
                    control++;
                }
            }

            if (control != 8)
                control = 0;
            if (control == 8) {
                done = true;
                System.out.println("[Congratulations!!!!]");
            }
        }
    }
}
