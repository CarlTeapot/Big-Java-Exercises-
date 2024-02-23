package com.bigJavaExercises.Chapter4Exercises;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumbers {
    public static void main(String[] args) {
        BigInteger n = new BigInteger("1000000");
        BigInteger r = n.multiply(n);
        System.out.println(r);

        BigDecimal d = new BigDecimal("4.35");
        BigDecimal e = new BigDecimal("100");
        BigDecimal f = d.multiply(e);
        System.out.println(f);
    }
}
