package com.rc.Lab2.Task1;

public class Box {
    double height, width, depth;

    public Box(double height, double width, double depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public Box(){
        this.height = 1;
        this.width = 1;
        this.depth = 1;
    }

    public Box(double param){
        this.height = param;
        this.width = param;
        this.depth = param;
    }
}
