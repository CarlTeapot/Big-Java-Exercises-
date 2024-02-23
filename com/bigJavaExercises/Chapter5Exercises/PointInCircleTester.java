package com.bigJavaExercises.Chapter5Exercises;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.util.Scanner;

public class PointInCircleTester {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(300, 400);
        frame.setTitle("Yochag zura");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PointInCircle component = new PointInCircle();
        frame.add(component);
        frame.setVisible(true);
    }
}

class PointInCircle extends JComponent {
    Scanner scanner = new Scanner(System.in);

    private Point2D.Double point;
    private Ellipse2D.Double ellipse;

    private Graphics2D g2;
    private double xPoint;
    private double yPoint;
    private double xEllipse;
    private double yEllipse;
    private double width;
    private double height;

    public PointInCircle() {
        point = new Point2D.Double(xPoint,yPoint);

        System.out.print("Enter the x coordinate of the point: ");
        xPoint = scanner.nextDouble();
        System.out.print("Enter the y coordinate of the point: ");
        yPoint = scanner.nextDouble();

        ellipse = new Ellipse2D.Double(xEllipse,yEllipse,200,200);
        System.out.print("Enter the x coordinate of the Ellipse: ");
        xPoint = scanner.nextDouble();
        System.out.print("Enter the y coordinate of the Ellipse: ");
        yPoint = scanner.nextDouble();
        System.out.print("Enter the width of the Ellipse: ");
        width = scanner.nextDouble();
        System.out.print("Enter the height of the Ellipse: ");
        height = scanner.nextDouble();

        g2.draw(ellipse);
        g2.draw ((Shape) point);

    }
    public void isInside() {
        if ( xPoint > xEllipse && xPoint < xEllipse + width && yPoint > yEllipse && yPoint < yEllipse + height) {
           g2.setColor(Color.GREEN);

        }
        g2.setColor(Color.RED);
    }
}