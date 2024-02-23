package com.bigJavaExercises.Chapter4Exercises;

public class SquareTester {
    public static void main(String[] args) {
        Square square = new Square(20);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        System.out.println(square.getDiagonal());
    }
}

class Square {
    private int width;

    public Square(int squareWidth) {
        width = squareWidth;
    }
    public int getArea() {
        int area = width * width;
        return  area;
    }

    public int getPerimeter() {
        int perimeter = 4 * width;
        return perimeter;
    }
    public double getDiagonal() {
        double diagonal = Math.sqrt(width * width + width * width);
        return diagonal;
    }


}
