package com.bigJavaExercises.Chapter2Exercises;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Faceviewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(700, 400);
        frame.setTitle("Yochag zura");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello world");
        ImageIcon img = new ImageIcon("Nana.png");
        label.setIcon(img);
        label.setOpaque(true);
        label.setBackground(Color.PINK);
        label.setBounds(400,80,120,120);
        frame.getContentPane().add(label);
        FaceComponent component = new FaceComponent();
        frame.add(component);
        frame.setVisible(true);

    }
}
class FaceComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLACK);
        Ellipse2D ellipse = new Ellipse2D.Double(100, 100, 200, 200);
        g2.draw(ellipse);
        Ellipse2D ellipse2 = new Ellipse2D.Double(140, 150, 30, 30);
        g2.draw(ellipse2);
        Ellipse2D ellipse3 = new Ellipse2D.Double(230, 150, 30, 30);
        g2.draw(ellipse3);
        Line2D.Double line2 = new Line2D.Double(150, 260, 250, 260);
        g2.draw(line2);



    }

}
