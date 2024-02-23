package com.bigJavaExercises.Chapter17Exercises;

import java.util.ArrayList;

public class BinarySearcher<T extends Comparable<T>> {
        private T[] a;
        private ArrayList<T> array;
        /**
         Constructs a BinarySearcher.
         @param anArray a sorted array of integers
         */
        public BinarySearcher(T[] anArray) {
            a = anArray;
        }
        public BinarySearcher(ArrayList<T> anArray) {
                array = anArray;
         }

    /**
     Finds a value in a sorted array, using the binary
     search algorithm.
     @param v the value to search
     @return the index at which the value occurs, or -1
     if it does not occur in the array
     */
    public int search(Comparable<T> v) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            T midVal = a[mid];
            int result = v.compareTo(midVal);

            if (result < 0) {
                high = mid - 1;
            }

            else if (result > 0) {
                low = mid + 1;
            }

            else {
                return mid;
            }
        }

        return -1;
    }
}
