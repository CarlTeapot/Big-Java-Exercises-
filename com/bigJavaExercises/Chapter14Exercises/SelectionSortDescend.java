package com.bigJavaExercises.Chapter14Exercises;

public class SelectionSortDescend {
    private int[] a;


    public SelectionSortDescend(int[] anArray) {
        a = anArray;
    }

    /**
     * Sorts the array managed by this selection sorter.
     */
    public void sort() {
        for (int i = a.length-1; i >= 0; i--) {
            int maxpos = maximumPosition(i);
            swap(maxpos,i);
        }
    }

    /**
     * Finds the smallest element in a tail range of the array.
     *
     * @param from the first position in a to compare
     * @return the position of the smallest element in the
     * range a[from] . . . a[a.length - 1]
     */
    private int maximumPosition(int from) {
        int maxPos = from;
        for (int i = from - 1; i >= 0; i--)
            if (a[i] < a[maxPos])
                maxPos = i;
        return maxPos;
    }

    /**
     * Swaps two entries of the array.
     *
     * @param i the first position to swap
     * @param j the second position to swap
     */
    private void swap(int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
