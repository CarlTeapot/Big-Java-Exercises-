package com.bigJavaExercises.Chapter8Exercises;

public class VendingMachineTester {
    public static void main(String[] args) {
        Snack snack = new Snack("Coca cola", 2);
        Snack snack2 = new Snack("Pepsi", 3);
        Snack snack3 = new Snack("Chips", 4);
        Snack snack4 = new Snack("Fries", 5);
        Snack snack5 = new Snack("mawoni", 6);
        Snack[] snacks = {snack, snack2, snack3, snack4, snack5};
        VendingMachine machine = new VendingMachine(snacks);

        machine.buySnack();
    }
}
