package com.bigJavaExercises.Chapter4Exercises;

import java.util.Scanner;

public class TimeIntervalTester {
    public static void main(String[] args) {
    TimeInterval timeInterval = new TimeInterval();
        System.out.println(timeInterval.firstTimeConvertToPM());
        System.out.println(timeInterval.secondTimeConvertToPm());
        System.out.println(timeInterval.getInterval());
    }
}
class TimeInterval {
    Scanner scanner = new Scanner(System.in);
    private int firstTime;
    private int secondTime;
    private int interval;
    public TimeInterval() {
        System.out.print("Please enter the first time: ");
        firstTime = scanner.nextInt();
        System.out.print("Please enter the second time: ");
        secondTime = scanner.nextInt();
        interval = secondTime - firstTime;
    }
    public String firstTimeConvertToPM() {
        String xd = Integer.toString(firstTime);
        int xd1 = Integer.parseInt(xd.substring(0, 2));
        int xd2 = xd1 - 12;
        String xd3 = xd.substring(2, 4);
        return "Starting time is: " + Integer.toString(xd2) + ":" + (xd3);
    }
    public String secondTimeConvertToPm() {
        String xd = Integer.toString(secondTime);
        int xd1 = Integer.parseInt(xd.substring(0, 2));
        int xd2 = xd1 - 12;
        String xd3 = xd.substring(2, 4);
        return "Ending time is: " + Integer.toString(xd2) + ":" + (xd3);
    }
    public String getInterval() {
        String xd = Integer.toString(interval);
        int xd1 = Integer.parseInt(xd.substring(0, 2));
        int xd2 = xd1 / 10;
        String xd3 = xd.substring(1, 3);
        return "Interval time is: " + Integer.toString(xd2) + ":" + (xd3);
    }
}