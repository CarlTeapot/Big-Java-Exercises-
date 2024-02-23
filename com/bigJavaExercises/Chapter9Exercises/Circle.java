package com.bigJavaExercises.Chapter9Exercises;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Circle extends JComponent implements Shape {
    // Member instance field
    private int radius;
    double circumference, area;
    private Ellipse2D.Double sphere;

    public Circle(double x, double y, Color color) {
        sphere = new Ellipse2D.Double(x,y,50,50);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.BLUE); // set circle color to blue
        g2.fill(sphere);
        g2.draw(sphere);

    }

    @Override
    public Rectangle2D getBounds2D() {
        return null;
    }

    @Override
    public boolean contains(double v, double v1) {
        return false;
    }

    @Override
    public boolean contains(Point2D point2D) {
        return false;
    }

    @Override
    public boolean intersects(double v, double v1, double v2, double v3) {
        return false;
    }

    @Override
    public boolean intersects(Rectangle2D rectangle2D) {
        return false;
    }

    @Override
    public boolean contains(double v, double v1, double v2, double v3) {
        return false;
    }

    @Override
    public boolean contains(Rectangle2D rectangle2D) {
        return false;
    }

    @Override
    public PathIterator getPathIterator(AffineTransform affineTransform) {
        return null;
    }

    @Override
    public PathIterator getPathIterator(AffineTransform affineTransform, double v) {
        return null;
    }
}
