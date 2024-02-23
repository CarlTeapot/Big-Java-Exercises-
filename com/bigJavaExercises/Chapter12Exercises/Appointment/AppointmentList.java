package com.bigJavaExercises.Chapter12Exercises.Appointment;

import java.util.ArrayList;

public class AppointmentList {
    private ArrayList<Appointment> appointments;
    private String format;
    public AppointmentList() {
        appointments = new ArrayList<>();
        format = "";
    }
    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }
    public void removeAppointment(Appointment appointment) {
        appointments.remove(appointment);
    }
    public String format() {
        for (int i =0; i < appointments.size(); i++) {
            format = format + appointments.get(i).format() + "\n";
        }
        String list = format;
        format = "";
        return list;
    }
}
