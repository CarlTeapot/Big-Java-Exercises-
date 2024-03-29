package com.bigJavaExercises.Chapter14Exercises;

import java.util.Scanner;

public class SelectionSortTimer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = in.nextInt();
// Construct random array
        int[] a = ArrayUtil.randomIntArray(n, 100);
        SelectionSorter sorter = new SelectionSorter(a);
// Use stopwatch to time selection sort
        StopWatch timer = new StopWatch();
        timer.start();
        sorter.sort();
        timer.stop();
        System.out.println("Elapsed time: "
                + timer.getElapsedTime() + " milliseconds");
    }
}
