package com.bigJavaExercises.Chapter11Exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Find {
    private String text;
    private ArrayList<File> fileList;
    public Find() {
        fileList = new ArrayList<>();
    }
    public void addFile(File file) {
        fileList.add(file);
    }
    public String findWord(String word) throws FileNotFoundException {
        for (int i = 0; i <fileList.size(); i++) {
            Scanner zaza = new Scanner(fileList.get(i));
            while(zaza.hasNextLine()) {
                String line = zaza.nextLine();
                if (line.contains(word))
                    return "the word is in the " + fileList.get(i).getName() + " File";
            }
        }
        return text + " wasn't found in the files";
    }
}
