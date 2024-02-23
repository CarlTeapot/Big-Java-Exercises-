package com.bigJavaExercises.Chapter2Exercises;

public class HollePrinter {
    public static void main(String[] args) {
        String str = "Hello, World";
        str = str.replace("e","x");
        str = str.replace("o","e");
        str = str.replace("x","o");
        System.out.print(str);
    }
}
