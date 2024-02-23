package com.bigJavaExercises.Chapter7Exercises;

public class PolygonTester {
    public static void main(String[] args) {
        Polygon polygon = new Polygon(1,1,2,2,3,1,2.5,0,1.5,0);
        System.out.println(polygon.getLines());
        System.out.println(polygon.getPerimeter());
        System.out.println(polygon.getArea());
    }
}
