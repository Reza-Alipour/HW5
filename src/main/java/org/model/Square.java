package org.model;

public class Square extends Shape {

    public Square(double x) {
        super(x);
    }

    @Override
    public double computeArea() {
        return getX() * getX();
    }
}
