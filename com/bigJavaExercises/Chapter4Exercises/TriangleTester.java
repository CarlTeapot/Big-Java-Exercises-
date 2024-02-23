package com.bigJavaExercises.Chapter4Exercises;

import java.util.Scanner;

public class TriangleTester {
    
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle.getAllLengths());
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());

    }
}

class Triangle {
    Scanner scanner = new Scanner(System.in);
    private int firstX;
    private int firstY;
    private int secondX;
    private int secondY;
    private int thirdX;
    private int thirdY;

    // (int firstXCoordinate, int firstYCoordinate, int secondXCoordinate, int secondYCoordinate, int thirdXCoordinate, int thirdYCoordinate
    public Triangle() {
        System.out.print("Enter the x position of the first point: ");
        firstX = scanner.nextInt();
        System.out.print("Enter the y position of the first point: ");
        firstY = scanner.nextInt();
        System.out.print("Enter the x position of the second point: ");
        secondX = scanner.nextInt();
        System.out.print("Enter the y position of the second point: ");
        secondY = scanner.nextInt();
        System.out.print("Enter the x position of the third point: ");
        thirdX = scanner.nextInt();
        System.out.print("Enter the y position of the third point: ");
        thirdY = scanner.nextInt();
    }
    public double getFirstSide() {
        int side1 = secondY - firstY;
        int side2 = secondX - firstX;
        if (firstX == secondX)
            return Math.abs(side1);
        else if (firstY == secondY)
            return Math.abs(side2);
        return Math.sqrt(side1 * side1 + side2 * side2);
    }
    public double getSecondSide() {
        int side1 = thirdY - secondY;
        int side2 = thirdX - secondX;
        if (thirdX == secondX)
            return Math.abs(side1);
        else if (thirdY == secondY)
            return Math.abs(side2);
        return Math.sqrt(side1 * side1 + side2 * side2);
    }
    public double getThirdSide() {
        int side1 = thirdY - firstY;
        int side2 = thirdX - firstX;
        if (firstX == thirdX)
            return Math.abs(side1);
        else if (firstY == thirdY)
            return Math.abs(side2);
        return Math.sqrt(side1 * side1 + side2 * side2);
    }
    public String getAllLengths() {
        return "The length of the first side is: " + getFirstSide() + "\n The length of the second side is: " +
                getSecondSide() + "\n The length of the third side is: " + getThirdSide();
    }
    public String getPerimeter() {
        double perimeter = getFirstSide() + getSecondSide() + getThirdSide();
        return "The perimeter of the triangle is: " + Double.toString(perimeter);
    }
    public double getArea() {
        //used Heron's formula to find the area of the triangle
        double s = (getFirstSide() + getSecondSide() + getThirdSide()) / 2;
        double area = Math.sqrt(s * (s - getFirstSide()) * (s - getSecondSide()) * (s - getThirdSide()));
        return area;
    }
    public double getAngleA() {
        double a2 = Math.pow(getFirstSide(), 2);
        double b2 = Math.pow(getSecondSide(), 2);
        double c2 = Math.pow(getThirdSide(), 2);
        double cosA = (((a2 + c2) - b2) / (2 * getFirstSide() * getThirdSide()));
        double angleA = Math.acos(cosA);
        angleA = Math.toDegrees(angleA);
        return angleA;
    }
    public double getAngleB() {
        double a2 = Math.pow(getFirstSide(), 2);
        double b2 = Math.pow(getSecondSide(), 2);
        double c2 = Math.pow(getThirdSide(), 2);
        double cosB = (((a2 + b2) - c2) / (2 * getFirstSide() * getSecondSide()));
        double angleB = Math.acos(cosB);
        angleB = Math.toDegrees(angleB);
        return angleB;
    }
    public double getAngleC() {
        double a2 = Math.pow(getFirstSide(), 2);
        double b2 = Math.pow(getSecondSide(), 2);
        double c2 = Math.pow(getThirdSide(), 2);
        double cosC = (((b2 + c2) - a2) / (2 * getSecondSide() * getThirdSide()));
        double angleC = Math.acos(cosC);
        angleC = Math.toDegrees(angleC);
        return angleC;
    }
}