package com.bigJavaExercises.Chapter13Exercises;

public class DataSetTester {
    public static void main(String[] args) {
        int[] values = {13, 287, 34, 29, 58, 14, 299};
        DataSet dataSet = new DataSet(values, 15, 8);
        System.out.println(dataSet.getMaximum());
        System.out.println(dataSet.getSum());

    }
}
