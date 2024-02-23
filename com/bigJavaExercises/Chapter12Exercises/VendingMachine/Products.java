package com.bigJavaExercises.Chapter12Exercises.VendingMachine;

import java.util.ArrayList;

public class Products {
    private ArrayList<Product> products;

    public Products() {
        products = new ArrayList<>();
    }

    public void addProducts(Product product) {
        products.add(product);
    }

    public ArrayList<Product> products() {
        return products;
    }
    public String toString() {
        String list = "";

        for (int i = 0; i < products.size(); i++) {
            list = list + "[Product Name: " + products.get(i).getName() +
                    ";  Product price: " + products.get(i).getPrice() + "]  ~ " + i + "\n";

        }
        String zura = list;
        list = "";
        return zura;
    }

}
