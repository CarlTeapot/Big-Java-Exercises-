package com.bigJavaExercises.Chapter7Exercises;

public class PermutationsGeneratorTester {
    public static void main(String[] args) {
        int[] xd = {0,1,2,3,4,5,6,7,8,9};
        PermutationsGenerator generator = new PermutationsGenerator(xd);

        System.out.println(generator.getRandom());
    }
}
