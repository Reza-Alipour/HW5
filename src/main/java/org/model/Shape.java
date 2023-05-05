package org.model;

public abstract class Shape {
    private double x;

    public abstract double computeArea();

    public Shape(double x) {
        this.x = x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return this.x;
    }
}
