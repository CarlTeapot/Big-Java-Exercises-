package com.bigJavaExercises.Chapter6Exercises;

public class TriangleTester {
    public static void main(String[] args) {
        Triangle traingle = new Triangle(10);
        System.out.println(traingle.toString());
    }
}

class Triangle {

    private int width;

    public Triangle(int aWidth) {
        width = aWidth;
    }

    public String toString() {
        String r = "";
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= i; j++)
                r = r + "[]";
            r = r + "\n";
        }
        return r;
    }
}