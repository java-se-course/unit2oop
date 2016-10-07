package com.epam.course.java.se.data.interfaces;

public interface BaseInterface1 {
    double PI = 3.14159265;

    String info();

    String conflict();

    interface Internal{}

    Internal getInternal();
}
