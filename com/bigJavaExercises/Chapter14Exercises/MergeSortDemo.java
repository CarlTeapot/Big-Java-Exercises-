package com.bigJavaExercises.Chapter14Exercises;

import java.util.Arrays;

public class MergeSortDemo {
    public static void main(String[] args) {
        int[] a = ArrayUtil.randomIntArray(20, 100);
        System.out.println(Arrays.toString(a));
        MergeSorter sorter = new MergeSorter(a);
        sorter.sort();
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(a));
    }
}
