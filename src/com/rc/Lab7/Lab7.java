package com.rc.Lab7;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

public class Lab7 {
    public static void main(String[] args) {

        Figure Circle  = new Figure() {
            private double radius = 5.05;

            @Override
            double getArea() {
                return Math.PI*radius*radius;
            }

            @Override
            double getPerimeter() {
                return 2*Math.PI*radius;
            }

        };

        Figure[] figures = {
                new Square(6.3), new Triangle(5.05, 7.2, 4.33), new Rectangle(3.4, 1.2), Circle
        };

        for (Figure figure : figures) {
            System.out.println("Area: " + figure.getArea());
            System.out.println("Perimeter: " + figure.getPerimeter() + "\n");
        }

        System.out.println("The biggest area is " + FigureController.getBiggestArea(figures));
        System.out.println("The biggest perimeter is " + FigureController.getBiggestPerimeter(figures));


//        List<Figure> figures = new ArrayList<>();
//
//        figures.add(new Square(6.3));
//        figures.add(new Triangle(5.05, 7.2, 4.33));
//        figures.add(new Rectangle(3.4, 1.2));
//        figures.add(Circle);

    }


}
