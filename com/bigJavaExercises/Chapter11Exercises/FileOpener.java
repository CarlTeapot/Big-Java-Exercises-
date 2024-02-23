package com.bigJavaExercises.Chapter11Exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileOpener {
    private Scanner inputFile;
    private File file;
    private  int characterCount;
    public FileOpener(File thisFile) throws FileNotFoundException {
        file = thisFile;
         inputFile = new Scanner(file);
    }
    public String getCharacterCount() {
        String line = null;
        int count = 0;
        for (int i = 0; i < 10; i++) {
            while (inputFile.hasNextLine()) {
                line = inputFile.next();
                count += line.length();
                if (line.equals(" ") || line.equals(Integer.toString(i)))
                    count -= 1;
            }
        }
        return "Number of characters: " + count + " characters";
    }
    public String getLineCount() {
        int count = 0;
        while (inputFile.hasNextLine()) {
            count++;
        }
        return "Number of Lines: " + count + " lines";
    }
    public String getWordCount() {
        int count = 0;
        inputFile.useDelimiter("[^A-Za-z]+");
        while (inputFile.hasNext()) {
            count++;
        }
        return "Number of Words: " + count + " words";
    }
    public void checkExist() {

        if(!file.exists()){
            System.out.println("The file does not exist.");
        }
        else
            System.out.println("The file exists");
    }
}
