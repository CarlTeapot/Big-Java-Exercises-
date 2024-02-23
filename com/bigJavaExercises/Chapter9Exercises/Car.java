package com.bigJavaExercises.Chapter9Exercises;

import java.awt.*;
import java.awt.geom.*;

public class Car implements Shape {
    private int aLeft;
    private int bTop;
    /*
     * Set draw instructions for car objects.
     *
     * @author LevelSix
     * @version May 12, 2008
     */
    /**
     * Constructs a car with given top-left corner.
     *
     * @param a the x-coordinate of the top-left corner
     * @param b the y coordinate of the top-left corner
     */
    public Car(int a, int b) {
        aLeft = a;
        bTop = b;
    }

    /**
     * Draws the car.
     *
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2) {
        Rectangle body = new Rectangle(aLeft, bTop + 10, 60, 10);

        Ellipse2D.Double frontTire = new Ellipse2D.Double(aLeft + 10, bTop + 20, 10, 10);

        Ellipse2D.Double rearTire = new Ellipse2D.Double(aLeft + 40, bTop + 20, 10, 10);

        Point2D.Double r1 = new Point2D.Double(aLeft + 10, bTop + 10);

        Point2D.Double r2 = new Point2D.Double(aLeft + 20, bTop);

        Point2D.Double r3 = new Point2D.Double(aLeft + 40, bTop);

        Point2D.Double r4 = new Point2D.Double(aLeft + 50, bTop + 10);

        Line2D.Double frontW = new Line2D.Double(r1, r2);

        Line2D.Double roofTop = new Line2D.Double(r2, r3);

        Line2D.Double rearW = new Line2D.Double(r3, r4);

        g2.draw(body);
        g2.draw(frontTire);
        g2.draw(rearTire);
        g2.draw(frontW);
        g2.draw(rearW);
        g2.draw(roofTop);
    }

    public void translate(int x, int y) {
        aLeft += x;
        bTop += y;

    }

    @Override
    public Rectangle getBounds() {
        return null;
    }

    @Override
    public Rectangle2D getBounds2D() {
        return null;
    }

    @Override
    public boolean contains(double x, double y) {
        return false;
    }

    @Override
    public boolean contains(Point2D p) {
        return false;
    }

    @Override
    public boolean intersects(double x, double y, double w, double h) {
        return false;
    }

    @Override
    public boolean intersects(Rectangle2D r) {
        return false;
    }

    @Override
    public boolean contains(double x, double y, double w, double h) {
        return false;
    }

    @Override
    public boolean contains(Rectangle2D r) {
        return false;
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at) {
        return null;
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at, double flatness) {
        return null;
    }
}


