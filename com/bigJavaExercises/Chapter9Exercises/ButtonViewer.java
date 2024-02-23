package com.bigJavaExercises.Chapter9Exercises;

import java.awt.event.ActionListener;
import javax.swing.*;

public class ButtonViewer {
    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HEIGHT = 60;

    public static void main(String[] args) {
        int number = 0;
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JButton button = new JButton("Click me!");
        JButton button2 = new JButton("Clicke me too!");

        panel.add(button);
        panel2.add(button2);

        panel.setSize(300,400);
        panel2.setSize(500,300);

        frame.add(panel);
        frame.add(panel2);

        ActionListener listener =  new ClickListener();
        ActionListener listener2 = new ClickListener();

        button.addActionListener(listener);
        button2.addActionListener(listener2);

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
