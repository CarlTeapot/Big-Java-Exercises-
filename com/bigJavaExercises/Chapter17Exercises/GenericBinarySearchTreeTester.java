package com.bigJavaExercises.Chapter17Exercises;

public class GenericBinarySearchTreeTester {
    public static void main(String[] args) {
        GenericBinarySearchTree<Integer> tree = new GenericBinarySearchTree<>();
        tree.add(35185);
        tree.add(35835);
        tree.add(32384);
        tree.add(34368);
        tree.add(35092);
        tree.add(25911);
        tree.add(41445);
        tree.add(98052);
        System.out.println(tree.smallest());

    }
}
