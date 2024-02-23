package com.bigJavaExercises.Chapter9Exercises;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;

/**
 This component displays a rectangle that can be moved.
 */
public class RectangleComponent extends JComponent {

    private static final int BOX_X = 100;
    private static final int BOX_Y = 100;
    private static final int BOX_WIDTH = 20;
    private static final int BOX_HEIGHT = 30;
    private Rectangle box;
    public RectangleComponent() {
// The rectangle that the paint method draws
        box = new Rectangle(BOX_X, BOX_Y, BOX_WIDTH, BOX_HEIGHT);
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(box);
    }

    public void moveTo(int x, int y) {
        box.translate(x, y);
        int backward = x * (-1);
        repaint();
    }
}