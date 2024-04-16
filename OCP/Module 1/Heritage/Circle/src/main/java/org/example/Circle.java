package org.example;

public class Circle extends TwoDShape{
    private double r;
    private final double pi = Math.PI;

    public double getR() {
        return r;
    }

    public double getPi() {
        return pi;
    }

    public Circle(double r) {
        super(0, 0);
        this.r = r;
    }

     protected double area() {
        return Math.pow(r,2) * pi;
    }
}
