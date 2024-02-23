package com.bigJavaExercises.Chapter3Exercises;

class Carconstructor  {
    private double fuel;
    private double fuelEfficiency;
    private double drive;

    public Carconstructor(double efficiency) {
        fuel = 0;
        fuelEfficiency = efficiency;
        drive = 0;
    }
    public void getGasInTank(double gas) {
        fuel = fuel + gas;
    }
    public void drive(double distance) {
        drive = drive + distance;
        fuel = fuel - (distance/fuelEfficiency);
    }



    public double getGas() {
        return fuel;
    }

}

public class CarTester {
    public static void main(String[] args) {
    Carconstructor car = new Carconstructor(50);
    car.getGasInTank(15);
    car.drive(150);
    car.getGas();
        System.out.println(car.getGas());
    }
}
