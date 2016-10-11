package com.epam.course.java.se.data.generics;

import com.epam.course.java.se.data.interfaces.BaseInterface1;

public class Box<T extends BaseInterface1> {
    private T t;

    public Box(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public String getInfo() {
        return t.info();
    }
}
