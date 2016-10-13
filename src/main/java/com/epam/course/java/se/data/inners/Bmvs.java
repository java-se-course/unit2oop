package com.epam.course.java.se.data.inners;

import com.epam.course.java.se.data.generics.BMV;
import com.epam.course.java.se.data.generics.Movable;

public class Bmvs implements Garage {
    @Override
    public Movable getMovable() {
        return new BMV();
    }
}
