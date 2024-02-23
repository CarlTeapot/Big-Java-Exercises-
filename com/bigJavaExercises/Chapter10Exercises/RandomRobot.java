package com.bigJavaExercises.Chapter10Exercises;

import java.util.Random;

public class RandomRobot extends Robot {
    private String[][] maze;
    private String robot;
    private final int ROWS = 9;
    private final int COLUMNS = 9;
    private boolean done;
    private Random direction;
    public RandomRobot() {
        direction = new Random();
        done = false;
        robot = "^";
        maze = new String[ROWS][COLUMNS];
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                maze[i][j] = "*";
            }
        }
        maze[1][1] = robot;
        maze[1][2] = " ";
        maze[1][3] = " ";
        maze[1][4] = " ";
        maze[1][5] = " ";
        maze[1][7] = " ";
        maze[2][1] = " ";
        maze[2][7] = " ";
        maze[3][1] = " ";
        maze[3][3] = " ";
        maze[3][5] = " ";
        maze[3][6] = " ";
        maze[4][1] = " ";
        maze[4][3] = " ";
        maze[4][7] = " ";
        maze[5][1] = " ";
        maze[5][2] = " ";
        maze[5][3] = " ";
        maze[5][5] = " ";
        maze[5][6] = " ";
        maze[5][7] = " ";
        maze[6][3] = " ";
        maze[6][5] = " ";
        maze[6][7] = " ";
        maze[7][1] = " ";
        maze[7][2] = " ";
        maze[7][3] = " ";
        maze[7][4] = " ";
        maze[7][5] = " ";
        maze[7][7] = " ";
        maze[8][5] = " ";
    }
    public String toString() {
        String r = "";
        for (int i = 0; i < ROWS; i++) {
            r = r + "|";
            for (int j = 0; j < COLUMNS; j++)
                r = r + maze[i][j];
            r = r + "|\n";
        }
        return r;
    }
    public void move() {
        int moveDirection = 0;
        String r = "";
        String previousPosition = ">";
            for (int i = 1; i < ROWS - 1; i++) {
                String zaza = "";
                for (int j = 1; j < COLUMNS - 1; j++) {
                    moveDirection = direction.nextInt(4);
                    if (maze[i][j].equals(robot)) {

                        if (!maze[i][j - 1].equals("*") && !maze[i][j - 1].equals(robot))  {
                            maze[i][j - 1] = robot;
                        }
                       if (!maze[i][j + 1].equals("*") && !maze[i][j + 1].equals(robot)) {
                            maze[i][j + 1] = robot;

                        }
                        if (!maze[i + 1][j].equals("*") && !maze[i+1][j].equals(robot)) {
                            maze[i + 1][j] = robot;
                        }
                       if (!maze[i - 1][j].equals("*") && !maze[i - 1][j].equals(robot)) {
                            maze[i + 1][j] = robot;
                        }
                    }
                }
            }

    }
}
