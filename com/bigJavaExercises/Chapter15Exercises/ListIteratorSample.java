package com.bigJavaExercises.Chapter15Exercises;

import java.util.NoSuchElementException;

public class ListIteratorSample {
        public Node position;
        public Node previous;
        public int iteratorPos;
        public LinkedListSample list;
        public ListIteratorSample(LinkedListSample aList) {
            position = null;
            previous = null;
            iteratorPos = 0;
            list = aList;
        }

        /**
         * Moves the iterator past the next element.
         *
         * @return the traversed element
         */
        public Object next() {
            if (!hasNext())
                throw new NoSuchElementException();
            previous = position; // Remember for remove
            if (position == null) {
                position = list.first;
                iteratorPos = 0;
            }
            else {
                position = position.next;
                iteratorPos++;
            }
            return position.data;
        }

        public boolean hasPrevious() {
            if (position == null)
                return list.first != null;
            else
                return previous != null;
        }

        public Object previous() {
            if (!hasPrevious())
                throw new NoSuchElementException();
            previous = position; // Remember for remove
            if (position == null) {
                position = list.first;
                iteratorPos = 0;
            }
            else
                position = previous;
                iteratorPos--;
            return previous.data;
        }
        public Object getPositionData() {
            return position.data;
        }
        public boolean contains(Object obj) {
            resetPosition();
            boolean zura = false;
            for (int i = 0; i < list.size; i++) {
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
        public void resetPosition() {
            position = list.first;
        }
        public int getPosition() {
            return iteratorPos;
        }

        public void remove() {
            if (previous == position)
                throw new IllegalStateException();
            if (position == list.first) {
                list.removeFirst();
            } else {
                previous.next = position.next;
            }
            position = previous;
        }

        public boolean hasNext() {
            if (position.next == null) {
                throw new NoSuchElementException();
            }
            else
                return true;
        }

        public void add(Object element) {
            if (position == null) {
                list.addFirst(element);
                position = list.first;
            } else {
                Node newNode = new Node();
                newNode.data = element;
                newNode.next = position.next;
                position.next = newNode;
                position = newNode;
                list.size++;
            }
            previous = position;
        }

        public void set(Object element) {
            if (position == null)
                throw new NoSuchElementException();
            position.data = element;
        }
        public String toString() {
            String xd = "[ ";
            for (int i = 0; i < list.size; i++) {
                xd = xd + position.data.toString() + " ";
                next();
            }
            resetPosition();
            xd = xd + " ]";
            return xd;
    }
}

