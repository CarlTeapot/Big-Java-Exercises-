package com.bigJavaExercises.Chapter9Exercises;

public interface Game {
    void set(int rows, int columns, String player);
    String toString();
    boolean isOccupied(int row, int column);
    String check1();
    String check2();
    String check3();
    String play();
    void aiMove();
    String getWinner();
}
