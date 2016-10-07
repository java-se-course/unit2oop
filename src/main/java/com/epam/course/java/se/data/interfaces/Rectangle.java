package com.epam.course.java.se.data.interfaces;

public class Rectangle implements Square {
    private final double x;
    private final double y;

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double square() {
        return x * y;
    }
}
