package com.bigJavaExercises.Chapter12Exercises.VendingMachine;

public class Product {
    private double price;
    private String name;
    private int position;

    public Product(double aPrice, String aName) {
        price = aPrice;
        name = aName;
    }
    public double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
}
