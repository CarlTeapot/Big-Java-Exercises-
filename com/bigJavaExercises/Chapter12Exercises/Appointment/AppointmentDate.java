package com.bigJavaExercises.Chapter12Exercises.Appointment;

public class AppointmentDate {
    private int month;
    private int day;
    private int year;
    private String date;
    public AppointmentDate(int aMonth, int aDay, int anYear) {

        if (aMonth > 13 || aMonth < 0) {
            throw new IllegalArgumentException("there are only 12 months");
        }
        if (aDay > 31 || aDay < 0) {
            throw new IllegalArgumentException("there are maximum 31 days in a month");
        }
        month = aMonth;
        day = aDay;
        year = anYear;
        date = "";
    }
    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }
    public int getYear() {
        return year;
    }
    public String format() {
        date = "[" + day + "/" + month + "/" + year + "]";
        return date;
    }
}
