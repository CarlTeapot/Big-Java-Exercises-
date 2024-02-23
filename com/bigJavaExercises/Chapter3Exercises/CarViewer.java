package com.bigJavaExercises.Chapter3Exercises;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class CarViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

         frame.setSize(300, 400);
         frame.setTitle("Two cars");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         CarComponent component = new CarComponent();
         frame.add(component);

         frame.setVisible(true);
    }
}
class CarComponent extends JComponent {

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Car car1 = new Car(100,100,100,Color.RED);
        car1.draw(g2);
        Car car2 = new Car(85,40, 120, Color.BLUE);
        car2.draw(g2);
        car2.changeColor(Color.RED);
    }
}
class Car {
    private int xLeft;
    private int yTop;
    private int width;
    private Color paint;
    public Car(int x, int y, int width, Color color) {
        this.xLeft = x;
        this.yTop = y;
        this.width = width;
        this.paint = color;

    }
    public void draw(Graphics2D g2) {
        g2.setColor(paint);
        Rectangle body = new Rectangle(xLeft, yTop + width/6, width, width/6);
        Ellipse2D.Double frontTire = new Ellipse2D.Double(xLeft + width/6, yTop + width/3, width/6, width/6);
        Ellipse2D.Double rearTire = new Ellipse2D.Double(xLeft + (width/6) *4, yTop + width/3, width/6, width/6);

        // The bottom of the front windshield
        Point2D.Double r1 = new Point2D.Double(xLeft + width/6, yTop + width/6);
        // The front of the roof
        Point2D.Double r2 = new Point2D.Double(xLeft + width/3, yTop);
        // The rear of the roof
        Point2D.Double r3 = new Point2D.Double(xLeft + width/6 *4, yTop);
        // The bottom of the rear windshield
        Point2D.Double r4 = new Point2D.Double(xLeft + width/6 * 5, yTop + width/6);

        Line2D.Double frontWindshield = new Line2D.Double(r1, r2);
        Line2D.Double roofTop = new Line2D.Double(r2, r3);
        Line2D.Double rearWindshield = new Line2D.Double(r3, r4);

        g2.draw(body);
        g2.draw(frontTire);
        g2.draw(rearTire);
        g2.draw(frontWindshield);
        g2.draw(roofTop);
        g2.draw(rearWindshield);
    }
    public void changeColor(Color g) {
        this.paint = g;
    }
}