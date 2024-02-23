package com.bigJavaExercises.Chapter9Exercises;

import java.awt.*;

public class AnimationPanel implements MoveableShape{
    private int x;
    private int y;
    private int width;

    public AnimationPanel(int x, int y, int width) {
        this.x = x;
        this.y = y;
        this.width = width;
    }
    @Override
    public void draw(Graphics2D g) {
        Rectangle rectangle = new Rectangle(x, y, width, 30);
        Car car = new Car(x,y);
        g.draw(rectangle);
        g.draw(car);

    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }
}
