package com.bigJavaExercises.Chapter2Exercises;


import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.*;

public class FourRectanglePrinter {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(300, 400);
        frame.setTitle("Yochag zura");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bruh otkutxedi = new bruh();
        frame.add(otkutxedi);
        frame.setVisible(true);
    }
}

class bruh extends JComponent {
    public  void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.RED);
        Rectangle rectangle = new Rectangle(0,0,20,40);
        g2.draw(rectangle);
        rectangle.translate(20,0);
        g2.draw(rectangle);
        rectangle.translate(0,40);
        g2.draw(rectangle);
        rectangle.translate(-20,0);
        g2.draw(rectangle);
    }
}
