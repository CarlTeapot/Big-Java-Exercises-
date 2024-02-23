package com.bigJavaExercises.Chapter2Exercises;

import javax.swing.*;
import java.awt.*;
public class IntersectionPrinter {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(300, 400);
        frame.setTitle("Yochag zura");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Tornike otkutxedi = new Tornike();
        frame.add(otkutxedi);
        frame.setVisible(true);
    }
}
class Tornike extends JComponent {
    public  void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.RED);
        Rectangle r1 = new Rectangle(0, 0, 50, 150);
        g2.draw(r1);
        Rectangle r2 = new Rectangle(25, 75, 150, 50);
        g2.draw(r2);
        Rectangle r3 = r1.intersection(r2);
        System.out.println(r3);
    }
}
