package com.rc.Lab8;

 public class Parallelepiped implements GeometricBody {
     private double length, width, height;

     Parallelepiped (double length, double width, double height){
         this.height = height;
         this.length = length;
         this.width = width;
     }

     @Override
     public double getSurface() {
         return 2*(width*length + width*height + length*height);
     }

     @Override
     public double getVolume() {
         return length*width*height;
     }
 }
