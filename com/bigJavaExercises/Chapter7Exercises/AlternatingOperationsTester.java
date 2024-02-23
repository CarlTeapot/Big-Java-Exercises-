package com.bigJavaExercises.Chapter7Exercises;

public class AlternatingOperationsTester {
    public static void main(String[] args) {
        double[] xd = {1,2,3,4,5,6,7,8,9,10};
        AlternatingOperations operations = new AlternatingOperations(xd);
        
        System.out.println(operations.compute());
    }
}
