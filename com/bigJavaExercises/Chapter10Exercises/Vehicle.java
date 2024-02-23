package com.bigJavaExercises.Chapter10Exercises;

import javax.swing.*;
import java.awt.*;

public abstract class Vehicle extends JComponent {
    private int xleft;
    private int ytop;

    public Vehicle() {
        xleft = 0;
        ytop = 0;
    }
    
    public abstract void draw(Graphics2D g2);

    public void setLocation(int x, int y) {
        xleft = x;
        ytop = y;
    }

    public int getX() {
        return xleft;
    }

    public int getY() {
        return ytop;
    }

    public abstract int getHeight();

    public abstract int getWidth();
}
