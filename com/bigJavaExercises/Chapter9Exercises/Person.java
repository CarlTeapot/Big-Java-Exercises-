package com.bigJavaExercises.Chapter9Exercises;

public class Person implements Measurable{
    private String name;
    private int height;

    public Person(String aName, int aHeight) {
        name = aName;
        height = aHeight;
    }

    @Override
    public int getMeasure() {
        return height;
    }

    @Override
    public double measure(Object anObject) {
        return height;
    }
}
