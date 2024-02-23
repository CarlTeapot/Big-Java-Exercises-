package com.bigJavaExercises.Chapter13Exercises;

public class DataSet {
    private int[] values;
    private int first;
    private int last;
    private int maximum;
    private int start;
    private int start2;
    private int sum;
    public DataSet(int[] theValues, int aFirst, int aLast) {
        values = theValues;
        first = aFirst;
        last = aLast;
        maximum = 0;
        start = 0;
        start2 = 0;
        sum = 0;
    }

    public int getMaximum() {
        if (values[start] > maximum) {
            maximum = values[start];
        }
        start++;
        if (start != values.length) {
            getMaximum();
        }

        return maximum;
    }
    public int getSum() {
        sum = sum + values[start2];
        start2++;
        if (start2 < values.length) {
            getSum();
        }
        return sum;
    }
}

