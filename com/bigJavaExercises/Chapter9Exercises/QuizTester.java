package com.bigJavaExercises.Chapter9Exercises;

public class QuizTester {
    public static void main(String[] args) {

        DataSetSimple data = new DataSetSimple();

        data.add(new Quiz(4));
        data.add(new Quiz(15));
        data.add(new Quiz(12));
        data.add(new Quiz(13));
        data.add(new Quiz(9));
        data.add(new Quiz(8));
        data.add(new Quiz(13));


        System.out.println(data.getAverage());
        System.out.println(data.getMaximum());
    }
}
