package com.bigJavaExercises.Chapter9Exercises;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

public class CarMover {
    private static final int FRAME_WIDTH = 900;
    private static final int FRAME_HEIGHT = 1600;

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("Two Animated Cars");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final CarComponent component = new CarComponent();
        frame.add(component);

        frame.setVisible(true);

        class TimerListener implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                component.moveBy(1, 0);
            }
        }

        ActionListener listener = new TimerListener();

        final int DELAY = 100; // Milliseconds between timer ticks
        Timer t = new Timer(DELAY, listener);
        t.start();
    }

}