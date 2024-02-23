package com.bigJavaExercises.Chapter9Exercises;

import java.awt.Rectangle;
/**
 Objects of this class measure rectangles by area.
 */
public class RectangleMeasurer implements Measurer
{
    public double measure(Object anObject)
    {
        Rectangle aRectangle = (Rectangle) anObject;
        double perimeter = (aRectangle.getWidth() + aRectangle.getHeight()) * 2;
        return perimeter;
    }
}