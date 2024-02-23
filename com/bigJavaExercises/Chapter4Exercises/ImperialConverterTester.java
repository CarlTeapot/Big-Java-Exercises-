package com.bigJavaExercises.Chapter4Exercises;

public class ImperialConverterTester {
    public static void main(String[] args) {
    ImperialConverter imperial = new ImperialConverter();
    double x = imperial.convertToImperial(50);
    double y = imperial.convertToMetric(50);

        System.out.println(x);
        System.out.println(y);
    }
}

class ImperialConverter {
    private final double MILE_TO_KM = 1.609;

    public ImperialConverter() {
    }
    public double convertToMetric(double fromMeasurement) {

        return fromMeasurement / MILE_TO_KM;
    }

    public double convertToImperial(double toMeasurement) {
        return  MILE_TO_KM * toMeasurement;
    }
}