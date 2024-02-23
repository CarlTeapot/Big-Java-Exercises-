package com.bigJavaExercises.Chapter9Exercises;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.*;

/**
 * This program displays a RectangleComponent.
 */
public class RectangleComponentViewer {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;

    public static void main(String[] args) {
        final RectangleComponent component = new RectangleComponent();
// Add mouse press listener

        MouseListener listener = new MousePressListener(component);

        class TimerListener implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                component.moveTo(1,0);
            }
        }
        
        JFrame frame = new JFrame();
        
        

        frame.add(component);
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}