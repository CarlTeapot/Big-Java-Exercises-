package com.bigJavaExercises.Chapter8Exercises;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

public class Geometry {
    public Geometry() {
    }

    public static double sphereVolume(double radius) {
        double volume;
        volume = (4 * Math.PI * (radius * radius * radius)) / 3;
        return volume;
    }
    public static double sphereSurface(double radius) {
        double surface;
        surface = 4 * Math.PI * (radius * radius);
        return surface;
    }
    public static double cylinderVolume(double radius, double height) {
        double volume;
        volume = Math.PI * (radius * radius) * height;
        return volume;
    }
    public static double cylinderSurface(double radius, double height) {
        double surface;
        surface = (2 * Math.PI * radius * height) + (2 * Math.PI * (radius * radius));
        return surface;
    }
    public static double coneVolume(double radius, double height) {
        double volume;
        volume = Math.PI * (radius * radius) * (height / 3);
        return volume;
    }
    public static double coneSurface(double radius, double height) {
        double surface;
        surface = Math.PI * radius * (radius + (Math.sqrt((height * height) + (radius * radius))));
        return surface;
    }
    public static double perimeter(Ellipse2D.Double ellipse) {
        double perimeter = 2 * Math.PI * Math.sqrt((Math.pow(ellipse.height, 2) + Math.pow(ellipse.width, 2)) / 2);
        return perimeter;
    }
    public static double area(Ellipse2D.Double ellipse) {
        double area = Math.PI * ellipse.height * ellipse.width;
        return area;
    }
    public static boolean isInside(Point2D.Double p, Ellipse2D.Double e) {
        boolean isInside;
        if ((p.x > e.x && p.x < e.x + e.width) && (p.y > e.y && p.y < e.y + e.height))
            isInside = true;
        else
            isInside = false;
        return isInside;
    }
    public static boolean isOnBoundary(Point2D.Double p, Ellipse2D.Double e) {
        boolean isBoundary;
        if ((p.x == e.x || p.x == e.x + e.width) && (p.y == e.y || p.y == e.y + e.height))
            isBoundary = true;
        else
            isBoundary = false;
        return isBoundary;
    }
}


