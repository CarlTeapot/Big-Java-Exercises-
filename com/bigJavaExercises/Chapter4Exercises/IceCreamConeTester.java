package com.bigJavaExercises.Chapter4Exercises;

public class IceCreamConeTester {
    public static void main(String[] args) {
        IceCreamCone iceCreamCone = new IceCreamCone(20,20);
        System.out.println("Volume of the cone is: " + iceCreamCone.getVolume());
        System.out.println("Surface area of the cone is: " + iceCreamCone.getSurfaceArea());

    }
}

class IceCreamCone {
    private double height;
    private double radius;

    public IceCreamCone(double coneHeight, double coneRadius) {
        height = coneHeight;
        radius = coneRadius;
    }
    public double getSurfaceArea() {
    double surfaceArea = Math.PI * radius * (radius + Math.sqrt((height * height + radius * radius)));
    return surfaceArea;
    }
    public double getVolume() {
        double volume = Math.PI * radius * radius * (height/3);
        return volume;
    }
}
