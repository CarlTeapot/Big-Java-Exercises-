package com.bigJavaExercises.Chapter19Exercises;

public class MonoalphabeticCipherTester {
    public static void main(String[] args) {
        MonoalphabeticCipher cipher = new MonoalphabeticCipher();
        System.out.println(cipher.encrypt("mogesalmebit megobrebo damexmaret yuyuebi mshia", "yrzo"));
        System.out.println(cipher.decrypt("nltvhywnvrxg nvtlrivrl oynvcnyivg bfbfvrx nmhsxy"));
    }
}
