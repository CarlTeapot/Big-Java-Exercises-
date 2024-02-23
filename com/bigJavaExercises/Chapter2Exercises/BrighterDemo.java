package com.bigJavaExercises.Chapter2Exercises;

import java.awt.*;

public class BrighterDemo {
    public static void main(String[] args) {
        Color mycolor = new Color(50,100,150);
        Color brighterColor = mycolor.brighter();
        System.out.print("Red - ");
        System.out.println(brighterColor.getRed());
        System.out.print("Green - ");
        System.out.println(brighterColor.getGreen());
        System.out.print("Blue - ");
        System.out.println(brighterColor.getBlue());
    }
}
