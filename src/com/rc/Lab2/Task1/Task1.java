package com.rc.Lab2.Task1;

import javafx.scene.layout.HBox;

public class Task1 {
    public static void main(String[] args) {
        Box object1 = new Box ();
        Box object2 = new Box(200);
        Box object3 = new Box(350.55,145.87,200.5);

        System.out.println("The surface area of the box is: " + object3.surfaceArea() + ".");
        System.out.println("The volume of the box is: " + object3.boxVolume() + ".");
    }

}
