package com.bigJavaExercises.Chapter2Exercises;

import javax.swing.*;
import java.awt.*;

public class Nameviewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(600, 700);
        frame.setTitle("Yochag zura");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        NameComponent component = new NameComponent();
        frame.add(component);
        frame.setVisible(true);

    }
}
class NameComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLUE);
        Rectangle box = new Rectangle(5, 10, 300, 400);
        g2.draw(box);
        g2.fill(box);
        g2.setColor(Color.RED);
        g2.drawString("Mate Arevadze", 150, 200);

    }
}