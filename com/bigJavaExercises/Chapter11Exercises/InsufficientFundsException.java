package com.bigJavaExercises.Chapter11Exercises;

public class InsufficientFundsException extends IllegalArgumentException {
    public InsufficientFundsException() {}
    public InsufficientFundsException(String message) {
        super(message);
    }
}