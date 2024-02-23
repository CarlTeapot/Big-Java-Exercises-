package com.bigJavaExercises.Chapter13Exercises;

public class SentenceTester {
    public static void main(String[] args) {
        String zura = "akgiogj";
        Sentence sentence = new Sentence("ra davashave ra yle var ra davashave");
        System.out.println(sentence.getText());
        System.out.println(sentence.isSubstring("yle", "ra davashave ra yle var ra davashave"));
        System.out.println(sentence.indexOf("zura adeishvili", "shvili"));
    }
}
