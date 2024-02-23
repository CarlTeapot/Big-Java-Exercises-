package com.bigJavaExercises.Chapter6Exercises;

import java.util.Scanner;

public class DataAnalyzer {
    private static double highestValue;
    private static int highestMonth;
    private static int currentMonth;
    private static int sum;
    private static double maximum;
    private static int count;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DataSet data = new DataSet();

        // boolean done = false;
        System.out.print("Enter the temperature of the first month: ");
        highestValue = in.nextDouble();
        int x = data.getCount();
        highestMonth = 1;
        currentMonth = 1;

        for (currentMonth = 2; currentMonth <= 12; currentMonth++) {
            System.out.print("Temperature for month" + currentMonth + ": ");
            double nextValue = in.nextDouble();
            if (nextValue > highestValue) {
                highestValue = nextValue;
                highestMonth = currentMonth;
            }


        }
        System.out.println("The month with the highest temperature is: " + highestMonth + "th");
        System.out.println(data.getAverage());
        System.out.println(data.getMaximum());

      /*  while (!done) {
            String input = in.next();
            double y = Double.parseDouble(input);
            if (input.equalsIgnoreCase("Q"))
                done = true;
            else {
                System.out.print(data.getMonth());
                data.add(y);
                data.add(x);
                x++;
            }
        }

        System.out.println(data.getTemperature());
        System.out.println(data.getAverage());
        System.out.println(data.getMaximum());
*/
    }
    public String getAverage() {
        if (currentMonth == 0)
            return "Enter something to get the average";
        return "Average = " + sum / count;
    }
    public String getMaximum() {
        return "Maximum = " + maximum;
    }

}


class DataSet {
    Scanner scanner = new Scanner(System.in);
    private double sum;
    private double maximum;
    private int count;

    public DataSet() {
        sum = 0;
        count = 0;
        maximum = 0;
    }

    public void add(double x) {
        sum = sum + x;
        if (count == 0 || maximum < x)
            maximum = x;
        count++;
    }

    public String getAverage() {
        if (count == 0)
            return "Enter something to get the average";
        return "Average = " + sum / count;
    }

    public String getMaximum() {
        return "Maximum = " + maximum;
    }

    public int getCount() {
        return count;
    }

    public String getMonth() {
        if (count == 1)
            return "January: ";
        else if (count == 2)
            return "February: ";
        else if (count == 3)
            return "March: ";
        else if (count == 4)
            return "April: ";
        else if (count == 5)
            return "May: ";
        else if (count == 6)
            return "June: ";
        else if (count == 7)
            return "July: ";
        else if (count == 8)
            return "August: ";
        else if (count == 9)
            return "September: ";
        else if (count == 10)
            return "October: ";
        else if (count == 11)
            return "November: ";
        else if (count == 12)
            return "December: ";
        return "Error";
    }

    public String getTemperature() {
        double highestValue = scanner.nextDouble();
        int highestMonth = 1;
        int currentMonth = 1;
        for (currentMonth = 2; currentMonth <= 12; currentMonth++) {
            double nextValue = scanner.nextDouble();
            if (nextValue > highestValue) {
                highestValue = nextValue;
                highestMonth = currentMonth;
            } else
                highestMonth = currentMonth;
            count++;
        }
        return "Month" + count + ": "  + currentMonth;
    }

}