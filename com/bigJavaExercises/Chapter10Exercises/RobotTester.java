package com.bigJavaExercises.Chapter10Exercises;

public class RobotTester {
    public static void main(String[] args) {
        String mamuka = "$";
        RandomRobot robot = new RandomRobot();
        System.out.println(robot.toString());
        for (int i = 0; i < 9; i++) {
            robot.move();
            System.out.println(robot.toString());
        }
    }
}
