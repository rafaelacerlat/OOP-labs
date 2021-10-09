package com.rc.Lab2.Task1;

import javafx.scene.layout.HBox;

public class Task1 {
    public static void main(String[] args) {
        Box object1 = new Box ();
        Box object2 = new Box(200);
        Box object3 = new Box(350.55,145.87,200.5);

        System.out.println("The surface area of the box is: " + surfaceArea(object3) + ".");
        System.out.println("The volume of the box is: " + boxVolume(object3) + ".");
    }

    static double surfaceArea ( Box object ) {
        return object.width * object.depth;
    }

    static double boxVolume ( Box object ) {
        return object.height * object.width * object.depth;
    }


}
