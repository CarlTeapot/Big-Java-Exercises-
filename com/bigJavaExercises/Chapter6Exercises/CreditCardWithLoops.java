package com.bigJavaExercises.Chapter6Exercises;

public class CreditCardWithLoops  {

    private String creditCardNumber;
    private boolean valid;
    private int checkDigit;
    int totalSum;

    /**
     * Constructor for objects of class CreditCard
     */
    public CreditCardWithLoops(String pCreditCardNumber) {
        creditCardNumber = pCreditCardNumber;
        checkDigit = Integer.parseInt(pCreditCardNumber.substring(creditCardNumber.length() - 1));
        int dig7 = Integer.parseInt(pCreditCardNumber.substring(7,8));
        int dig6 = Integer.parseInt(pCreditCardNumber.substring(6,7));
        int dig5 = Integer.parseInt(pCreditCardNumber.substring(5,6));
        int dig4 = Integer.parseInt(pCreditCardNumber.substring(3,4));
        int dig3 = Integer.parseInt(pCreditCardNumber.substring(2,3));
        int dig2 = Integer.parseInt(pCreditCardNumber.substring(1,2));
        int dig1 = Integer.parseInt(pCreditCardNumber.substring(0,1));
        int sumOfDigits = checkDigit + dig2 + dig4 + dig6;


        String string7 = Integer.toString(dig7);
        int doubledDig7a = Integer.parseInt(string7.substring(0));
        int doubledDig7b = 0;
        if (dig7 * 2 >= 10) {
            doubledDig7a = Integer.parseInt(string7.substring(0));
            doubledDig7b = 0;
        }

        String string5 = Integer.toString(dig5);
        int doubledDig5a = Integer.parseInt(string7.substring(0));
        int doubledDig5b = 0;
        if (dig5 * 2 >= 10) {
            doubledDig5a = Integer.parseInt(string5.substring(0));
            doubledDig5b = 0;
        }

        String string3 = Integer.toString(dig3);
        int doubledDig3a = Integer.parseInt(string3.substring(0));
        int doubledDig3b = 0;
        if (dig3 * 2 >= 10) {
            doubledDig3a = Integer.parseInt(string3.substring(0));
            doubledDig3b = 0;
        }

        String string1 = Integer.toString(dig1);
        int doubledDig1a = Integer.parseInt(string1.substring(0));
        int doubledDig1b = 0;
        if (dig1 * 2 >= 10) {
            doubledDig1a = Integer.parseInt(string1.substring(0));
            doubledDig1b = 0;
        }


        int doubleDigits = doubledDig1a + doubledDig1b + doubledDig3a + doubledDig3b + doubledDig5a + doubledDig5b + doubledDig7a + doubledDig7b;

        totalSum = sumOfDigits + doubleDigits;

        if (totalSum % 10 == 0) {
            valid = true;
        }
        else {
            valid = false;
        }

    }

    public void makeItValid() {
        while (totalSum % 10 != 0) {
            checkDigit--;
            if (totalSum % 10 == 0) {
                break;
            }
        }
    }


    public boolean isItValid() {
        return valid;
    }
}