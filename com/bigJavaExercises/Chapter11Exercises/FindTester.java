package com.bigJavaExercises.Chapter11Exercises;

import java.io.File;
import java.io.FileNotFoundException;

public class FindTester {
    public static void main(String[] args) throws FileNotFoundException {
        String damexmaret = "damexmaret";
        Find find = new Find();
        find.addFile(new File("C:\\Users\\Mate\\Desktop\\input.txt"));
        System.out.println(find.findWord("oe"));

    }
}
