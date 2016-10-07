package com.epam.course.java.se.classes;

import com.epam.course.java.se.data.classes.Base;
import com.epam.course.java.se.data.classes.Next;
import org.junit.Test;

public class InitTest {
    @Test
    public void init() throws CloneNotSupportedException {
        final Next next = new Next();
        final Base base = next;
        if (base instanceof Next) {
            Next next2 = (Next) base;
        }

        Object str = new String("");

        Next next3 = (Next)str;


        System.out.println(base.info());

    }
}
