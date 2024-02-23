package com.bigJavaExercises.Chapter13Exercises;

public class Sentence {
    private String sentence;

    public Sentence(String aSentence) {
        sentence = aSentence;
    }

    public String getText() {
        return sentence;
    }

    public String reverse() {
        if (sentence.length() > 0) {
            String first = sentence.substring(0, 1);
            String remaining = sentence.substring(1);

            Sentence shorter = new Sentence(remaining);
            shorter.reverse();

            sentence = shorter.sentence + first;
        }
        return sentence;
    }

    public String reverseIteration() {
        String reverse = "";
        for (int i = sentence.length() - 1; i >= 0; i--) {
            reverse = reverse + sentence.charAt(i);
        }
        return reverse;
    }

    public boolean find(String stringToFind, String aSentence) {
        if (stringToFind.length() == 0)
            return false;

        if (stringToFind.equals(aSentence))
            return true;
        else
            return find(stringToFind, aSentence.substring(0, aSentence.length() - 1));

    }

    public boolean isSubstring(final String wordToFind, final String sentence) {
        if ((wordToFind == null) || (sentence == null) || wordToFind.isEmpty()) {
            return false;
        } else if (sentence.startsWith(wordToFind)) {
            return true;
        } else {
            return isSubstring(wordToFind, sentence.substring(1));
        }
    }

    public int indexOf(String sentence, String contains) {
        if (contains.length() > sentence.length()) {
            return -1;
        }
        return indexOfHelper(sentence, contains, 0);
    }

    private int indexOfHelper(String s, String contains, int index) {
        if ((s.length() - contains.length()) < index) {
            return -1;
        }
        if (s.substring(index, index + contains.length()).equals(contains)) {
            return index;
        } else {
            return indexOfHelper(s, contains, index + 1);
        }

    }
}
