package com.bigJavaExercises.Chapter4Exercises;

import java.util.Scanner;

public class QuadraticEquationTester {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
     double x1 = quadraticEquation.getSolution1();
     double x2 = quadraticEquation.getSolution2();
     System.out.println(x1);
     System.out.println(x2);

    }
}
class QuadraticEquation {
    Scanner scanner = new Scanner(System.in);
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
        System.out.print("a: ");
        this.a = scanner.nextDouble();
        System.out.print("b: ");
        this.b = scanner.nextDouble();
        System.out.print("c: ");
        this.c = scanner.nextDouble();
    }
    public double getSolution1() {
        double x = ((-1 * b) + Math.sqrt(b * b) - (4 * a * c)) / (2 * a);
        return x;
    }
    public double getSolution2() {
        double x = ((-1 * b) - Math.sqrt(b * b) - (4 * a * c)) / (2 * a);
        return x;
    }
}