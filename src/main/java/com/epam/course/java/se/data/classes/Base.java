package com.epam.course.java.se.data.classes;

public abstract class Base {

    public abstract Object info();

    private int baseField1 = getInt("Base::baseField1", 10);

    private int x = 10;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Base{");
        sb.append("baseField1=").append(baseField1);
        sb.append(", x=").append(x);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Base base = (Base) o;

        if (baseField1 != base.baseField1) return false;
        return x == base.x;

    }

    @Override
    public int hashCode() {
        int result = baseField1;
        result = 31 * result + x;
        return result;
    }

    {
        System.out.println("Base. block 1. baseField1 = " + baseField1);
        baseField1 = 20;
    }

//    public Base() {
//        System.out.println("Base. constructor(). baseField1 = " + baseField1);
//    }

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
