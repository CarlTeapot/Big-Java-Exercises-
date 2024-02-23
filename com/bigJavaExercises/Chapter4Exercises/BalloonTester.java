package com.bigJavaExercises.Chapter4Exercises;

public class BalloonTester {
    public static void main(String[] args) {
        Balloon balloon = new Balloon();
    }
}

class Balloon {
    private double volume;
    public Balloon() {
        volume = 0;
    }
    public void addAir(double amount) {
        volume = volume + amount;
    }
    public double getVolume() {
        return volume;
    }
    public double getRadius() {
     double radius = Math.pow(volume / ((4 * Math.PI) / 3), 1.0/3);
        return radius;
    }
    public double getSurfaceArea() {
     double area = 4 * Math.PI * getRadius() * getRadius();
     return area;
    }
}