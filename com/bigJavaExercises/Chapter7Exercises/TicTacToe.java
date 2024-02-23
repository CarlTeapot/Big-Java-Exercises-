package com.bigJavaExercises.Chapter7Exercises;

import com.bigJavaExercises.Chapter9Exercises.Game;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe implements Game {
    private Scanner in;
    private Random random;

    private String player;
    private String computer;
    private boolean done;
    private String winner;
    private String[][] board;
    private String wonRow;
    private String wonColumn;
    private String wonDiagonal;
    private String xo;
    private static final int ROWS = 3;
    private static final int COLUMNS = 3;
    private int edges;
    private int corners;
    private int xd;
    private boolean aiMove = false;


    public TicTacToe() {
        random = new Random();
        xo = null;
        player = "x";
        computer = "o";
        done = false;
        winner = "The winner is: ";
        in = new Scanner(System.in);
        board = new String[ROWS][COLUMNS];
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                board[i][j] = " ";
            }
        }
    }
    @Override
    public void set(int rows, int columns, String player) {
        if (!board[rows][columns].equals(" ")) {
            System.out.println("Position occupied");
        } else {
            board[rows][columns] = player;
        }
    }
    @Override
    public String toString() {
        String r = "";
        for (int i = 0; i < ROWS; i++) {
            r = r + "|";
            for (int j = 0; j < COLUMNS; j++)
                r = r + board[i][j];
            r = r + "|\n";
        }
        return r;
    }

    @Override
    public boolean isOccupied(int row, int column) {
        if (!board[row][column].equals(" "))
            return true;
        else return false;
    }

    @Override
    public String check1() {
        for (int i = 0; i < board.length; i++) {
            String row = board[i][0];
            boolean same = true;
            for (int j = 1; j < board.length; j++) {
                if (!row.equals(board[i][j]) || board[i][j].equals(" ")) {
                    same = false;
                }
            }
            if (same) {
                winner = winner + row;
                return winner;
            }
            if (board[i][0] == player && board[i][1] == player)
                set(i, 2, computer);
            else if (board[i][0] == player && board[i][2] == player)
                set(i, 1, computer);
            else if (board[i][2] == player && board[i][1] == player)
                set(i, 0, computer);
        }
        return null;
    }

    @Override
    public String check2() {
        for (int i = 0; i < board.length; i++) {
            String column = board[0][i];
            boolean same = true;
            for (int j = 1; j <= board.length - 1; j++) {
                if (!column.equals(board[j][i]) || board[j][i].equals(" "))
                    same = false;

            }
            if (same) {
                winner = winner + column;
                return winner;
            }
            if (board[0][i] == player && board[1][i] == player)
                set(2, i, computer);
            else if (board[2][i] == player && board[1][i] == player)
                set(0, i, computer);
            else if (board[0][i] == player && board[2][i] == player)
                set(1, i, computer);
        }
        return null;
    }

    @Override
    public String check3() {
        boolean same = true;
        String diagonal = board[0][0];
        for (int j = 1; j < board.length; j++) {

            if (!diagonal.equals(board[j][j]) || board[j][j].equals(" "))
                same = false;

            if (board[1][1] == player && board[2][2] == player)
                set(0, 0, computer);
            else if (board[2][2] == player && board[0][0] == player)
                set(1, 1, computer);
            else if (board[0][0] == player && board[1][1] == player)
                set(2, 2, computer);

        }

        if (same) {
            winner = winner + diagonal;
            return winner;
        }
        diagonal = board[0][board.length - 1];
        same = true;
        for (int j = 1; j < board.length && same; j++) {
            if (!diagonal.equals(board[j][board.length - 1 - j]) || board[j][board.length - 1 - j].equals(" "))
                same = false;
        }

        if (same) {
            winner = winner + diagonal;
            return winner;
        }
        return null;
    }
    @Override
    public String getWinner() {
        // CHECKING ROWS
        for (int i = 0; i < board.length; i++) {
            String row = board[i][0];
            boolean same = true;
            for (int j = 1; j < board.length; j++) {
                if (!row.equals(board[i][j]) || board[i][j].equals(" ")) {
                    same = false;
                }
            }
            if (same) {
                winner = winner + row;
                return winner;
            }
//            if (board[i][0] == player && board[i][1] == player)
//                set(i, 2, computer);
//            else if (board[i][0] == player && board[i][2] == player)
//                set(i, 1, computer);
//            else if (board[i][2] == player && board[i][1] == player)
//                set(i, 0, computer);
        }
        //CHECKING COLUMNS
        for (int i = 0; i < board.length; i++) {
            String column = board[0][i];
            boolean same = true;
            for (int j = 1; j <= board.length - 1; j++) {
                if (!column.equals(board[j][i]) || board[j][i].equals(" "))
                    same = false;

            }
            if (same) {
                winner = winner + column;
                return winner;
            }

//            if (board[0][i] == player && board[1][i] == player)
//                set(2, i, computer);
//            else if (board[2][i] == player && board[1][i] == player)
//                set(0, i, computer);
//            else if (board[0][i] == player && board[2][i] == player)
//                set(1, i, computer);


        }
        //CHECKING DIAGONALS
        boolean same = true;
        String diagonal = board[0][0];
        for (int j = 1; j < board.length; j++) {

            if (!diagonal.equals(board[j][j]) || board[j][j].equals(" "))
                same = false;

//            if (board[1][1] == player && board[2][2] == player)
//                set(0, 0, computer);
//            else if (board[2][2] == player && board[0][0] == player)
//                set(1, 1, computer);
//            else if (board[0][0] == player && board[1][1] == player)
//                set(2, 2, computer);

        }

        if (same) {
            winner = winner + diagonal;
            return winner;
        }
        diagonal = board[0][board.length - 1];
        same = true;
        for (int j = 1; j < board.length && same; j++) {
            if (!diagonal.equals(board[j][board.length - 1 - j]) || board[j][board.length - 1 - j].equals(" "))
                same = false;


        }

        if (same) {
            winner = winner + diagonal;
            return winner;
        }

        return null;
    }

    @Override
    public String play() {
        while (!done) {
            if (!aiMove) {
                System.out.print(toString());
                System.out.print("Row for " + player + " (-1 to exit): ");
                int row = in.nextInt();
                if (row < 0)
                    done = true;
                else {
                    System.out.print("Column for " + player + ": ");
                    int column = in.nextInt();
                    if (isOccupied(row, column)) {
                        System.out.println("Position occupied");
                        continue;
                    }
                    set(row, column, player);
                    if (getWinner() != null)
                        done = true;
//                    if (player.equals("x")) {
//                        player = "o";
//                    } else {
//                        player = "x";
//                    }
                }
                aiMove = true;
            } else {
                aiMove();
                aiMove = false;
            }
        }
        return getWinner();
    }
    @Override
    public void aiMove() {
        boolean moveMade = false;
        Integer row = null;
        Integer col = null;
        if (board[1][1].equals(" ")) {
            set(1, 1, computer);
            moveMade = true;
            return;
        }
        for (int i = 0; i < board.length; i++) {
            String previous = null;
            int sameCount = 0;
            Integer emptyIndex = null;
            for (int j = 0; j < board[i].length; j++) {
                String current = board[i][j];
                if (previous != null && current.equals(previous) && !previous.equals(" ") && !current.equals(" ")
                        && (!previous.equals("o") && !current.equals("o")))
                    sameCount = sameCount + 1;
                if (current.equals(" ")) {
                    row = i;
                    col = j;
                }
                if (!current.equals(" "))
                    previous = current;
            }
            if (sameCount > 0 && col != null) {
                set(row, col, computer);
                moveMade = true;
                return;
            }
        }
        col = null;
        row = null;
        for (int i = 0; i < board.length; i++) {
            String previous = null;
            int sameCount = 0;
            Integer emptyIndex = null;
            for (int j = 0; j < board[i].length; j++) {
                String current = board[j][i];
                if (previous != null && current.equals(previous) && !previous.equals(" ") && !current.equals(" ") && (!previous.equals("o") && !current.equals("o")))
                    sameCount = sameCount + 1;
                if (current.equals(" ")) {
                    row = j;
                    col = i;
                }
                if (!current.equals(" "))
                    previous = current;
            }
            if (sameCount > 0 && col != null) {
                set(row, col, computer);
                moveMade = true;
                return;
            }
        }

        String previous = null;
        int sameCount = 0;
        Integer emptyIndex = null;
        for (int i = 0; i < board.length; i++) {
            String current = board[i][i];
            if (previous != null && current.equals(previous) && !previous.equals(" ") && !current.equals(" ") && (!previous.equals("o") && !current.equals("o")))
                sameCount = sameCount + 1;
            if (current.equals(" ")) {
                row = i;
                col = i;
            }
            if (!current.equals(" "))
                previous = current;
        }
        if (sameCount > 0 && col != null) {
            set(row, col, computer);
            moveMade = true;
            return;
        }

        previous = null;
        sameCount = 0;
        emptyIndex = null;
        int j = 2;
        for (int i = 0; i >=0; i--) {
            String current = board[i][j];
            if (previous != null && current.equals(previous) && !previous.equals(" ") && !current.equals(" ") && (!previous.equals("o") && !current.equals("o")))
                sameCount = sameCount + 1;
            if (current.equals(" ")) {
                row = i;
                col = j;
            }
            if (!current.equals(" "))
                previous = current;
            j--;
        }

        if (sameCount > 0 && col != null) {
            set(row, col, computer);
            moveMade = true;
            return;
        }

        if (!moveMade)
            set(row, col, computer);
    }

    public String play2() {
        for (int turn = 1; turn <= 5; turn++) {
            System.out.print(toString());
            System.out.print("Row for " + player + " (-1 to exit): ");
            int row = in.nextInt();
            if (row < 0)
                break;
            else {
                System.out.print("Column for " + player + ": ");
                int column = in.nextInt();
                set(row, column, player);

                for (int i = 1; i < board.length; i++) {
                    if (board[0][0] == player && board[0][i] == player) {
                        if (i == 1)
                            set(0, i + 1, computer);
                        else
                            set(0, i - 1, computer);
                    }
                }

                for (int i = 1; i < board.length; i++) {
                    if (board[0][0] == player && board[i][0] == player) {
                        if (i == 1)
                            set(2, 0, computer);
                        else
                            set(1, 0, computer);
                    }
                }

                //SECOND CORNER
                for (int i = 0; i < board.length - 1; i++) {
                    if (board[2][2] == player && board[2][i] == player) {
                        if (i == 0)
                            set(2, 1, computer);
                        else
                            set(2, 0, computer);
                    }
                }
                for (int i = 0; i < board.length - 1; i++) {
                    if (board[2][2] == player && board[i][2] == player) {
                        if (i == 0)
                            set(1, 2, computer);
                        else
                            set(0, 2, computer);
                    }
                }
                for (int i = 1; i < board.length; i++) {
                    if (board[1][0] == player && board[1][i] == player) {
                        if (i == 1)
                            set(1, i + 1, computer);
                        else
                            set(1, i - 1, computer);
                    }

                }
                for (int i = 0; i < board.length - 1; i++) {
                    if (board[1][2] == player && board[1][i] == player) {
                        if (i == 1)
                            set(1, i - 1, computer);
                        else
                            set(1, i + 1, computer);
                    }
                }
                for (int i = 0; i < board.length - 1; i++) {
                    if (board[1][2] == player && board[1][i] == player) {
                        if (i == 1)
                            set(1, i - 1, computer);
                        else
                            set(1, i + 1, computer);
                    }
                }
                for (int i = 0; i < board.length - 1; i++) {
                    if (board[1][2] == player && board[1][i] == player) {
                        if (i == 1)
                            set(1, i - 1, computer);
                        else
                            set(1, i + 1, computer);
                    }
                }
                //THIRD CORNER
                for (int i = 0; i < board.length - 1; i++) {
                    if (board[0][2] == player && board[0][i] == player) {
                        if (i == 0)
                            set(0, i + 1, computer);
                        else
                            set(0, i - 1, computer);
                    }

                }

                for (int i = 1; i < board.length; i++) {
                    if (board[0][2] == player && board[i][2] == player) {
                        if (i == 1)
                            set(i + 1, 2, computer);
                        else
                            set(i - 1, 2, computer);
                    }

                }
                //FOURTH CORNER
                for (int i = 1; i < board.length; i++) {
                    if (board[2][0] == player && board[2][i] == player) {
                        if (i == 1)
                            set(2, i + 1, computer);
                        else
                            set(2, i - 1, computer);
                    }
                }

                for (int i = 0; i < board.length - 1; i++) {
                    if (board[2][0] == player && board[i][0] == player) {
                        if (i == 0)
                            set(i + 1, 0, computer);
                        else
                            set(i - 1, 0, computer);
                    }

                }

                //CHECKING FROM EDGES JUST IN CASE
                for (int i = 1; i < board.length; i++) {
                    if (board[0][1] == player && board[i][1] == player) {
                        if (i == 1)
                            set(i + 1, 1, computer);
                        else
                            set(i - 1, 1, computer);
                    }
                }

                for (int i = 0; i < board.length - 1; i++) {
                    if (board[2][1] == player && board[i][1] == player) {
                        if (i == 0)
                            set(i + 1, 1, computer);
                        else
                            set(i - 1, 1, computer);
                    }
                }
                for (int i = 1; i < board.length; i++) {
                    if (board[1][0] == player && board[1][i] == player) {
                        if (i == 1)
                            set(1, i + 1, computer);
                        else
                            set(1, i - 1, computer);
                    }
                }
                for (int i = 0; i < board.length - 1; i++) {
                    if (board[1][2] == player && board[1][i] == player) {
                        if (i == 0)
                            set(1, i + 1, computer);
                        else
                            set(1, i - 1, computer);
                    }
                }
                if ((turn == 2 && board[0][0] == player && board[2][1] == player)) {
                    set(2, 0, computer);
                }
                if ((turn == 2 && board[0][0] == player && board[1][2] == player)) {
                    set(0, 2, computer);
                }
                if ((turn == 2 && board[2][2] == player && board[0][1] == player)) {
                    set(0, 2, computer);
                }
                if ((turn == 2 && board[2][2] == player && board[1][0] == player)) {
                    set(2, 0, computer);
                }
                if ((turn == 2 && board[2][0] == player && board[0][1] == player)) {
                    set(0, 0, computer);
                }
                if ((turn == 2 && board[2][0] == player && board[1][2] == player)) {
                    set(2, 2, computer);
                }
                if ((turn == 2 && board[0][2] == player && board[1][0] == player)) {
                    set(0, 0, computer);
                }
                if ((turn == 2 && board[0][2] == player && board[2][1] == player)) {
                    set(2, 2, computer);
                }


                if ((turn == 1 && board[0][0] == player) || (turn == 1 && board[2][2] == player)
                        || (turn == 1 && board[0][2] == player) || (turn == 1 && board[2][0] == player)) {
                    set(1, 1, computer);

                    if (turn == 2 && board[2][0] == player && board[0][2] == player) {
                        edges = random.nextInt(4);
                        if (edges == 0)
                            set(1, 0, computer);
                        else if (edges == 1)
                            set(0, 1, computer);
                        else if (edges == 2)
                            set(1, 2, computer);
                        else
                            set(2, 1, computer);
                    }
                    if (turn == 2 && board[0][0] == player && board[2][2] == player) {
                        edges = random.nextInt(4);
                        if (edges == 0)
                            set(1, 0, computer);
                        else if (edges == 1)
                            set(0, 1, computer);
                        else if (edges == 2)
                            set(1, 2, computer);
                        else
                            set(2, 1, computer);
                    }
                    if ((turn == 2 && board[0][0] == player && board[2][1] == player)) {
                        set(2, 0, computer);
                    }
                    if ((turn == 2 && board[0][0] == player && board[1][2] == player)) {
                        set(0, 2, computer);
                    }
                    if ((turn == 2 && board[2][2] == player && board[0][1] == player)) {
                        set(0, 2, computer);
                    }
                    if ((turn == 2 && board[2][2] == player && board[1][0] == player)) {
                        set(2, 0, computer);
                    }
                    if ((turn == 2 && board[2][0] == player && board[0][1] == player)) {
                        set(0, 0, computer);
                    }
                    if ((turn == 2 && board[2][0] == player && board[1][2] == player)) {
                        set(2, 2, computer);
                    }
                    if ((turn == 2 && board[0][2] == player && board[1][0] == player)) {
                        set(0, 0, computer);
                    }
                    if ((turn == 2 && board[0][2] == player && board[2][1] == player)) {
                        set(2, 2, computer);
                    }
                }
                if (turn == 1 && board[1][1] == player) {
                    corners = random.nextInt(4);
                    if (corners == 0)
                        set(0, 0, computer);
                    if (corners == 1)
                        set(2, 2, computer);
                    if (corners == 2)
                        set(2, 0, computer);
                    if (corners == 3)
                        set(0, 2, computer);

                    // FIRST CORNER


                }
                if ((turn == 1 && board[1][0] == player) || (turn == 1 && board[0][1] == player) || (turn == 1 && board[1][2] == player) || (turn == 1 && board[2][1] == player)) {
                    set(1, 1, computer);
                    if (turn == 2 && board[1][0] == player && board[0][1] == player) {
                        set(0, 2, computer);
                    }
                    if (turn == 2 && board[1][0] == player && board[2][1] == player) {
                        set(2, 2, computer);
                    }
                    if (turn == 2 && board[1][2] == player && board[0][1] == player) {
                        set(0, 0, computer);
                    }
                    if (turn == 2 && board[1][2] == player && board[2][1] == player) {
                        set(2, 0, computer);
                    }

                }
                if (board[1][1] == player && board[0][0] == player) {
                    if (board[2][2] == computer) {
                        xd = random.nextInt(2);
                        if (xd == 0)
                            set(2, 0, computer);
                        else
                            set(0, 2, computer);
                    } else
                        set(2, 2, computer);
                }
                if (board[1][1] == player && board[2][2] == player) {
                    set(0, 0, computer);
                    if (board[0][0] == computer) {
                        xd = random.nextInt(2);
                        if (xd == 0)
                            set(2, 0, computer);
                        else
                            set(0, 2, computer);
                    } else
                        set(0, 0, computer);
                }
                if (board[1][1] == player && board[2][0] == player) {
                    set(0, 2, computer);
                    if (board[0][2] == computer) {
                        xd = random.nextInt(2);
                        if (xd == 0)
                            set(0, 0, computer);
                        else
                            set(2, 2, computer);
                    } else
                        set(0, 2, computer);
                }
                if (board[1][1] == player && board[0][2] == player) {
                    set(2, 0, computer);
                    if (board[2][0] == computer) {
                        xd = random.nextInt(2);
                        if (xd == 0)
                            set(0, 0, computer);
                        else
                            set(2, 2, computer);
                    } else
                        set(2, 0, computer);
                }
                if (board[0][0] == player && board[2][2] == player) {
                    edges = random.nextInt(4);
                    if (edges == 0)
                        set(1, 0, computer);
                    else if (edges == 1)
                        set(0, 1, computer);
                    else if (edges == 2)
                        set(1, 2, computer);
                    else
                        set(2, 1, computer);

                }
                if (board[2][0] == player && board[0][2] == player) {
                    edges = random.nextInt(4);
                    if (edges == 0)
                        set(1, 0, computer);
                    else if (edges == 1)
                        set(0, 1, computer);
                    else if (edges == 2)
                        set(1, 2, computer);
                    else
                        set(2, 1, computer);
                }
                for (int i = 0; i < board.length; i++) {
                    for (int j = 0; j < board.length; j++) {
                        if (turn == 5 && board[i][j] == " ")
                            set(i, j, computer);
                    }
                }


                if (turn == 5 && check1() == null && check2() == null && check3() == null) {
                    winner = "draw";
                    return winner;
                }

                if (check1() != null || check2() != null || check3() != null)
                    return winner;

            }

        }
        return winner;
    }
}




