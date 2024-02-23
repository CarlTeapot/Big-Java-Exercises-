package com.bigJavaExercises.Chapter8Exercises;

public class ZipEncoder {

    public ZipEncoder() {

    }

    public static String encode(int zipcode) {

        String code = Integer.toString(zipcode);
        String barCode = " ";
        for (int i = 0; i < code.length() - 1; i++) {
            if (code.substring(i,i+1).equalsIgnoreCase("1"))
                barCode = barCode + ":::||";
            if (code.substring(i,i+1).equalsIgnoreCase("2"))
                barCode = barCode + "::|:|";
            if (code.substring(i,i+1).equalsIgnoreCase("3"))
                barCode = barCode + "::|||";
            if (code.substring(i,i+1).equalsIgnoreCase("4"))
                barCode = barCode + ":|:::";
            if (code.substring(i,i+1).equalsIgnoreCase("5"))
                barCode = barCode + ":|:||";

            if (code.substring(i,i+1).equalsIgnoreCase("6"))
                barCode = barCode + ":||::";
            if (code.substring(i,i+1).equalsIgnoreCase("7"))
                barCode = barCode + "|::::";

            if (code.substring(i,i+1).equalsIgnoreCase("8"))
                barCode = barCode + "|::||";

            if (code.substring(i,i+1).equalsIgnoreCase("9"))
                barCode = barCode + "|:|::";

            if (code.substring(i,i+1).equalsIgnoreCase("0"))
                barCode = barCode + "||:::";
        }
        return barCode;
    }
}
