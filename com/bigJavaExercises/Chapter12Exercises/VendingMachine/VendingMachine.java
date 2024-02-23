package com.bigJavaExercises.Chapter12Exercises.VendingMachine;

import java.util.Scanner;

public class VendingMachine {
    private double balance;
    private final int slots = 12;
    private Product product;
    private Products products;
    private String list;
    private String vendingInterface;
    private int command;
    private Scanner scanner;
    private boolean done;
    public VendingMachine(Products theProducts, double aBalance) {
        done = false;
        balance = aBalance;
        products = theProducts;
        vendingInterface = "";
        command = 0;
        scanner = new Scanner(System.in);
    }

    public String machineInterface() {
        vendingInterface = "[Vending machine]" + "             " +
                " [Balance ~ " +  balance + "]\n" + products.toString();

        return vendingInterface;

    }

    public void chooseProduct() {
        System.out.println(machineInterface());
        System.out.println("[Choose the Product to buy]");
        System.out.println("[press - 1 to exit the program]");

        while (!done) {
            command = scanner.nextInt();
            if (command > products.products().size() || command < -1) {
                System.out.println("[The number you enter is not in the list]");
            } else if (command == -1)
                done = true;
            else {
                Product prod = products.products().get(command);
                balance = balance - prod.getPrice();
                System.out.println("[" + prod.getName() + " Was bought]");
                products.products().remove(prod);
                System.out.println(products.toString());
                System.out.println("[Remaining balance: " + balance + "]" );
            }
        }
    }
}
