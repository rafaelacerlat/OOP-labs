package com.rc.Lab7;
import static java.lang.Math.sqrt;

class Square extends Figure{
    private double side;

    Square (double side) {
        this.side = side;
    }

    @Override
    double getArea() {
        return side*side;
    }

    @Override
    double getPerimeter() {
        return 4*side;
    }
}
