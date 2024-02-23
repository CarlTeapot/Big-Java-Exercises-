package com.bigJavaExercises.Chapter9Exercises;
import java.util.Random;


public class Die implements Measurable{
    private Random generator;
    private int sides;

    public Die(int s) {
        sides = s;
        generator = new Random();
    }

    public int cast() {
        return 1 + generator.nextInt(sides);
    }

    @Override
    public int getMeasure() {
       return cast();
    }

    @Override
    public double measure(Object anObject) {
        return cast();
    }
}

