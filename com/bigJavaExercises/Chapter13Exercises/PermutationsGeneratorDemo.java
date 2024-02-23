package com.bigJavaExercises.Chapter13Exercises;

import java.util.ArrayList;
/**
 This program demonstrates the permutation generator.
 */
public class PermutationsGeneratorDemo {
    public static void main(String[] args) {
        PermutationGenerator generator = new PermutationGenerator("yle");
        ArrayList<String> permutations = generator.getPermutations();
        for (String s : permutations) {
            System.out.println(s);
        }
    }
}