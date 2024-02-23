package com.bigJavaExercises.Chapter4Exercises;

import java.util.Random;

public class DataSetTester {
    static DataSetTester data = new DataSetTester();
    Random random = new Random();
    int number = 1000;
    int randomResult;

    public static void main(String[] args) {


        DataSet dataSet = new DataSet();
        System.out.println(dataSet.addValue(data.getRandom()));
        System.out.println(dataSet.addValue(data.getRandom()));
        System.out.println(dataSet.addValue(data.getRandom()));

        System.out.println(dataSet.getSum());
        System.out.println(dataSet.getAverage());
        System.out.println(dataSet.getLargest());



    }

    public int getRandom() {
        for (int i = 1; i <= 100; i++) {
            randomResult = random.nextInt(number);
        }
        return randomResult;
    }
}

class DataSet {
    private Random random = new Random();
    private int number = 1000;


    private double sum;
    private int count;
    private double largest;
    private int smallest;

    public DataSet() {
        sum = 0;
        count = 0;
        largest = 0;
        smallest = 0;
    }

    public void add(double... values) {
        for (int i = 0; i < values.length; i++) {
            double x = values[i];
            sum = sum + x;
            if (count == 0 || largest < x)
                largest = x;
            count++;
        }
    }


    public int addValue(int x) {
        sum = sum + x;
        count++;
        smallest = Math.min(smallest, x);
        largest = Math.max(largest, x);
        return x;
    }

    public double getAverage() {
        if (count == 0)
            return 0;
        return sum / count;
    }

    public int getSum() {
        return (int) sum;
    }

    public double getLargest() {
        return largest;
    }

    public int getSmallest() {
        return smallest;
    }

}


