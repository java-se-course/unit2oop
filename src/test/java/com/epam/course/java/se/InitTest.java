package com.epam.course.java.se;

import com.epam.course.java.se.data.Base;
import com.epam.course.java.se.data.Next;
import org.junit.Test;

public class InitTest {
    @Test
    public void init() {
        final Base base = new Next();
        System.out.println(base.getBaseField1());
    }
}
