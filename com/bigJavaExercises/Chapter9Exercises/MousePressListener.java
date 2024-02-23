package com.bigJavaExercises.Chapter9Exercises;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MousePressListener implements MouseListener {
    RectangleComponent component;

    public MousePressListener(RectangleComponent component) {
        this.component = component;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        int x = e.getXOnScreen();
        int y = e.getYOnScreen();

        component.moveTo(x, y);
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}