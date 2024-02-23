package com.bigJavaExercises.Chapter16Exercises;

public class StudentMapTester {
    public static void main(String[] args) {
        StudentMap map = new StudentMap();
        Student name = new Student("Mate", "Arevadze");
        Student name1 = new Student("Kuku", "Kukushvili");
        Student name2 = new Student("Nana", "Damexmaret");
        Student name3 = new Student("Nunua","Mishveley");

        map.add(name, "B-");
        map.add(name1, "S");
        map.add(name2, "C+");
        map.add(name3, "A-");
        System.out.println(map.display());
        map.changeFirstName(name, "Kuku");
        map.changeLastName(name3, "YuYu");
        map.changeGrade(name, "F");
        System.out.println(map.display());
    }
}
