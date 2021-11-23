package com.rc.Lab8;


public class Lab8 {
    public static void main(String[] args) {
        GeometricBody[] gBodies = {
                new Cube(6.3), new Sphere(5.05), new Parallelepiped(3.4, 1.2, 2.55)
        };

        for (GeometricBody gBody : gBodies) {
            System.out.println("Surface Area: " + gBody.getSurface());
            System.out.println("Volume: " + gBody.getVolume() + "\n");
        }

        System.out.println("The biggest surface area is " + GeometricBodyController.getBiggestSurface(gBodies));
        System.out.println("The biggest volume is " + GeometricBodyController.getBiggestVolume(gBodies));

    }
}
