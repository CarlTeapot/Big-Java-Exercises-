package com.bigJavaExercises.Chapter15Exercises;

public class ListTester {
    public static void main(String[] args) {
        LinkedListGood list = new LinkedListGood();
        list.addFirst("Zura");
        list.add("nana");
        list.add("kaka");
        System.out.println(list.toString());
        list.removeFirst();
        System.out.println(list.toString());
    }
}