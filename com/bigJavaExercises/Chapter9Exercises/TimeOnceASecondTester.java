package com.bigJavaExercises.Chapter9Exercises;

import java.util.Timer;

public class TimeOnceASecondTester {
    public static void main(String[] args) {
            Timer timer = new Timer();
            timer.schedule(new TimeOnceASecond(), 2000, 2000);
    }
}

