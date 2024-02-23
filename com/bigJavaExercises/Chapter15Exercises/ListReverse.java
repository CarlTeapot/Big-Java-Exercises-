package com.bigJavaExercises.Chapter15Exercises;

import org.w3c.dom.Node;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class ListReverse {
    private Node first = null;
    static LinkedList<String> list = new LinkedList<>();

    public static void reverse(LinkedList<String> staff) {
        list.addFirst(staff.getLast());
        staff.removeLast();
        for (int i = 0; i < staff.size(); i++) {
            list.add(staff.getLast());
            staff.removeLast();

            if (staff.size() <= 2)
                staff.removeFirst();
        }
    }
    public static String getList () {
        return list.toString();
    }
}

