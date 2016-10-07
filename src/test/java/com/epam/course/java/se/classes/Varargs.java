package com.epam.course.java.se.classes;

import org.junit.Test;

public class Varargs {

    private static void varargs(int... ints) {
        System.out.println("Varargs, length = " + ints.length);
    }

    private static void varargs(int i1, int... ints) {
        System.out.println("i1, i2");

    }

    @Test
    public void va(){
        varargs(new int[]{1});
    }

    @Test
    public void test() {
        final String format = String.format("%s - %s = %s", new Object[]{5, 3, 2});
        System.out.println(format);
    }
}
