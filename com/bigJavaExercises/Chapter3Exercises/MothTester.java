package com.bigJavaExercises.Chapter3Exercises;

class Moth {
    private double   position;

    public Moth(double initialPosition) {
        position = initialPosition;
    }
    public void moveToLight(double lightPosition) {
        position = (lightPosition + position) / 2;
    }
    public double getPosition() {
        return position;
    }
}

public class MothTester {
    public static void main(String[] args) {
        Moth moth = new Moth(10);
        moth.moveToLight(20);
        moth.moveToLight(30);
        System.out.println("His Position after moving towards the light is: " + moth.getPosition());

    }
}
