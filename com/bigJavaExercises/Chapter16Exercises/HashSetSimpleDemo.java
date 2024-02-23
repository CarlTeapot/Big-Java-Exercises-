package com.bigJavaExercises.Chapter16Exercises;

import java.util.Iterator;
import java.util.Set;

public class HashSetSimpleDemo {
    public static void main(String[] args) {
        Set names = new HashSetSimple(101); // 101 is a prime
        names.add("Harry");
        names.add("Sue");
        names.add("Nina");
        names.add("Susannah");
        names.add("Larry");
        names.add("Eve");
        names.add("Sarah");
        names.add("Adam");
        names.add("Tony");
        names.add("Katherine");
        names.add("Juliet");
        names.add("Romeo");
        names.remove("Romeo");
        names.remove("George");
        Iterator iter = names.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());
    }
}
