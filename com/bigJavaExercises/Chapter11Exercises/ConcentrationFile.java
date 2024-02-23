package com.bigJavaExercises.Chapter11Exercises;

import java.io.*;

public class ConcentrationFile {
    private File concentrationFile;

    public ConcentrationFile(File file) {
        concentrationFile = file;
    }

    public void addFile(File file) {
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(concentrationFile, true)));
            out.write(file.toString());
            out.close();
        } catch (IOException e) {
        }
    }

}
