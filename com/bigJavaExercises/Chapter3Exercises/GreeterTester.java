package com.bigJavaExercises.Chapter3Exercises;

public class GreeterTester {
    public static void main(String[] args) {
        Greeter greeter = new Greeter("Zaza");

        System.out.println(greeter.getName());
    }
}

class Greeter {
    private String name;
    public Greeter(String name) {
        this.name = name;
    }
    public String getName() {
        return "Hello " + name;
    }
}