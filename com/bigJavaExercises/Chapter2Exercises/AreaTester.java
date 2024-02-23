package com.bigJavaExercises.Chapter2Exercises;

import java.awt.*;

public class AreaTester {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(2,3,15,30);
        double a = box.getWidth();
        double b = box.getHeight();
        long c = Math.round(a) * Math.round(b);
        System.out.println(c);

    }



}
