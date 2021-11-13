package com.rc.Lab7;

public class FigureController {

    static double getBiggestArea(Figure[] figures) {
        double biggestArea = 0;
        for (Figure figure : figures) {
            if (figure.getArea() > biggestArea) {
                biggestArea = figure.getArea();
            }
        }
        return biggestArea;
    }

    static double getBiggestPerimeter(Figure[] figures) {
        double biggestPerimeter = 0;
        for (Figure figure : figures) {
            if (figure.getPerimeter() > biggestPerimeter) {
                biggestPerimeter = figure.getPerimeter();
            }
        }
        return biggestPerimeter;
    }

}
