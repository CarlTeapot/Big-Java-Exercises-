package com.bigJavaExercises.Chapter9Exercises;

import javax.swing.*;
import java.awt.event.ActionListener;

public class RoachPopulationViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("Add Roaches");

        JPanel panel = new JPanel();
        panel.add(button);
        frame.add(panel);

        ActionListener listener = new RoachListener();
        button.addActionListener(listener);
        frame.setSize(300, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
