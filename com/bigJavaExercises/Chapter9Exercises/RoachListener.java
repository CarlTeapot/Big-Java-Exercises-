package com.bigJavaExercises.Chapter9Exercises;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RoachListener implements ActionListener {

    private int number;
    @Override
    public void actionPerformed(ActionEvent e) {
        number++;
        System.out.println("the amount of Roachs: " + number);
    }
}
