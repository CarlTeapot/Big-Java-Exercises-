package com.bigJavaExercises.Chapter14Exercises;

import java.util.Arrays;
import java.util.Random;

public class SelectionSortSamples {
    private int minimum;
    private int maximum;
    private int measurementAmount;
    private long[] times;
    private ArrayUtil util;
    public SelectionSortSamples(int aMinimum, int aMaximum, int aMeasurementAmount) {
        minimum = aMinimum;
        maximum = aMaximum;
        measurementAmount = aMeasurementAmount;
        times = new long[measurementAmount];
    }

    public int getMinimum() {
        return minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    private int doSamples() {

        for (int i = 0; i < measurementAmount; i++) {
            Random random = new Random();
            int zura = random.nextInt(10000);
            int[] a = ArrayUtil.randomIntArray(zura, 100);
            SelectionSorter sorter = new SelectionSorter(a);

            StopWatch timer = new StopWatch();
            timer.start();
            sorter.sort();
            timer.stop();

            times[i] = timer.getElapsedTime();
        }
        return 0;
    }
    public String getMeasurements() {
        doSamples();
        SelectionSortLong sorter = new SelectionSortLong(times);
        sorter.sort();
        return Arrays.toString(times);
    }
}
