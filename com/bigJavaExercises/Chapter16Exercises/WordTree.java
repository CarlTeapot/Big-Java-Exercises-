package com.bigJavaExercises.Chapter16Exercises;


import java.text.BreakIterator;
import java.text.StringCharacterIterator;
import java.util.TreeSet;

public class WordTree {

    private String text;
    private StringCharacterIterator iterator;
    TreeSet<String> words = new TreeSet<>();
    public WordTree(String aText) {
        text = aText;
        iterator = new StringCharacterIterator(text);
    }
    public void divide() {
        String zaza = text;

        BreakIterator breakIterator = BreakIterator.getWordInstance();
        breakIterator.setText(text);
        int lastIndex = breakIterator.first();
        while (BreakIterator.DONE != lastIndex) {
            int firstIndex = lastIndex;
            lastIndex = breakIterator.next();
            if (lastIndex != BreakIterator.DONE && Character.isLetterOrDigit(text.charAt(firstIndex))) {
                words.add(text.substring(firstIndex, lastIndex));
            }
        }

    }
    public String getText() {
        return text;
    }
    public TreeSet<String> getWords() {
        return words;
    }
    public int getSize() {
        return words.size();
    }
}
