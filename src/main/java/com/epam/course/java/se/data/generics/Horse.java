package com.epam.course.java.se.data.generics;

public class Horse implements Movable {
    @Override
    public String move(String position) {
        return "Horse goes to position " + position;
    }
}
