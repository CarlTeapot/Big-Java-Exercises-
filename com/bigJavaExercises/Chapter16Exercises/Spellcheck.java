package com.bigJavaExercises.Chapter16Exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Spellcheck {
    public static void main(String[] args) throws FileNotFoundException {
        Set<String> dictionaryWords = readWords("words");
        Set<String> documentWords = readWords("alice30.txt");
// Print all words that are in the document but not the dictionary
        for (String word : documentWords) {
            if (!dictionaryWords.contains(word)) {
                System.out.println(word);
            }
        }
    }

    /**
     * Reads all words from a file.
     *
     * @param filename the name of the file
     * @return a set with all lowercased words in the file. Here, a
     * word is a sequence of upper- and lowercase letters.
     */
    public static Set<String> readWords(String filename) throws FileNotFoundException {
        Set<String> words = new HashSet<String>();
        Scanner in = new Scanner(new File(filename));
// Use any characters other than a-z or A-Z as delimiters
        in.useDelimiter("[^a-zA-Z]+");
        while (in.hasNext()) {
            words.add(in.next().toLowerCase());
        }
        return words;
    }
}
