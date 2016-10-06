package com.epam.course.java.se.data;

public class Next extends Base {
    {
        System.out.println("Next block");
    }

    private int nextField = Base.getInt("Next::nextField", 100);

    public Next() {
        this(200, 300);
    }

    public Next(int baseField1, int nextField) {
        super(baseField1);
        this.nextField = nextField;
    }
}
