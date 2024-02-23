package com.bigJavaExercises.Chapter15Exercises;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class ListDownsize {

    public static void downsize(LinkedList<String> staff) {
        for (int i = 1; i < staff.size(); i = i + 1) {
            staff.remove(i);
        }
    }
}
