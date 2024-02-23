package com.bigJavaExercises.Chapter16Exercises;

public class Student implements Comparable<Student> {
    public String firstName;
    public String lastName;
    public int id;
    public Student(String aFirstName, String aLastName){
        firstName = aFirstName;
        lastName = aLastName;
        id = aFirstName.hashCode() * aLastName.hashCode();
    }

    public String getName() {
        return "[" + lastName + ", " + firstName + "]";
    }
    public void rename(String aFirstName, String aLastName){
        firstName = aFirstName;
        lastName = aLastName;
    }
    public void changeLastName(String aLastName){
        lastName = aLastName;
    }
    public void changeFirstName(String aFirstName){
        firstName = aFirstName;
    }
    private String getLastName() {
        return lastName;
    }
    @Override
    public int compareTo(Student o) {
        if (this.getLastName().length() == o.getLastName().length())
            return 1;
        else if (this.getLastName().length() > o.getLastName().length())
            return 1;
        else
            return -1;
    }
}
