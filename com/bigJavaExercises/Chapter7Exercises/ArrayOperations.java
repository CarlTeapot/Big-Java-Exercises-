package com.bigJavaExercises.Chapter7Exercises;

import com.bigJavaExercises.Chapter11Exercises.BankAccount;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    private int[] values1;
    private ArrayList<Integer> values;
    private ArrayList<BankAccount> accounts;
    private int total = 0;
    private int average;


    public ArrayOperations(ArrayList<Integer> values) {
        this.values = values;
    }


    public ArrayList<Integer> Filling() {
        for (int i = 0; i < values.size(); i++) {
            values.set(i,0);
        }
        return values;
    }

    public int getSize() {
        int size = 0;
        for (int i = 0; i < values1.length; i++) {
            size = i;
        }
        return size;
    }
    public int getSum() {
        for (int element : values) {
            total = total + element;
        }
        return total;
    }

    public int getAverage() {
        for (int element : values) {
            total = total + element;
        }
        average = total / values.size();
        return average;
    }

    public int countingMatches(int atLeast) {
        int matches = 0;
        for (BankAccount account : accounts) {
            if (account.getBalance() >= atLeast)
                matches++;
        }
        return matches;
    }

    public BankAccount getMaximum() {
        BankAccount largestYet = accounts.get(0);
        for (int i = 1; i < accounts.size(); i++) {
            BankAccount a = accounts.get(i);
            if (a.getBalance() > largestYet.getBalance())
                largestYet = a;
        }
        return largestYet;
    }

    public BankAccount getMinimum() {
        BankAccount smallestYet = accounts.get(0);
        for (int i = 1; i < accounts.size(); i++) {
            BankAccount a = accounts.get(i);
            if (a.getBalance() < smallestYet.getBalance())
                smallestYet = a;
        }
        return smallestYet;
    }

    public String find(int number) {
        for (int find : values) {
            if (find == number)
                return "Found the match: " + Integer.toString(find);
        }
        return "Not found";
    }

    public void locatePosition(int number) {
        int pos = 0;
        boolean found = false;

        while (pos < values.size() && !found) {
            if (values.get(pos) > 100) {
                found = true;
            }
            else {
                pos++;
            }
        }
        if (found) {
            System.out.println("Position: " + pos);
        }
        else {
            System.out.println("Not found");
        }
    }

    public void removingElement() {
        int pos = 0;
        boolean found = false;
        int size = getSize();
        for (int i = pos; i < values.size() - 1; i++) {
            values1[1] = getSize() - 1;
        }
        size--;
    }

    public void addElement() {
        int size = getSize();
        int pos = 0;
        int newElement = 0;
        if (size < values1.length) {
            for (int i = size; i > pos; i--) {
                values1[i] = values1[i - 1];
            }
            values1[pos] = newElement;
            size++;
        }
    }
    public void copyingArrays() {
        double[] values1 = new double[6];
        double[] prices = values1; // Reference copy

        prices = Arrays.copyOf(values1, values1.length); // True copy

        values1 = Arrays.copyOf(values1, 2 * values1.length);
    }
    public void growArrays() {
        Scanner scanner = new Scanner(System.in);
        int valuesSize = 0;
        while (scanner.hasNextInt())
        {
            if (valuesSize == values1.length)
                values1 = Arrays.copyOf(values1, 2 * values1.length);
            values1[valuesSize] = scanner.nextInt();
            valuesSize++;
        }
    }

    public void PrintSeparators() {
        // this just makes Arrays more readable, it is not a necessary method
        for (int i = 0; i < values.size(); i++)
        {
            if (i > 0)
            {
                System.out.print(" | ");
            }
            System.out.print(values.get(i));
        }
    }
}
