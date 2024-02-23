package com.bigJavaExercises.Chapter2Exercises;

import java.awt.*;

public class PerimeterTester {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,10,15,20);
        double a = rectangle.getWidth();
        double b = rectangle.getHeight();
        long c = Math.round(a + b) * 2;
        System.out.println(c);
    }

}
