package com.bigJavaExercises.Chapter16Exercises;

import com.sun.source.tree.Tree;

import java.io.*;
import java.util.*;

public class SameWordSet {

    private Map<Integer, HashSet<String>> map;
    private File file;
    private HashSet<String> stringSet;
    public SameWordSet(File aFile) {
        file = aFile;
        stringSet = new HashSet<>();
        map = new HashMap<>();
    }

    public void addWords() throws IOException {
        Scanner scanner = new Scanner(file);
        String line;
        while (scanner.hasNext()) {
            String word = scanner.nextLine();
            int h = word.hashCode();
            stringSet.add(word);
            map.put(h, stringSet);

            if (!map.containsKey(h)) {
                HashSet<String> newSet = new HashSet<>();
                newSet.add(word);
                map.put(h, newSet);
            } else {
                map.get(h).add(word);
            }
        }
    }
    public String getMap() {
        return map.toString();
    }
}
