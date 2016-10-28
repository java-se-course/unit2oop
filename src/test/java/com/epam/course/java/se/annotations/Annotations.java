package com.epam.course.java.se.annotations;

import org.junit.Test;

public class Annotations {
    @Test(expected = UnsupportedOperationException.class)
    public void test() {
        throw new UnsupportedOperationException();
    }
}
