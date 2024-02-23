package com.bigJavaExercises.Chapter8Exercises;

public class GeometryTester {
    public static void main(String[] args) {
        System.out.println(Geometry.sphereVolume(10));
        System.out.println(Geometry.sphereSurface(10));
        System.out.println(Geometry.cylinderVolume(10,5));
        System.out.println(Geometry.cylinderSurface(10,5));
        System.out.println(Geometry.coneVolume(10,5));
        System.out.println(Geometry.coneSurface(10,5));

    }
}
