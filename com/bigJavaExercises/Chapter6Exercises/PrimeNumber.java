package com.bigJavaExercises.Chapter6Exercises;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int primeNumberWithin;

        System.out.print("Enter the number you want to get factors of: ");
        number = scanner.nextInt();
        boolean done = false;

     for(int i=2;i<number;i++)
        {
            primeNumberWithin = 0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                    primeNumberWithin = 1;
            }
            if(primeNumberWithin == 0)
                System.out.println(i);
      }
    }
}
