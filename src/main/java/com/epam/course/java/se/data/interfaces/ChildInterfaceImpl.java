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

    @Override
    public Internal getInternal() {
        return new InternalImpl();
    }

    public double getPi() {
        return BaseInterface1.PI * BaseInterface2.PI;
    }
}
