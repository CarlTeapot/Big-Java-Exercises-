package com.bigJavaExercises.Chapter14Exercises;

import java.util.Arrays;

public class SelectionSortDescendDemo {
    public static void main(String[] args) {
        int[] zura = {19,15,3,16,12,9,7,4,1};
        System.out.println(Arrays.toString(zura));
        SelectionSortDescend sorter = new SelectionSortDescend(zura);
        sorter.sort();
        System.out.println(Arrays.toString(zura));
    }
}
