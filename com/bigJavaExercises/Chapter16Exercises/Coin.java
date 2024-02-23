package com.bigJavaExercises.Chapter16Exercises;

import java.util.Comparator;

public class Coin implements Comparator<Coin> {
    private double value;
    private String name;

    public Coin(double aValue, String aName) {
        this.value = aValue;
        this.name = aName;
    }

    public double getValue() {
        return value;
    }

    @Override public String toString() {
        return "Coin{" +
                "value=" + value +
                ", name='" + name + '\'' +
                '}';
    }

    public boolean equals(Object otherObject) {
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;
        Coin other = (Coin) otherObject;
        return value == other.value && name.equals(other.name);
    }
    public int hashCode() {
        int h1 = name.hashCode();
        int h2 = new Double(value).hashCode();
        final int HASH_MULTIPLIER = 29;
        int h = HASH_MULTIPLIER * h1 + h2;
        return h;
    }

    @Override
    public int compare(Coin a, Coin b) {
        if (a.getValue() < b.getValue()) return -1;
        if (a.getValue() == b.getValue()) return 0;
        return 1;
    }

    @Override
    public Comparator<Coin> reversed() {
        return null;
    }
}
