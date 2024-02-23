package com.bigJavaExercises.Chapter12Exercises.Appointment;

public class AppointmentTime {

    private int hour;
    private int minute;
    private String time;

    public AppointmentTime(int anHour, int aMinute) {
        hour = anHour;
        if (anHour > 24 || anHour < 0) {
            throw new IllegalArgumentException("there are 24 hours in a day");
        }
        minute = aMinute;
        if (aMinute > 60 || aMinute < 0) {
            throw new IllegalArgumentException("there are 60 minutes in an hour");
        }
        time = "";
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public String format() {
        time = "[" + hour + ":" + minute + "]";
        return  time;
    }
}
