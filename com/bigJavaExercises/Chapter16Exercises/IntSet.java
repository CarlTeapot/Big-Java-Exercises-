package com.bigJavaExercises.Chapter16Exercises;

import java.util.*;

public class IntSet implements Set<Integer> {
    private Set<Integer> set;
    private int current;

    public IntSet() {
        set = new TreeSet<>();
        current = 0;
    }

    public void add(int x) {
        set.add(x);
    }

    public void remove(int x) {
        if (set.contains(x))
            set.remove(x);
        else
            System.out.println("Number " + x + " is not present");
    }

    public void print() {
        for (int xd : set)
            System.out.println(xd);
    }

    public boolean contains(int x) {
        for (int xd : set) {
            if (xd == x) {
                return true;
            }
        }
        return false;
    }

    public boolean hasNext() {
        Iterator<Integer> iterator = set.iterator();
        return iterator.hasNext();
    }


    public int next() {
        if (hasNext()) {
            Iterator<Integer> iterator = set.iterator();
            iterator.next();
        }
        return 0;
    }

    public IntSet union(IntSet other) {
        IntSet q = (IntSet) set;
        for (int xd : set) {
            q.add(xd);
        }
        return q;
    }

    public IntSet intersection(IntSet other) {
        IntSet inter = new IntSet();
        for (int xd : set) {
            for (int zd : other) {
                if (xd == zd) ;
                inter.add(zd);
            }
        }
        return inter;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Integer integer) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Spliterator<Integer> spliterator() {
        return null;
    }
}

