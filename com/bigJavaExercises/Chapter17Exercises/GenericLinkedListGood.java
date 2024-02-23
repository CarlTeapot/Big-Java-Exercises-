package com.bigJavaExercises.Chapter17Exercises;

import java.util.NoSuchElementException;

public class GenericLinkedListGood<T> {
    public Node first;
    public Node last;
    public int size;
    public Node position;
    public Node previous;
    public int iteratorPos;

    public GenericLinkedListGood() {
        first = null;
        size = 0;
        position = null;
        previous = null;
        iteratorPos = 0;
    }

    class Node {
        public T data;
        public Node next;
    }
    public T getFirst() {
        if (first == null)
            throw new NoSuchElementException();
        return first.data;
    }
    public T removeFirst() {
        if (first == null)
            throw new NoSuchElementException();
        T element = first.data;
        first = first.next;
        size--;
        return element;
    }
    public void addFirst(T element) {
        Node newNode = new Node();
        newNode.data = element;
        newNode.next = first;
        size++;
        first = newNode;
        position = first;
    }
    public void addLast(T element) {
        while (hasNext()) {
            next();
            if (!hasNext()) {
                next();
                set(element);
                size++;
            }
        }
    }
    public int getSize() {
        return size;
    }

    /**
     * Moves the iterator past the next element.
     *
     * @return the traversed element
     */
    public boolean hasNext() {
        return position != null;
    }


    public T next() {
        if (hasNext()){
            T data = position.data;
            position = position.next;
            return data;
        }
        return null;
    }


    public boolean hasPrevious() {
        if (position == null)
            return first != null;
        else
            return previous != null;
    }

    public T previous() {
        if (!hasPrevious())
            throw new NoSuchElementException();
        previous = position; // Remember for remove
        if (position == null) {
            position = first;
            iteratorPos = 0;
        }
        else
            position = previous;
        iteratorPos--;
        return previous.data;
    }
    public T getPositionData() {
        return position.data;
    }
    public boolean contains(T obj) {
        resetPosition();
        boolean zura = false;
        for (int i = 0; i < size; i++) {
            if (position.data == obj)
                zura = true;
            next();
        }
        resetPosition();
        return zura;
    }
    public int previousIndex() {
        return 0;
    }
    private void resetPosition() {
        position = first;
        previous = first;
    }
    public int getPosition() {
        return iteratorPos;
    }

    public void remove() {
        if (previous == position)
            throw new IllegalStateException();
        if (position == first) {
            removeFirst();
        } else {
            previous.next = position.next;
        }
        position = previous;
    }
    public void add(T element) {
        if (position == null) {
            addFirst(element);
            position = first;
        } else {
            Node newNode = new Node();
            newNode.data = element;
            newNode.next = position.next;
            position.next = newNode;
            position = newNode;
            size++;
        }
        previous = position;
    }

    public void set(T element) {
        if (position == null)
            throw new NoSuchElementException();
        position.data = element;
    }
    public String toString(){
        String xd = "[ ";
        resetPosition();
      for (int i = 0; i < size; i++) {
            xd = xd + getPositionData().toString() +" ";
            next();
        }
        xd = xd + " ]";
        return xd;
    }
}
