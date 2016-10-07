package com.epam.course.java.se.data.interfaces;

public class Circle implements Square {
    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double square() {
        return Square.PI * r * r;
    }
}
