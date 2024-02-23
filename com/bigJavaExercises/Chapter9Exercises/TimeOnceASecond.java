package com.bigJavaExercises.Chapter9Exercises;

import java.util.TimerTask;

public class TimeOnceASecond extends TimerTask{
    public void run() {
        System.out.println("Printing statement after every 2 seconds");
    }
}

