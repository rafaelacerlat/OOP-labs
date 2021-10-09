package com.rc.Lab2.Task2;

import java.util.ArrayList;

// A class to represent a queue
public class Queue {
    ArrayList<Integer> arr; // array to store queue elements
    int front;      // front points to the front element in the queue
    int rear;       // rear points to the last element in the queue
    int capacity;   // maximum capacity of the queue
    int count;      // current size of the queue

    // Constructor to initialize a queue
    public Queue(int size) {
        arr = new ArrayList<>(size);
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    public Queue() {
        arr = new ArrayList<>();
        capacity = Integer.MAX_VALUE;
        front = 0;
        rear = -1;
        count = 0;
    }

    // Utility function to extract an item from the queue
    public void pop() {

        System.out.println("Removing " + arr.get(front));

        front = (front + 1) % capacity;
        count--;
    }

    // Utility function to add an item to the queue
    public void push(int item) {
        // check for queue overflow
        if (isFull()) {
            System.out.println("Overflow\nProgram Terminated");
            System.exit(1);
        }

        System.out.println("Inserting " + item);

        rear = (rear + 1) % capacity;
        arr.add(rear, item);
        count++;
    }

    public void printQueue() {
        System.out.print("The queue elements are ");
        for (int i = 0; i < count; i++) {
            System.out.print(arr.get(i) + " ");
        }

        if (isEmpty()) {
            System.out.println("\n The queue is empty");
        }

        if (isFull()) {
            System.out.println("\n The queue is full");
        }

        if (capacity == Integer.MAX_VALUE) {
            System.out.println("\n The queue is never full");
        }
    }

    // Utility function to check if the queue is empty or not
    public Boolean isEmpty() {
        return (count == 0);
    }

    // Utility function to check if the queue is full or not
    public Boolean isFull() {
        return (count == capacity);
    }
}