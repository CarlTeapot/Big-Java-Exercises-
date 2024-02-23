package com.bigJavaExercises.Chapter9Exercises;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerListener implements ActionListener {
    RectangleComponent component;
    public TimerListener(RectangleComponent component) {
        this.component = component;
    }
    public void actionPerformed(ActionEvent event) {
        component.moveTo(1,0);
    }
}