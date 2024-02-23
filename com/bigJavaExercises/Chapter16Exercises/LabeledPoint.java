package com.bigJavaExercises.Chapter16Exercises;

import java.awt.*;
import java.util.Random;

public class LabeledPoint implements Comparable<LabeledPoint>{
    private int xCord;
    private int yCord;
    private String label;
    private int hashCode;
    private Point point;
    public LabeledPoint(int x, int y, String aLabel) {
        xCord = x;
        yCord = y;
        label = aLabel;
        hashCode = x * x * x * y * y * y * aLabel.length() * aLabel.length();
        point = new Point(x,y);
    }
    public boolean equals(LabeledPoint aPoint) {
        if (xCord == aPoint.xCord && yCord == aPoint.yCord && label.equals(aPoint.label))
            return true;
        else
            return false;
    }
    public int hashCode() {
        return hashCode;
    }
    public int getXCord() {
        return xCord;
    }

    public int getYCord() {
        return yCord;
    }

    public String getLabel() {
        return label;
    }
    @Override
    public int compareTo(LabeledPoint o) {
        if (xCord == o.xCord) {
            if (yCord == o.yCord) {
                if (label.length() == o.label.length()) {
                    if (hashCode == o.hashCode) {
                        Random random = new Random();
                        int xd = random.nextInt(2);
                        if (xd == 0)
                            return 1;
                        if (xd == 1)
                            return -1;
                    }
                     else if (hashCode > o.hashCode)
                        return 1;
                    else
                        return -1;
                }
                else if (label.length() > o.label.length()) {
                    return 1;
                }
                else
                    return -1;

            }
            else if (yCord > o.yCord)
                return 1;
            else
                return -1;
        }
        else if (xCord > o.xCord)
            return 1;

        return -1;
    }
}
