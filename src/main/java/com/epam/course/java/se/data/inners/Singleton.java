package com.epam.course.java.se.data.inners;

public class Singleton {

    private Singleton() {
    }

    private static class Wrapper {
        private final static Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return Wrapper.instance;
    }
}
