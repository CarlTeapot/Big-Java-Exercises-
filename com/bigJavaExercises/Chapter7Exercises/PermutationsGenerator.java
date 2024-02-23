package com.bigJavaExercises.Chapter7Exercises;

import java.util.ArrayList;
import java.util.Random;

public class PermutationsGenerator {
    private int[] list;
    private Random number;
    private ArrayList<Integer> nextPermutation;
    private int length;

    public PermutationsGenerator(int[] lists) {
        list = lists;
        length = list.length;
        number = new Random();
        nextPermutation = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            nextPermutation.add(0);
        }
    }

    public ArrayList<Integer> getRandom() {
        for (int i = 0; i < 10; i++) {
            nextPermutation.set(i, list[number.nextInt(list.length)]);
        }
        return nextPermutation;
    }

}
