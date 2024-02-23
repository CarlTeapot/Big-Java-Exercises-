package com.bigJavaExercises.Chapter3Exercises;

import java.text.NumberFormat;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return this.price;
    }

    public double reducePrice(int reduce) {
        price = price - reduce;
        return price;


    }
}
public class ProductPrinter {
    public static void main(String[] args) {
        Product product = new Product("zurabi", 35.90);
        String zaza = product.getName();
        double y = product.getPrice();
        double x = product.reducePrice(50);
        NumberFormat valuta = NumberFormat.getCurrencyInstance();
        String getPriceWithCurrency =  valuta.format(y);
        String getReducedPriceWithCurrency = valuta.format(x);
        System.out.println(zaza);
        System.out.println(getPriceWithCurrency);
        System.out.println(getReducedPriceWithCurrency);

    }
}

