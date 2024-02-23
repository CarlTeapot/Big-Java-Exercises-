package com.bigJavaExercises.Chapter5Exercises;

public class QuadraticEquationTester {
    public static void main(String[] args) {
        QuadraticEquation equation = new QuadraticEquation(1,-4,3);
        System.out.println(equation.getSolutions());

    }
}

class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    double root1, root2;
    String roots = Double.toString(root1) + Double.toString(root2);
    public QuadraticEquation(double a,double b,double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        root1 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
        root2 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
    }
    public String  getSolutions() {
        if ((b * b) - (4 * a * c) < 0 )
            return "Error";
        return  "First root is: " + Double.toString(root1) + "\nSecond root is: " + Double.toString(root2);
    }

    }


