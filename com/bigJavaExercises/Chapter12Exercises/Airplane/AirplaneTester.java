package com.bigJavaExercises.Chapter12Exercises.Airplane;

public class AirplaneTester {
    public static void main(String[] args) {
        Airplane airplane = new Airplane(5000);
        System.out.println(airplane.airplaneInterface());
        airplane.addFirst(2,3);

    }
}
