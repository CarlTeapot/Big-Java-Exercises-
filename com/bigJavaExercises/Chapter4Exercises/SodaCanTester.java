package com.bigJavaExercises.Chapter4Exercises;

public class SodaCanTester {
    public static void main(String[] args) {
        SodaCan sodaCan = new SodaCan(20,20);
        System.out.println(sodaCan.getSurfaceArea());
        System.out.println(sodaCan.getVolume());
    }
}

class SodaCan {
    private int height;
    private int radius;

    public SodaCan(int sodaHeight, int sodaRadius) {
        height = sodaHeight;
        radius = sodaRadius;
    }
    public double getVolume() {
        double volume = Math.PI * radius * radius * height;
        return volume;
    }
    public double getSurfaceArea() {
        double area = 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
        return area;
    }
}
