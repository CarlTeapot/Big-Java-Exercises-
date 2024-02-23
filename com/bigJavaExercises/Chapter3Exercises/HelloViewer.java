package com.bigJavaExercises.Chapter3Exercises;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;


public class HelloViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300,400);
        frame.setTitle("Hello World");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Hello component = new Hello();
        frame.add(component);

        frame.setVisible(true);
    }
}
class Hello extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.RED);
        HelloConstructor constructor = new HelloConstructor();
        constructor.h(g2);
        constructor.e(g2);
        constructor.l(g2);
        constructor.o(g2);


    }
}
class HelloConstructor extends JComponent {

    public HelloConstructor() {

    }

    public void h(Graphics2D g2) {

        Line2D.Double hLeftLine = new Line2D.Double(25,35,25,55);
        Line2D.Double hRightLine = new Line2D.Double(35,35,35,55);
        Line2D.Double hMiddleLine = new Line2D.Double(25,45,35,45);

        g2.draw(hLeftLine);
        g2.draw(hRightLine);
        g2.draw(hMiddleLine);
    }
    public void e(Graphics2D g2) {
        Line2D.Double eMainLine = new Line2D.Double(40,35,40,55);
        Line2D.Double eTopLine = new Line2D.Double(40,55,45,55);
        Line2D.Double eMiddleLine = new Line2D.Double(40,45,45,45);
        Line2D.Double eBottomLine = new Line2D.Double(40,35,45,35);
        g2.draw(eMainLine);
        g2.draw(eTopLine);
        g2.draw(eMiddleLine);
        g2.draw(eBottomLine);
    }
    public void l(Graphics2D g2) {
        Line2D.Double lVerticalLine = new Line2D.Double(50,35,50,55);
        Line2D.Double lHorizontalLine = new Line2D.Double(50,55, 55,55);
        Line2D.Double lVerticalLine2 = new Line2D.Double(60,35,60,55);
        Line2D.Double lHorizontalLine2 = new Line2D.Double(60,55,65,55);
        g2.draw(lVerticalLine);
        g2.draw(lHorizontalLine);
        g2.draw(lVerticalLine2);
        g2.draw(lHorizontalLine2);
    }
    public void o(Graphics2D g2) {
        Ellipse2D.Double o = new Ellipse2D.Double(70, 35, 20, 20);
        g2.draw(o);
    }
}