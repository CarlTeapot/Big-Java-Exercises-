package com.bigJavaExercises.Chapter7Exercises;

import java.util.Scanner;

public class MagicSquareTester {
    public static void main(String[] args) {
        MagicSquares magicSquares = new MagicSquares();
        Scanner in = new Scanner(System.in);
        boolean done = false;
        while (!done) {
            System.out.print(magicSquares.toString());
            System.out.print("Row for The number (-1 to exit): ");
            int row = in.nextInt();
            if (row < 0 || row > magicSquares.length)
                done = true;
            else {
                System.out.print("Column for The player: ");
                int column = in.nextInt();
                if (column < 0 || column > magicSquares.length)
                    done = true;
                else {
                    System.out.println("Now enter The number");
                    int number = in.nextInt();
                    magicSquares.add(row, column, number);
                }
                System.out.println(magicSquares.isMagic());
            }
            for (int i = 0; i < magicSquares.length; i++) {
                for (int j = 0; j < magicSquares.length; j++) {
                    if (magicSquares.squares[i][j] == 0)
                        done = true;
                }
            }
        }
    }
}
