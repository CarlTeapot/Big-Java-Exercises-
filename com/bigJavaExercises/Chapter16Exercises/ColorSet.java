package com.bigJavaExercises.Chapter16Exercises;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class ColorSet {
    private Set<Color> set;

    public ColorSet() {
        set = new HashSet<>();
        set.add(Color.RED);
        set.add(Color.BLUE);
        set.add(Color.ORANGE);
        set.add(Color.PINK);
        set.add(Color.GREEN);
        set.add(Color.BLACK);
        set.add(Color.WHITE);
        set.add(Color.YELLOW);
        set.add(Color.GRAY);
        set.add(Color.CYAN);
    }
    public Color findColor(int red, int green, int blue) {
        for (Color xd : set) {
            if (red == xd.getRed() && green == xd.getGreen() && blue == xd.getBlue()) {
                return xd;
            }
        }
        return null;
    }
}
