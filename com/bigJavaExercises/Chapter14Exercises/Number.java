package com.bigJavaExercises.Chapter14Exercises;

public class Number implements Comparable<Number> {

    public int number;
    public String name;

    public Number(int aNumber, String aName) {
        number = aNumber;
        name = aName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Number o) {
        Number otherNumber = (Number) o;
        if (number < o.number) return -1;
        if (number == o.number) return 0;
        return 1;
    }

    @Override
    public String toString() {
        return "Number{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}
