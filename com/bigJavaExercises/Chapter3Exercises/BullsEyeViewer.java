package com.bigJavaExercises.Chapter3Exercises;



import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class BullsEyeViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(300, 400);
        frame.setTitle("Yochag zura");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BullsEyeComponent component = new BullsEyeComponent();
        frame.add(component);
        frame.setVisible(true);

    }
}

class BullsEyeComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLACK);
        Ellipse2D.Double ellipse = new Ellipse2D.Double(100,100,80,80);
        g2.fill(ellipse);
        g2.draw(ellipse);
        g2.setColor(Color.WHITE);
        Ellipse2D.Double ellipse2 = new Ellipse2D.Double(110,110,60,60);
        g2.fill(ellipse2);
        g2.draw(ellipse2);
        g2.setColor(Color.BLACK);
        Ellipse2D.Double ellipse3 = new Ellipse2D.Double(120,120,40,40);
        g2.fill(ellipse3);
        g2.draw(ellipse3);
        g2.setColor(Color.WHITE);
        Ellipse2D.Double ellipse4 = new Ellipse2D.Double(130,130,20,20);
        g2.fill(ellipse4);
        g2.draw(ellipse4);
        g2.setColor(Color.WHITE);
        Ellipse2D.Double ellipse5 = new Ellipse2D.Double(140,140,10,10);
        g2.fill(ellipse5);
        g2.draw(ellipse5);

    }
}
