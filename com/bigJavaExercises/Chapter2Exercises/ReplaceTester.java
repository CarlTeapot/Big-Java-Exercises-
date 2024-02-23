package com.bigJavaExercises.Chapter2Exercises;

public class ReplaceTester {
    public static void main(String[] args) {
        String str = "Mississippi";
        String mystr = str.replace('i', '!');
        String str2 = mystr.replace('s','$');
        System.out.println(str2);
    }
}
