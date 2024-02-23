package com.bigJavaExercises.Chapter5Exercises;

public class LineOnPlaneTester {
    public static void main(String[] args) {
        Line line = new Line(4,4,15,15);
        Line line2 = new Line(5,5,13,14);
        System.out.println(line.equals(5));
        System.out.println(line.intersects(line2));
    }
}

class Line {
    private double x1, y1, x2, y2;
    private double yIntercept;
    private boolean slopeDefined;
    private double slope;

    // slope and point
    public Line(double s, double xOne, double yOne) {
        x1 = xOne;
        y1 = yOne;
        slope = s;
    }

    // two points
    public Line(double xOne, double yOne, double xTwo, double yTwo) {
        x1 = xOne;
        x2 = xTwo;
        y1 = yOne;
        y2 = yTwo;
    }

    // slope and y- intercept
    public Line(double s, double y) {
        slope = s;
        yIntercept = y;
    }

    // vertical line, x-intercept
    public Line(double xOne) {
        x1 = xOne;
    }

    // returns true if Line this intersects Line L2, false otherwise
    public boolean intersects(Line L2) {
        if (this.slope != L2.slope)
            slopeDefined = true;
        else
            slopeDefined = false;
        return slopeDefined;
    }

    // returns true if Line this is the same as Line L2, false otherwise
    public boolean equals(Line L2) {
        if (L2.slope == slope && L2.yIntercept == yIntercept)
            return true;
        else
            return false;
    }

}
