package com.bigJavaExercises.Chapter13Exercises;

public class SubstringGeneratorTester {
    public static void main(String[] args) {
        SubstringGenerator generator = new SubstringGenerator("zaza");
        System.out.println(generator.allSubstrings());
        System.out.println(generator.allSubsets());
    }
}
