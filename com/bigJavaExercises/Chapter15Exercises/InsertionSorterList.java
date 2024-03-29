package com.bigJavaExercises.Chapter15Exercises;

import java.util.LinkedList;

public class InsertionSorterList {
    node head;
    node sorted;

    class node
    {
        int val;
        node next;

        public node(int val)
        {
            this.val = val;
        }
    }

    void add(int val)
    {
        /* allocate node */
        node newnode = new node(val);
        /* link the old list off the new node */
        newnode.next = head;
        /* move the head to point to the new node */
        head = newnode;
    }

    // function to sort a singly linked list using insertion sort
    void insertionSort(node headref)
    {
        // Initialize sorted linked list
        sorted = null;
        node current = headref;
        // Traverse the given linked list and insert every
        // node to sorted
        while (current != null)
        {
            // Store next for next iteration
            node next = current.next;
            // insert current in sorted linked list
            sortedInsert(current);
            // Update current
            current = next;
        }
        // Update head_ref to point to sorted linked list
        head = sorted;
    }

    /*
     * function to insert a new_node in a list. Note that
     * this function expects a pointer to head_ref as this
     * can modify the head of the input linked list
     * (similar to push())
     */
    void sortedInsert(node newnode)
    {
        /* Special case for the head end */
        if (sorted == null || sorted.val >= newnode.val)
        {
            newnode.next = sorted;
            sorted = newnode;
        }
        else
        {
            node current = sorted;
            /* Locate the node before the point of insertion */
            while (current.next != null && current.next.val < newnode.val)
            {
                current = current.next;
            }
            newnode.next = current.next;
            current.next = newnode;
        }
    }

    /* Function to print linked list */
    void printlist(node head)
    {
        while (head != null)
        {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
