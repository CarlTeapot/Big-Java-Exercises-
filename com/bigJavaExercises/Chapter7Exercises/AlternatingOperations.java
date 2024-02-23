package com.bigJavaExercises.Chapter7Exercises;

public class AlternatingOperations {
    private double result;
    private double[] number;
    private double even;
    private double odd;
    public AlternatingOperations(double[] numbers) {
        number = numbers;
    }
/*
    public double odd() {
        for (odd = 1; odd <= number.length; odd = odd + 2){
            return odd;
        }
        return odd;
    }

    public double even() {
        for (even = 0; even <= number.length; even = even + 2) {
            return even;
        }
        return even;
    }
*/
    public double compute() {
        for (double i : number) {
            for (odd = 1; odd <= number.length; odd = odd + 2) {
                for (even = 0; even <= number.length; even = even + 2) {
                    if (i == odd)
                        result = result - 1;
                    if (i == even)
                        result = result + 1;
                }
            }
        }
        return result;
    }
}
