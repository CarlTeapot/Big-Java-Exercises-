package com.bigJavaExercises.Chapter11Exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IdentifierSet {
    public static void main(String[] args) {
        System.out.println("Enter the path to your JAVA source file: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String pathToFile = null;
        try {
            pathToFile = br.readLine();
            File f = new File(pathToFile);
            Scanner s = new Scanner(f);
            s.useDelimiter("[^A-Za-z0-9_]+");
            while (s.hasNext()) {
                String identifier = s.next();
                System.out.println(identifier);
            }
        } catch (IOException ioe) {
            System.out.println("Unable to locate file. Program will exit.\n"
                    + ioe.toString());
            System.exit(0);
        }
    }
}
