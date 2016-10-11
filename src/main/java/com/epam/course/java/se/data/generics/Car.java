package com.epam.course.java.se.data.generics;

public class Car implements Movable, Device {
    @Override
    public String move(String position) {
        return "Car moved to position " + position;
    }
}
