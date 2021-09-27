package com.rc.Lab1.Task1;

public class Task1 {

    public static void main(String[] args) {
        Monitor monitor1 = new Monitor("M1", "white", "720p", 1280, 60);
        monitor1.resolution = "1080p";
        monitor1.height = 80;

        Monitor monitor2 = new Monitor("M2", "gray", "1080p", 920, 100);

        System.out.println(monitor1.equals(monitor2));


    }
}
