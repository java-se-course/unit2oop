package com.epam.course.java.se.data;

public class Base {

    private final int baseField1 = getInt("Base::baseField1", 10);

    public int getBaseField1() {
        return baseField1;
    }

    public static int getInt(String s, int i) {
        System.out.println(s);
        return i;
    }

}
