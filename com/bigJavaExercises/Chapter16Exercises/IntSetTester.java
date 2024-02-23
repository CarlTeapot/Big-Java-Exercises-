package com.bigJavaExercises.Chapter16Exercises;

public class IntSetTester {
    public static void main(String[] args) {
        IntSet set = new IntSet();
        set.add(2);
        set.add(4);
        set.add(1);
        set.add(5);
        set.add(7);
        set.add(9);
        set.add(3);
        set.print();
        if (set.next() == 1)
            System.out.println("kaia");
    }
}
