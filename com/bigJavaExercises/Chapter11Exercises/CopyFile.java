package com.bigJavaExercises.Chapter11Exercises;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

public class CopyFile {
    private File from;
    private File to;
    private String add;
    private Scanner scanner;
    public CopyFile(File copyFrom, File copyTo) throws FileNotFoundException {
        from = copyFrom;
        to = copyTo;
        scanner = new Scanner(from);
        add = from.toString();
    }

    public void copy() {
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(to, true)));
            out.write(from.toString());
            out.close();
        } catch (IOException e) {
        }
    }
    }
