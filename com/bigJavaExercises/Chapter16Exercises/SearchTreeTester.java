package com.bigJavaExercises.Chapter16Exercises;

public class SearchTreeTester {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(3);
        tree.add(10);
        tree.add(7);
        tree.add(6);
        tree.add(1);
        tree.add(5);
        tree.add(9);
        System.out.println(tree.smallest());
    }
}
