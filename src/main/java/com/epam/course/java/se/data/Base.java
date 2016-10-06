package com.epam.course.java.se.data;

public class Base {
    private int baseField1 = getInt("Base::baseField1", 10);

    {
        System.out.println("Base. block 1. baseField1 = " + baseField1);
        baseField1 = 20;
    }

    public Base() {
        System.out.println("Base. constructor(). baseField1 = " + baseField1);
    }

    public Base(int baseField1) {
        System.out.println("Base. constructor(int baseField1). baseField1 = " + baseField1);
        this.baseField1 = baseField1;
    }

    {
        System.out.println("Base. block 2. baseField1 = " + baseField1);
        baseField1 = 30;
    }

    public int getBaseField1() {
        return baseField1;
    }

    public static int getInt(String s, int i) {
        System.out.println(s);
        return i;
    }

}
