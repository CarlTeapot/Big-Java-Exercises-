package com.bigJavaExercises.Chapter5Exercises;

import java.util.Scanner;

public class LexicographicSortingTester {
    public static void main(String[] args) {
    LexicographicSorting sorter = new LexicographicSorting();
        System.out.println(sorter.sort());
    }
}


class LexicographicSorting {
    Scanner scanner = new Scanner(System.in);
    String string1, string2, string3, first, second, third;

    public LexicographicSorting() {
        System.out.print("Enter the first string: ");
        string1 = scanner.next();
        System.out.print("Enter the second string: ");
        string2 = scanner.next();
        System.out.print("Enter the third string: ");
        string3 = scanner.next();
    }

    public String getString1() {

        if (string1.compareTo(string2) < 0 && string1.compareTo(string3) < 0)
            //first = string1;
            return string1;
        else if (string2.compareTo(string1) < 0 && string2.compareTo(string3) < 0)
            //first = string2;
            return string2;
        //else if (string3.compareTo(string1) < 0 && string3.compareTo(string2) < 0)
          //  first = string3;
        return string3;

    }

    public String getString2() {

        if (string1.compareTo(string2) < 0 && string1.compareTo(string3) > 0)
            //second = string1;
            return string1;
        else if (string2.compareTo(string1) < 0 && string2.compareTo(string3) > 0)
            //second = string2;
            return string2;
        //else if (string3.compareTo(string1) < 0 && string3.compareTo(string2) > 0)
            //second = string3;
        return string3;
    }

    public String getString3() {
        if (string1.compareTo(string2) > 0 && string1.compareTo(string3) > 0)
            //third = string1;
            return string1;
        else if (string2.compareTo(string1) > 0 && string2.compareTo(string3) > 0)
            //third = string2;
            return string2;
        //else if (string3.compareTo(string1) > 0 && string3.compareTo(string2) > 0)
            //third = string3;
        return string3;
    }
    public String sort() {
        return "The first word is: " + getString1() + "\nThe second word is: " + getString2() + "\nThe third word is: " + getString3();
    }

}

