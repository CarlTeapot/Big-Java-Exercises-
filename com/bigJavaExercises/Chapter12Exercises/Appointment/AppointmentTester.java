package com.bigJavaExercises.Chapter12Exercises.Appointment;

public class AppointmentTester {
    public static void main(String[] args) {
        AppointmentDate date1 = new AppointmentDate(8,13,2021);
        AppointmentDate date2 = new AppointmentDate(5,8,2021);
        AppointmentDate date3 = new AppointmentDate(3,4,2021);
        AppointmentTime startTime1 = new AppointmentTime(18,30);
        AppointmentTime startTime2 = new AppointmentTime(20,30);
        AppointmentTime startTime3 = new AppointmentTime(15,30);
        AppointmentTime endTime1 = new AppointmentTime(18,30);
        AppointmentTime endTime2 = new AppointmentTime(20,30);
        AppointmentTime endTime3 = new AppointmentTime(15,30);
        Appointment appointment1 = new Appointment(date1,startTime1,endTime1, "eqimtan mivedi karoche damenzra mishvelet" );
        Appointment appointment2 = new Appointment(date2,startTime2,endTime2, "mishvelet kbilis eqimtan var vaime aaaa" );
        Appointment appointment3 = new Appointment(date3,startTime3,endTime3, "terapevttan shexvedra gmerto me mdzuls chemi coli" );
        AppointmentList appointmentList = new AppointmentList();
        appointmentList.addAppointment(appointment1);
        appointmentList.addAppointment(appointment2);
        appointmentList.addAppointment(appointment3);

        AppointmentMechanism appointmentMechanism = new AppointmentMechanism("Mate Arevadze",appointmentList);
        System.out.println(appointmentMechanism.appointmentInterface());
    }
}
