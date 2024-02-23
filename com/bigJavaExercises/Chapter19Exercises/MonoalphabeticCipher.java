package com.bigJavaExercises.Chapter19Exercises;

import java.util.Arrays;

public class MonoalphabeticCipher {
    private String keyWord;
    private String text;
    private StringBuilder encryptedText;
    private StringBuilder decryptedText;
    private char[] normalChar;
    private char[] encryptChar;
    public MonoalphabeticCipher() {
        normalChar = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        encryptChar = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        encryptedText = new StringBuilder();
        decryptedText = new StringBuilder();
}

    public String encrypt(String aText, String aKeyword) {
        text = aText;
        keyWord = aKeyword;
        reverse(encryptChar);
        for (int i = 0; i < aKeyword.length(); i++) {
            for (int j = 0; j < encryptChar.length; j++) {
                if (aKeyword.charAt(i) == encryptChar[j])

                    swap(i,j, encryptChar);
            }
        }
        for (int i = 0; i < aText.length(); i++) {
            for (int j = 0; j < normalChar.length; j++) {
                if (aText.charAt(i) == normalChar[j]) {
                    encryptedText.append(encryptChar[j]);
                }
                if (aText.charAt(i) == ' ')
                    encryptedText.append(' ');

            }
        }
        return Arrays.toString(encryptChar) + "\n" + Arrays.toString(normalChar)
                + "\n" + aText  + "\n" + encryptedText + "\n" + aText.length()  + "\n" + encryptedText.length();
    }
    public String decrypt(String aText) {
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < normalChar.length; j++) {
                if (aText.charAt(i) == encryptChar[j]) {
                    decryptedText.append(normalChar[j]);

                }
                if (aText.charAt(i) == ' ')
                    decryptedText.append(' ');
            }
        }
        return  Arrays.toString(encryptChar) + "\n" + Arrays.toString(normalChar)
                + "\n" + aText  + "\n" + decryptedText.toString() + "\n" + aText.length()  + "\n" + decryptedText.length();
    }
    private void swap(int pos1, int pos2, char[] array) {
        char  temp = array[pos2];
        array[pos2] = array[pos1];
        array[pos1] = temp;
    }

    private void reverse(char[] array) {
        int len = array.length;

        if (len == 0)
            return;

        for (int i = 0; i < (len / 2); i++) {
            char l = array[i];
            array[i] = array[len - i - 1];
            array[len - i - 1] = l;
        }

    }
}
