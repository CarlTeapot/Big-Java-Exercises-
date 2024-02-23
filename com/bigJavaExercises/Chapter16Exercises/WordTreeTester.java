package com.bigJavaExercises.Chapter16Exercises;

public class WordTreeTester {
    public static void main(String[] args) {
        WordTree tree = new WordTree("zdarova megobrebo ra xdeba");
        tree.divide();
        System.out.println(tree.getWords());
        System.out.println(tree.getSize());
    }
}
