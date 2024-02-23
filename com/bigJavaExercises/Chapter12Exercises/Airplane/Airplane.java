package com.bigJavaExercises.Chapter12Exercises.Airplane;

public class Airplane {
    private String[][] firstClass;
    private String[][] economyClass;
    private final int firstClassRows = 5;
    private final int firstClassSeats = 4;
    private final int economyClassRows = 15;
    private final int economyClassSeats = 6;
    private String first;
    private String economy;
    private String airplane;
    private int balance;
    private final int firstClassPrice = 500;
    private final int economyClassPrice = 200;
    public Airplane(int aBalance) {
        balance = aBalance;
        firstClass = new String[firstClassRows][firstClassSeats];
        economyClass = new String[economyClassRows][economyClassSeats];
        first = "";
        economy = "";
        airplane = "";
        for (int i = 0; i < firstClassRows; i++) {
            for (int j = 0; j < firstClassSeats; j++) {
                firstClass[i][j] = "[_]";
            }
        }
        for (int i = 0; i < economyClassRows; i++) {
            for (int j = 0; j < economyClassSeats; j++) {
                economyClass[i][j] = "\\_/";
            }
        }
    }

    public String getFirst() {
        for (int i = 0; i < firstClassRows; i++) {
            for (int j = 0; j < firstClassSeats; j++) {
                first = first + firstClass[i][j];
            }
            first = first + "\n";
        }
        String seats = first;
        first = "";
        return seats;
    }

    public String getEconomy() {
        for (int i = 0; i < economyClassRows; i++) {
            for (int j = 0; j < economyClassSeats; j++)
                economy = economy + economyClass[i][j];
            economy = economy + "\n";
        }
        String seats = economy;
        economy = "";
        return seats;
    }

    public void addFirst(int row, int seat) {
        if (row > firstClassRows || row < 0) {
            throw new IllegalArgumentException("[Row parameter can not be more than the existing rows or less than zero]");
        }
        if (seat > firstClassSeats || seat < 0) {
            throw new IllegalArgumentException("[Seat parameter can not be more than the existing seats or less than zero]");
        }
        if (firstClass[row][seat].equals("[*]")) {
            System.out.println("[the seat is already taken]");
        } else {
            firstClass[row][seat] = "[*]";
            balance = balance - firstClassPrice;
        }
    }
    public void addEconomy(int row, int seat) {
        if (row > economyClassRows || row < 0) {
            throw new IllegalArgumentException("[Row parameter can not be more than the existing rows or less than zero]");
        }
        if (seat > economyClassSeats || seat < 0) {
            throw new IllegalArgumentException("[Seat parameter can not be more than the existing seats or less than zero]");
        }
        if (economyClass[row][seat].equals("\\*/")) {
            System.out.println("[the seat is already taken]");
        } else {
            economyClass[row][seat] = "\\*/";
            balance = balance - economyClassPrice;
        }
    }
    public String getBalance() {
        return "[Balance: " + balance +  "]";
    }
    public String airplaneInterface() {
        airplane = "[Airplane]            " + getBalance() + "\n" +
                "[First class:]\n" + getFirst() + "\n" + "[Economy class:]\n" + getEconomy();
        return  airplane;
    }
}

