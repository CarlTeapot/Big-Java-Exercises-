package com.bigJavaExercises.Chapter8Exercises;

public class Numeric {
    public Numeric() {

    }

    public static double intPower(double x, int n) {
        int limit = 10;
        double xn = Math.pow(x,n);
        if (n < 0) {
            xn = 1 / Math.pow(x, -1 * n);
        }
        if (n > 0) {
            for (int even = 0; even < limit; even = even + 2) {
             if (n == even) {
                 xn = Math.pow(Math.pow(x,n/2), 2);
             }
            }
            for (int odd = 1; odd < limit; odd = odd + 2) {
                if (n == odd) {
                    xn = Math.pow(x,n - 1);
                }
            }

        }
        return xn;
    }
}
