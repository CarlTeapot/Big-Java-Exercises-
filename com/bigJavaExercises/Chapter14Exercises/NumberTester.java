package com.bigJavaExercises.Chapter14Exercises;

import java.util.ArrayList;
import java.util.Collections;

public class NumberTester {
    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(new Number(13748893, "Zura"));
        numbers.add(new Number(13743813, "Zaza"));
        numbers.add(new Number(13748953, "Maka"));
        numbers.add(new Number(13748676, "Nunua"));
        numbers.add(new Number(13741595, "Tornike"));
        numbers.add(new Number(13747345, "Mamuka"));
        numbers.add(new Number(13741962, "Gogi"));
        numbers.add(new Number(13747896, "Kukua"));


        System.out.println(numbers.toString());
        Collections.sort(numbers);
        System.out.println(numbers.toString());

    }
}
