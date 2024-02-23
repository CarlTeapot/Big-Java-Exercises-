package com.bigJavaExercises.Chapter12Exercises.VendingMachine;

public class VendingMachineTester {
    public static void main(String[] args) {
        Products products = new Products();
        products.addProducts(new Product(3, "Coca cola"));
        products.addProducts(new Product(4, "Pepsi"));
        products.addProducts(new Product(5, "Bepis"));
        products.addProducts(new Product(7, "Pica"));
        products.addProducts(new Product(8, "Wyali"));
        products.addProducts(new Product(9, "Yava"));
        products.addProducts(new Product(11, "Chai"));
        products.addProducts(new Product(12, "kapuchino"));
        products.addProducts(new Product(3, "katleti"));
        products.addProducts(new Product(5, "ostri"));
        products.addProducts(new Product(2, "xashi"));
        products.addProducts(new Product(15, "yvarabia"));
        products.addProducts(new Product(3.5, "lobiani"));


        VendingMachine vendingMachine = new VendingMachine(products, 100);
        vendingMachine.chooseProduct();
    }
}
