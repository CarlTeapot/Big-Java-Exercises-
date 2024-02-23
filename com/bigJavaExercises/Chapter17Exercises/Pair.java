package com.bigJavaExercises.Chapter17Exercises;

public class Pair<T> {
    private T first;
    private T second;

    /**
     * Constructs a pair containing two given elements.
     *
     * @param firstElement  the first element
     * @param secondElement the second element
     */
    public Pair(T firstElement, T secondElement) {
        first = firstElement;
        second = secondElement;
    }

    /**
     * Gets the first element of this pair.
     *
     * @return the first element
     */
    public T getFirst() {
        return first;
    }

    /**
     * Gets the second element of this pair.
     *
     * @return the second element
     */
    public T getSecond() {
        return second;
    }

    public String toString() {
        return "[" + first + ", " + second + "[";
    }
    public static <E extends Comparable> E min(E[] a)
    {
        E smallest = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i].compareTo(smallest) < 0) smallest = a[i];
        return smallest;
    }
    public void swap() {
        T temp = first;
        first = second;
        second = temp;
    }
}