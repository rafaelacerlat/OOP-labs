package com.rc.Lab2.Task2;

public class Task2 {
    public static void main(String[] args) {

        // a queue with no parameter
        Queue q1 = new Queue();
        q1.push(20);
        q1.push(30);
        q1.push(40);

        q1.pop();

        q1.printQueue();

        // a queue with parameter (capacity)
        Queue q2 = new Queue(5);

        q2.push(8);
        q2.push(9);
        q2.push(10);

        q2.pop();

        q2.printQueue();

    }
}
