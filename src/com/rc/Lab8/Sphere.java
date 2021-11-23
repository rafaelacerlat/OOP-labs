package com.rc.Lab8;
import java.lang.Math;

 public class Sphere implements GeometricBody{
  private double radius;

  Sphere (double radius) {
   this.radius = radius;
  }


  @Override
  public double getSurface() {
   return 4*Math.PI*radius;
  }

  @Override
  public double getVolume() {
   return (4*Math.PI*radius)/3;
  }
 }
