package com.bigJavaExercises.Chapter8Exercises;

public class Snack {
    public int snackPrice;
    public String snackName;
    public String description;

    public Snack(String name, int price) {
        this.snackName = name;
        this.snackPrice = price;
        description = snackName + " - " + snackPrice + " Dollars";
    }
    public String getName() {
        return snackName;
    }

    public int getPrice() {
        return snackPrice;
    }
}
