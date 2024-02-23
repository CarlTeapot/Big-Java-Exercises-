package com.bigJavaExercises.Chapter15Exercises;

public class InsertionSorterListTester {
    public static void main(String[] args) {
        InsertionSorterList list = new InsertionSorterList();
        list.add(5);
        list.add(20);
        list.add(4);
        list.add(3);
        list.add(30);
        System.out.println("Linked List before Sorting..");
        list.printlist(list.head);
        list.insertionSort(list.head);
        System.out.println("\nLinkedList After sorting");
        list.printlist(list.head);
    }
}

