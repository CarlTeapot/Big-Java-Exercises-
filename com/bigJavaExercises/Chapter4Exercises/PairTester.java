package com.bigJavaExercises.Chapter4Exercises;

public class PairTester {
    public static void main(String[] args) {
        Pair pair = new Pair(15,20);
        System.out.println(pair.getSum());
        System.out.println(pair.difference());
        System.out.println(pair.product());
        System.out.println(pair.average());
        System.out.println(pair.distance());
        System.out.println(pair.minimum());
        System.out.println(pair.maximum());
    }
}

class Pair {
    private double x;
    private double y;

    public Pair(double xNumber, double yNumber) {
        x = xNumber;
        y = yNumber;
    }
    public double getSum() {
        double z = x + y;
        return z;
    }
    public double difference() {
        double z = x - y;
        return z;
    }
    public double product() {
        double z = x * y;
        return z;
    }
    public double average() {
        double z = (x + y) / 2;
        return z;
    }
    public double distance() {
        if (x > y)
            return x - y;
        return y - x;
    }
    public double maximum() {
        double z = Math.max(x,y);
        return z;
    }
    public double minimum() {
        double z = Math.min(x,y);
        return z;
    }
}