package com.bigJavaExercises.Chapter10Exercises;

public class PersonAndEmployeeTester {
    public static void main(String[] args) {
        Person person = new Person("zaza", 1997);
        System.out.println(person.toString());

        System.out.println("\n");

        Person student = new Student("tornike", 2001, "Business Management");
        System.out.println(student.toString());

        System.out.println("\n");

        Person instructor = new Instructor("mamuka", 1993, 25000);
        System.out.println(instructor.toString());

        System.out.println("\n");

        Employee employee = new Employee("zaza", 250000);
        System.out.println(employee.toString());

        System.out.println("\n");

        Employee manager = new Manager("goirgi", 10000, "Marketing");
        System.out.println(manager.toString());
    }
}
