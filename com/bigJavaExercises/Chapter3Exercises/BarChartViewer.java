package com.bigJavaExercises.Chapter3Exercises;

import javax.swing.*;
import java.awt.*;

public class BarChartViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300,400);
        frame.setTitle("Hello World");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BarChartComponent component = new BarChartComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}

class BarChartComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle box = new Rectangle(30,30,70,30);
        Rectangle box2 = new Rectangle(100,30,70,30);
        Rectangle box3 = new Rectangle(30,60,70,30);
        Rectangle box4 = new Rectangle(100,60,70,30);
        Rectangle box5 = new Rectangle(30,90,70,30);
        Rectangle box6 = new Rectangle(100,90,70,30);
        Rectangle box7 = new Rectangle(30,120,70,30);
        Rectangle box8 = new Rectangle(100,120,70,30);
        Rectangle box9 = new Rectangle(30,150,70,30);
        Rectangle box10 = new Rectangle(100,150,70,30);

        g2.drawString("Bridge Name",30,45);
        g2.drawString("Longest span (ft)",100,45);
        g2.drawString("Golden Gate",30,75);
        g2.drawString("4200",100,75);
        g2.drawString("Brooklyn",30,105);
        g2.drawString("1595",100,105);
        g2.drawString("Delaware Memorial",30,135);
        g2.drawString("2150",100,135);
        g2.drawString("Mackinac",30,165);
        g2.drawString("3800",100,165);



        g2.draw(box);
        g2.draw(box2);
        g2.draw(box3);
        g2.draw(box4);
        g2.draw(box5);
        g2.draw(box6);
        g2.draw(box7);
        g2.draw(box8);
        g2.draw(box9);
        g2.draw(box10);


    }
}