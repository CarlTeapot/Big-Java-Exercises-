package com.bigJavaExercises.Chapter9Exercises;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClickListener implements ActionListener {
    private int number = 0;
    private boolean done = false;

    public void actionPerformed(ActionEvent event) {
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        number++;
        System.out.println(formatter.format(date) + "is the time when i was clicked "+ number + "th time");
    }
}
