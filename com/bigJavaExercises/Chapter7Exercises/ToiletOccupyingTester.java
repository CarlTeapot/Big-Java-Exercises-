package com.bigJavaExercises.Chapter7Exercises;

import java.util.Scanner;

public class ToiletOccupyingTester {
    public static void main(String[] args) {
            ToiletOccupying toilet = new ToiletOccupying(20,5);
            System.out.print("Enter number of stalls");
            Scanner in = new Scanner(System.in);
            int i = in.nextInt();
            boolean [] stalls = new boolean [i];
            while(!toilet.giveFlag(stalls))
            {
                toilet.findStalls(stalls);
                toilet.printStalls(stalls);
            }

    }


}

