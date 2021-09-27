package com.rc.Lab1.Task2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        Student student1 = new Student("Beth", 19, 10);
        Student student2 = new Student("John", 20, 8);
        Student student3 = new Student("Emma", 20, 8);
        Student student4 = new Student("Sam", 19, 10);
        Student student5 = new Student("Jane", 21, 9);
        Student student6 = new Student("Mike", 20, 9);
        Student student7 = new Student("Kate", 19, 8);

        University university1 = new University("UNAGE", 1860, new Student[]{student1, student2, student3});
        University university2 = new University("UTM", 1964, new Student[]{student4, student5});
        University university3 = new University("UAIC", 1860, new Student[]{student6, student7});

        System.out.println(averageMark(university1));

        System.out.println(totalAverageMark(averageMark(university1), averageMark(university2), averageMark(university3)));


    }

    static double averageMark(University university) {
        double sum = 0;
        Object[] marks = Arrays.stream(university.students).map(s -> s.mark).toArray();
        for (Object mark : marks) {
            sum += (int) mark;
        }
        return sum / marks.length;
    }

    static double totalAverageMark(double ... universityAverageMarks) {
        double sum = 0;
        for (double mark : universityAverageMarks) {
            sum += mark;
        }
        return sum / universityAverageMarks.length;
    }
}
