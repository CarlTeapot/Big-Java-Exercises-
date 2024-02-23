package com.bigJavaExercises.Chapter16Exercises;

public class StudentName implements Comparable<StudentName> {

        private String name;
        public StudentName(String aName){
           name = aName;
        }

    public String getName() {
        return name;
    }
    public void rename(String renameTo){
            name = renameTo;
        }




    @Override
    public int compareTo(StudentName o) {
        if (this.getName().length() == o.getName().length())
            return 1;
        else if (this.getName().length() > o.getName().length())
            return 1;
        else
            return -1;
    }
}
