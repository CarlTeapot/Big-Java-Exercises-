package com.bigJavaExercises.Chapter15Exercises;

import java.util.NoSuchElementException;

public class LinkedListSample {


    public Node first;
    public Node last;
    public ListIteratorSample iterator;
    public int size;
    public LinkedListSample() {
        first = null;
        size = 0;
    }
    public Object getFirst() {
        if (first == null)
            throw new NoSuchElementException();
        return first.data;
    }
    public Object removeFirst() {
        if (first == null)
            throw new NoSuchElementException();
        Object element = first.data;
        first = first.next;
        size--;
        return element;
    }
    public void addFirst(Object element) {
        Node newNode = new Node();
        newNode.data = element;
        newNode.next = first;
        size++;
        first = newNode;
    }
    public void addLast(Object element) {
        while (iterator.hasNext()) {
            iterator.next();
            if (!iterator.hasNext()) {
                iterator.next();
                iterator.set(element);
                size++;
            }
        }
    }
    public int getSize() {
        return size;
    }
}
