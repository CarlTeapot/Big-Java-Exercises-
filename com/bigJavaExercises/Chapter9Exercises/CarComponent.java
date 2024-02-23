package com.bigJavaExercises.Chapter9Exercises;

import java.awt.*;
import javax.swing.JComponent;


/**
 * Draws two car objects. *
 * @author LevelSix
 * @version May 12, 2008
 */

public class CarComponent extends JComponent {

    public Car car1;
    public Car car2;

    public CarComponent() {
        car1 = new Car(100, 200);
        car2 = new Car(200, 400);

    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.RED);
        car1.draw(g2);
        car2.draw(g2);

    }
    public void moveBy(int dx, int dy) {
        car1.translate(dx, dy);
        int backward = dx * (-1);
        repaint();
        car2.translate(backward, dy);
        repaint();
    }
}