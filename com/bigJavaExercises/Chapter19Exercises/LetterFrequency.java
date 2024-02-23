package com.bigJavaExercises.Chapter19Exercises;

import java.util.TreeMap;

public class LetterFrequency {

    private char letter;
    public char[] alphabet;
    public double[] frequency;
    private String text;

    public LetterFrequency() {
        alphabet =  new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        frequency = new double[alphabet.length];
    }
    public void calculateFrequencies(String aText) {
        text = aText;
        double frequent;
        for (int i = 0; i < alphabet.length; i++) {
            frequent = 0;
            for (int j = 0; j < aText.length(); j++) {
                if (aText.charAt(j) == alphabet[i])
                    frequent++;
            }
            double fraction = (frequent / alphabet.length) * 100;
            frequency[i] = Math.round(fraction);
        }
    }
    public String printFrequencies() {
        String kuku = "";
        for (int i = 0; i < alphabet.length; i++) {
            kuku = kuku + "[Letter: " + alphabet[i] + "; Frequency: " + frequency[i] + "]" + "\n";
        }
        return kuku;
    }
}
