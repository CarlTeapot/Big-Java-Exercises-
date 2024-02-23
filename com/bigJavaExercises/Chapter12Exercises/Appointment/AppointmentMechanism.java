package com.bigJavaExercises.Chapter12Exercises.Appointment;

import java.time.LocalTime;

public class AppointmentMechanism {

    private AppointmentList appointments;
    private String userInterface;
    public String name;
    public AppointmentMechanism(String aName,AppointmentList anAppointments) {
        appointments = anAppointments;
        userInterface = "";
        name = aName;
    }
    public void removeAppointment(Appointment appointment) {
        appointments.removeAppointment(appointment);
    }
    public String appointmentInterface() {
        userInterface = "[Name: " + name + "]" + "             " +
                "      [Time: " + LocalTime.now() + "]\n" + "[Appointments:]\n" + appointments.format();
        return userInterface;
    }
}
