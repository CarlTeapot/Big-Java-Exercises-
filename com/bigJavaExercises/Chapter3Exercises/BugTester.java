package com.bigJavaExercises.Chapter3Exercises;

class Bug {
    private int position;
    public Bug (int initialPosition) {
        this.position = initialPosition;
    }
    public int move() {
        position = position + 1;
        return position;
    }
    public int turn() {
        position = position - 1;
        return position;
    }
}
public class BugTester {
    public static void main(String[] args) {
        Bug bugsy = new Bug(10);
        System.out.println("His position after moving is: " + bugsy.move());
        System.out.println("His position after turning is: " + bugsy.turn());
    }
}
