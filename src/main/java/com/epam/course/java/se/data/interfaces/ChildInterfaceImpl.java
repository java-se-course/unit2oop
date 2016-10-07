package com.epam.course.java.se.data.interfaces;

public class ChildInterfaceImpl implements ChildInterface {
    @Override
    public int getInt() {
        return 0;
    }

    @Override
    public String info() {
        return "ChildInterfaceImpl";
    }

    public String info2() {
        return "info2";
    }

    @Override
    public String conflict() {
        return "conflict";
    }
}
