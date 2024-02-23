package com.bigJavaExercises.Chapter9Exercises;

public class DataSetSimple {
    private double sum;
    private int maximum;
    private int count;
    private int minimum;

    public void add(Measurable x) {
        sum = sum + x.measure(x);
        if (count == 0 || x.measure(maximum) < x.measure(x))
            maximum = x.getMeasure();
        if (count == 0 || x.measure(minimum) > x.measure(x))
            minimum = x.getMeasure();
        count++;
    }

    public int getMaximum() {
        return maximum;
    }
    public int getAverage() {
        if (count == 0) return 0;
        else return (int) sum / count;
    }
    public int getMinimum() {
        return minimum;
    }
}