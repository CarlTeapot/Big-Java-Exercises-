package com.bigJavaExercises.Chapter13Exercises;

public class SubstringGenerator {
    private String word;
    private String substring;
    public SubstringGenerator(String aWord) {
        word = aWord;
        substring = "";
    }
    public String allSubstrings(){
        for (int i = 1; i < word.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (i > j) {
                    substring = substring + "[" + word.substring(j,i) + "]\n";
                }
            }
        }
        return  substring;
    }
    public String allSubsets(){
        for (int i = 0; i < word.length()-1; i++) {
            for (int j = 0; j < word.length(); j++) {
                if (i > j) {
                    substring = substring + "[" + word.substring(j,i) + "]\n";
                }
                if (j > i) {
                    substring = substring + "[" + word.substring(i,j) + "]\n";
                }
            }
        }
        return  substring;
    }
}
