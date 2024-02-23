package com.bigJavaExercises.Chapter2Exercises;

import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.*;

public class GrowSquarePrinter {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(300, 400);
        frame.setTitle("Yochag zura");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dzodzge otkutxedi = new dzodzge();
        frame.add(otkutxedi);
        frame.setVisible(true);
    }
}

class dzodzge extends JComponent {
    public  void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.RED);
        Rectangle zaza = new Rectangle(0,0,50,50);
        g2.draw(zaza);
        zaza.grow(50,50);
        g2.draw(zaza);
    }
}
