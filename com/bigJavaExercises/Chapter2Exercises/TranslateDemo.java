package com.bigJavaExercises.Chapter2Exercises;

import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class TranslateDemo
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        Rectangle box = new Rectangle(10,20,30,40);
        System.out.println("");
        System.out.println(box);
        System.out.println("");

        JFrame f= new JFrame();
        f.setBounds(50,50,200,200);
        JOptionPane.showMessageDialog(frame, "Click OK to continue");
        box.translate(0,30);
        System.out.println(box);
        JOptionPane.showMessageDialog(frame,"Click OK to continue");

    }
}