package com.bigJavaExercises.Chapter8Exercises;
import javax.swing.*;


public class RandomShapeViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        final int FRAME_WIDTH = 900;
        final int FRAME_HEIGHT = 1600;
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("RandomShapeViewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RandomShapesComponent component = new RandomShapesComponent();
        frame.add(component);
        frame.setVisible(true);

    }
}
