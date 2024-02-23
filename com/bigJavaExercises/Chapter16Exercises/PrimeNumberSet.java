package com.bigJavaExercises.Chapter16Exercises;

import com.sun.source.tree.Tree;

import java.util.*;

public class PrimeNumberSet {
    private int number;
    private TreeSet<Integer> primeSet;
    private Iterator<Integer> iterator;

    public PrimeNumberSet(int aNumber) {
        number = aNumber;
        primeSet = new TreeSet<>();
        for (int i = 2; i <= number; i++) {
            primeSet.add(i);
        }
        iterator = primeSet.iterator();
    }

    public String getPrimeSetOriginal() {
        return primeSet.toString();
    }

    public String getPrimeNumbers() {
    /* for (int i = 0; i < primeSet.size(); i++) {
         if (primeSet.get(i) % 2 == 0) {
             primeSet.remove(i);
         }
     }
     for (int i = 0; i < primeSet.size(); i++) {
             if (primeSet.get(i) % 3 == 0) {
                 primeSet.remove(i);
             }
     }

     */

        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }

        }
        Iterator<Integer> newIterator = primeSet.iterator();
         while (newIterator.hasNext()) {
            if (newIterator.next() % 3 == 0) {
                newIterator.remove();
            }
        }
        return primeSet.toString();
    }
}

