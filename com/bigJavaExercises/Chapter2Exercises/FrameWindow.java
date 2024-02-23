package com.bigJavaExercises.Chapter2Exercises;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import javax.swing.JComponent;

public class FrameWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(300, 400);
        frame.setTitle("Yochag zura");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        RectangleComponent component = new RectangleComponent();
        frame.add(component);
        frame.setVisible(true);


    }
}
     class RectangleComponent extends JComponent {
        public void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(Color.RED);
            Rectangle box = new Rectangle(5, 10, 20, 30);
            g2.draw(box);
            box.translate(15,25);
            g2.draw(box);
            Ellipse2D.Double ellipse = new Ellipse2D.Double(35,60,35,40);
            g2.draw(ellipse);
            // XAZI
            Point2D.Double from = new Point2D.Double(5,20);
            Point2D.Double to = new Point2D.Double(75,20);
            Line2D.Double line = new Line2D.Double(from, to);
            g2.draw(line);
            Line2D.Double line2 = new Line2D.Double(5,10,75,10);
            g2.draw(line2);
            g2.drawString("Daijvi",65,100);
            g2.fill(ellipse);
        }
    }





