package com.bigJavaExercises.Chapter3Exercises;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class ItalianFlagViewer {
    public static void main(String[] args) {

                JFrame frame = new JFrame();
                frame.setSize(300, 400);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ItalianFlagComponent component = new ItalianFlagComponent();
                frame.add(component);
                frame.setVisible(true);
    }
}


 class ItalianFlag {
     private int xLeft;
     private int yTop;
     private int width;

     public ItalianFlag(int x, int y, int aWidth) {
         xLeft = x;
         yTop = y;
         width = aWidth;
     }

     public void draw(Graphics2D g2) {
         Rectangle leftRectangle = new Rectangle(xLeft, yTop, width / 3, width * 2 / 3);
         g2.setColor(Color.GREEN);
         g2.fill(leftRectangle);
         g2.draw(leftRectangle);

         Rectangle rightRectangle = new Rectangle(xLeft + 2 * width / 3, yTop, width / 3, width * 2 / 3);
         g2.setColor(Color.RED);
         g2.fill(rightRectangle);
         g2.draw(rightRectangle);
         Line2D.Double topLine = new Line2D.Double(xLeft + width / 3, yTop, xLeft + width * 2 / 3, yTop);
         g2.setColor(Color.BLACK);
         g2.draw(topLine);
         Line2D.Double bottomLine = new Line2D.Double(xLeft + width / 3, yTop + width * 2 / 3, xLeft + width * 2 / 3, yTop + width * 2 / 3);
         g2.draw(bottomLine);



     }
 }

 class ItalianFlagComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        ItalianFlag flag = new ItalianFlag(100, 100, 90);
        flag.draw(g2);
    }
}
