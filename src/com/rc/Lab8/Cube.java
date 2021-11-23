package com.rc.Lab8;

 public class Cube implements GeometricBody{
     private double side;

     Cube (double side) {
         this.side = side;
     }

     @Override
     public double getSurface() {
         return 6*side*side;
     }

     @Override
     public double getVolume() {
         return side*side*side;
     }
 }
