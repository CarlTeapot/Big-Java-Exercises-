package com.bigJavaExercises.Chapter8Exercises;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.Random;


public class RandomShapesComponent extends JComponent {

    Random ran = new Random();
    private int x = ran.nextInt(100);
    private int y = ran.nextInt(100);
    private int width = ran.nextInt(100);
    private int height = ran.nextInt(100);

    public RandomShapesComponent() {

    }

        public void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;

            g2.setColor(Color.red);
            for (int i = 1; i <= 10; i++) {
                g2.draw(randomShape());
            }
    }
    public Shape randomShape() {
        int zaza = ran.nextInt(3);
        if (zaza == 0)
            return new Rectangle2D.Double(ran.nextInt(100), ran.nextInt(100), ran.nextInt(100), ran.nextInt(100));
        if (zaza == 1)
            return new Line2D.Double(ran.nextInt(100), ran.nextInt(100), ran.nextInt(100), ran.nextInt(100));
        if (zaza == 2)
            return new Ellipse2D.Double(ran.nextInt(100), ran.nextInt(100), ran.nextInt(100), ran.nextInt(100));
        return null;
    }
}
