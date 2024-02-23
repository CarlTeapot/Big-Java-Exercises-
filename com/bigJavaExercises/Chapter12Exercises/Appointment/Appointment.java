package com.bigJavaExercises.Chapter12Exercises.Appointment;

public class Appointment {
    private AppointmentDate date;
    private AppointmentTime startTime;
    private AppointmentTime endTime;
    private String description;
    private String appointment;
    public Appointment(AppointmentDate aDate, AppointmentTime startingTime, AppointmentTime endingTime, String aDescription) {
        date = aDate;
        startTime = startingTime;
        endTime = endingTime;
        description = aDescription;
        appointment = "";
    }
    public String getDate() {
        return date.format();
    }
    public String getStartTime() {
        return startTime.format();
    }
    public String getEndTime() {
        return endTime.format();
    }
    public String format() {
        appointment = "[Date: " + date.format() + "; Starting time: "
                + startTime.format() + "; EndTime: " + endTime.format() + "]\n" + "[Description: " + description + "]";
        return  appointment;
    }
}
