package com.bigJavaExercises.Chapter13Exercises;

import java.util.ArrayList;

public class PermutationGenerator {
    private String word;
    private ArrayList<String> permutations;
    private int turn;
    public PermutationGenerator(String aWord) {
        word = aWord;
        permutations = new ArrayList<>();
        turn = 0;
    }

    /**
     * Gets all permutations of a given word.
     */
    public ArrayList<String> getPermutations() {
// The empty string has a single permutation: itself
        if (word.length() == 0) {
            permutations.add(word);
            return permutations;
        }
// Loop through all character positions
        for (int i = 0; i < word.length(); i++) {
// Form a simpler word by removing the ith character
            String shorterWord = word.substring(0, i)
                    + word.substring(i + 1);
// Generate all permutations of the simpler word
            PermutationGenerator shorterPermutationGenerator
                    = new PermutationGenerator(shorterWord);
            ArrayList<String> shorterWordPermutations
                    = shorterPermutationGenerator.getPermutations();
// Add the removed character to the front of
// each permutation of the simpler word
            for (String s : shorterWordPermutations) {
                permutations.add(word.charAt(i) + s);
                turn++;
            }
        }
        return permutations;
    }
    public boolean hasMorePermutations() {
        if (!permutations.get(turn).equalsIgnoreCase(null)) {
            return false;
        }
        return true;
    }
}