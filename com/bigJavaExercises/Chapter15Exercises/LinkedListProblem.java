package com.bigJavaExercises.Chapter15Exercises;

public class LinkedListProblem {
    public static void main(String[] args) {
        SinglyLinkedList.Node head = new SinglyLinkedList.Node(1);
        SinglyLinkedList linkedlist = new SinglyLinkedList(head);
        linkedlist.add(new SinglyLinkedList.Node("3"));
        linkedlist.add(new SinglyLinkedList.Node("2"));
        linkedlist.print();
        linkedlist.reverse();
        linkedlist.print();
    }

    static class SinglyLinkedList {
        static class Node {
            private Object data;
            private Node next;

            public Node(Object data) {
                this.data = data;
            }

            public Object data() {
                return data;
            }

            public Node next() {
                return next;
            }
        }

        private Node head;

        public SinglyLinkedList(Node head) {
            this.head = head;
        }

        public void add(Node node) {
            Node current = head;
            while (current != null) {
                if (current.next == null) {
                    current.next = node;
                    break;
                }
                current = current.next;
            }
        }

        public void print() {
            Node node = head;
            while (node != null) {
                System.out.print(node.data() + " ");
                node = node.next();
            }
            System.out.println("");
        }

        public void reverse() {
            Node pointer = head;
            Node previous = null, current = null;
            while (pointer != null) {
                current = pointer;
                pointer = pointer.next;
                current.next = previous;
                previous = current;
                head = current;
            }
        }
    }
}
