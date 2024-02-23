package com.bigJavaExercises.Chapter3Exercises;



import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;


public class HouseViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(300, 400);
        frame.setTitle("Yochag zura");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        HouseComponent component = new HouseComponent();
        frame.add(component);
        frame.setVisible(true);
    }
}
class House {
    private int xLeft;
    private int yTop;
    private int width;


    public House(int x, int y, int aWidth) {
        xLeft = x;
        yTop = y;
        width = aWidth;
    }
    public void draw(Graphics2D g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.RED);

        Rectangle box = new Rectangle(xLeft, yTop, width, width);
        g2.draw(box);
        Rectangle box2 = new Rectangle(xLeft + (width/10) * 3,yTop + (width/10) * 4 ,width/4,width - (width/10) * 4);
        g2.draw(box2);
        Rectangle box3 = new Rectangle(xLeft + (width/10) * 7,yTop + (width/5),width/5,width - (width/10) * 6);
        g2.draw(box3);
        Line2D.Double line = new Line2D.Double(xLeft,yTop,width + width/2,width/2);
        g2.draw(line);
        Line2D.Double line2 = new Line2D.Double(xLeft * 2,yTop,width + width/2,width/2);
        g2.draw(line2);
    }
}
class HouseComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        House house = new House(100,100,100);
        House house2 = new House(50,50,50);
        house.draw(g2);
        house2.draw(g2);
    }
}

