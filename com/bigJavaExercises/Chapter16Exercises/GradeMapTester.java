package com.bigJavaExercises.Chapter16Exercises;

public class GradeMapTester {
    public static void main(String[] args) {
        GradeMap map = new GradeMap();
        StudentName name = new StudentName("Zura");
        StudentName name1 = new StudentName("Murad");
        StudentName name2 = new StudentName("Nana");
        StudentName name3 = new StudentName("Eliso");
        StudentName name4 = new StudentName("Tornike");
        StudentName name5 = new StudentName("Mishveley");

        map.add(name, "B-");
        map.add(name1, "S");
        map.add(name2, "C+");
        map.add(name3, "A-");
        map.add(name4 ,"A+");
        map.add(name5 ,"D");
        System.out.println(map.display());
        map.changeName(name, "Kuku");
        map.changeName(name3, "YuYu");
        map.changeGrade(name, "F");
        System.out.println(map.display());
    }
}
