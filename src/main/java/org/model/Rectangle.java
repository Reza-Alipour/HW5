package org.model;

public class Rectangle extends Shape {
    private double y;

    public Rectangle(double x, double y) {
        super(x);
        this.y = y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double computeArea() {
        return this.getX() * y;
    }
}
