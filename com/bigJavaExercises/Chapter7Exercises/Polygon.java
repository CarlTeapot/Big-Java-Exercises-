package com.bigJavaExercises.Chapter7Exercises;

public class Polygon {
    private double x;
    private double y;
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;
    private double x4;
    private double y4;

    private double line1;
    private double line2;
    private double line3;
    private double line4;
    private double line5;
    private String[] lines = {Double.toString(line1),Double.toString(line2),Double.toString(line3),Double.toString(line4),Double.toString(line5)};

    public Polygon(double x,double y,double x1, double y1, double x2, double y2, double x3, double y3,double x4, double y4) {
        this.x = x;
        this.y = y;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;

        line1 = Math.sqrt(Math.pow(x1 - x , 2) + Math.pow(y1 - y, 2));
        line2 = Math.sqrt(Math.pow(x2 - x1 , 2) + Math.pow(y1 - y2, 2));
        line3 = Math.sqrt(Math.pow(x2 - x3 , 2) + Math.pow(y2 - y3, 2));
        line4 = Math.sqrt(Math.pow(x3 - x4 , 2) + Math.pow(y3 - y4, 2));
        line5 = Math.sqrt(Math.pow(x4 - x , 2) + Math.pow(y - y4, 2));;
    }

    public String getLines() {
        return "The length of the lines are: " + line1 + ", " + line2 + ", " + line3 + ", " + line4 + ", " + line5;
    }

    public double getPerimeter() {
        double perimeter = line1 + line2 + line3 + line4 + line5;

        return perimeter;
    }
    public double getArea() {
        double area =  0.5 * (x * y1 + x1 * y2 + x2 * y3 + x3 * y4 + x4 * y - y * x1 - y1 * x2 - y2 * x3 - y3 * x4 - y4 * x);
        return area;
    }
}
