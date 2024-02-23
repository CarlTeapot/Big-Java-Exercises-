package com.bigJavaExercises.Chapter5Exercises;

import java.util.Scanner;

public class TaxIn1913Tester {
    public static void main(String[] args) {
    TaxIn1913 tax = new TaxIn1913();
        System.out.println("Your taxes in 1913 would be: " + tax.getTax());
    }
}


class TaxIn1913 {
    Scanner scanner = new Scanner(System.in);

    private double income;

    public TaxIn1913() {
        System.out.print("Please enter your income: ");
        income = scanner.nextDouble();

    }
    public double getTax() {
        if (income <= 50000)
            return income/100;
        else if (income > 50000 && income <= 75000)
            return ((50000/100) + ((income - 50000) * 2/100));
        else if (income > 75000 && income <= 100000)
            return ((50000/100) + ((25000 * 2/100)) + (income - 75000) * 3/(100));
        else if (income > 100000 && income <= 250000)
            return ((50000/100) + ((25000 * 2)/100) + ((25000 * 3)/(100)) + ((income - 100000) * 4 / 100 ));
        else if (income > 250000 && income <= 500000)
            return ((50000/100) + ((25000 * 2)/100) + ((25000 * 3)/(100)) + ((100000 * 4) / 100 + ((income - 250000) * 5) / 100));
        return  ((50000/100) + ((25000 * 2)/100) + ((25000 * 3)/(100)) + ((100000 * 4) / 100 + ((250000) * 5) / 100) + ((income - 500000) * 6)/100);

    }
}