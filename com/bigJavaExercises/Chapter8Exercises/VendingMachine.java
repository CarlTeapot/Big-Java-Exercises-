package com.bigJavaExercises.Chapter8Exercises;

import java.util.Scanner;

public class VendingMachine {


    private Snack[] snacks;
    private String name;
    private int amount;
    private String list;
    private boolean done;
    private String order;
    private int orderPrice;

    public VendingMachine(Snack[] snacks) {
        list = "";
        this.snacks = snacks;
        System.out.println("Hello, This is a vending Machine, there are following items in the machine: ");

        for (int i = 0; i < snacks.length; i++) {
            System.out.println(snacks[i].description);
        }
    }

    public void buySnack() {
        System.out.println("Enter the amount of money you have: ");
        Scanner scanner = new Scanner(System.in);
        amount = scanner.nextInt();
        for (int z = 0; z < snacks.length; z++) {
            System.out.println("Enter the snack you want to buy");
            name = scanner.next();
            for (int i = 0; i < snacks.length; i++) {
                if (name.equalsIgnoreCase(snacks[i].getName())) {
                    orderPrice = snacks[i].getPrice();
                    break;
                }
                else {
                    continue;
                }
            }
            if (amount >= orderPrice) {
                System.out.println("you bought the snack, enjoy");
                amount = amount - orderPrice;
                System.out.println("the change is: " + amount);
            } else
                System.out.println("you don't have the enough money");
                break;

        }
    }
}


