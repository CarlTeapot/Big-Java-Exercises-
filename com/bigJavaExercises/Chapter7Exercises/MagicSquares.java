package com.bigJavaExercises.Chapter7Exercises;

import java.util.Random;
import java.util.Scanner;

public class MagicSquares {
    private Scanner scanner;
    public int[][] squares;
    public int length;
    private int rowSum;
    private int columnSum;
    private int diagonalSum;
    private boolean magic;
    public MagicSquares() {
        magic = false;
        rowSum = 0;
        columnSum = 0;
        scanner = new Scanner(System.in);
        System.out.println("Enter the amount of Rows and Columns (they must be the same): ");
        length = scanner.nextInt();
        squares = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                squares[i][j] = 0;
            }
        }
    }

    public String toString() {
        String r = "";
        for (int i = 0; i < length; i++) {
            r = r + "|";
            for (int j = 0; j < length; j++)
                r = r + squares[i][j];
            r = r + "|\n";
        }
        return r;
    }

    public void add(int rows, int columns, int number) {
        assert columns >= 0 && columns < length;
        assert rows >= 0 && rows < length;
        assert number >= 0 && number <=  length * length;
            squares[rows][columns] = number;
        assert squares[rows][columns] != 0;
    }

    public boolean isMagic() {
        for (int z = 0; z<=length * length; z++) {
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    int num = squares[i][j];
                    rowSum = rowSum + num;
                }
            }
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    int num = squares[j][i];
                    columnSum = columnSum + num;
                }
            }
            for (int i = 0; i < length; i++) {
                int num = squares[i][i];
                diagonalSum = diagonalSum + num;
            }
            if (rowSum == columnSum && rowSum == diagonalSum * 4)
                magic = true;
            else {
                magic = false;
            }
        }
        return magic;
    }
}
