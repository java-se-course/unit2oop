package com.epam.course.java.se.generics;

import com.epam.course.java.se.data.generics.Message;
import org.junit.Test;

public class GenericsTest {
    @Test
    public void var() {
        final Message<Integer, Object> initial = new Message<>(1, "name");
        //final Message<Integer, String> message = initial;
        initial.setName("str");
        initial.setName(new Object());
        //message.setName(new Object());
        //final String name = message.getName();
    }

    @Test
    public void className() {
        final Message<Integer, Object> message = new Message<>(1, new Object());
        System.out.println(message.getNameClassName());
        message.setName("str");
        System.out.println(message.getNameClassName());

        final Object obj = "str";
        System.out.println(obj.getClass().getSimpleName());
    }

    @Test
    public void obj() {
        final Message<Integer, Object> initial = new Message<>(1, 3d);
        Message temp = initial;
        Message<Integer, String> message = temp;

        System.out.println("Before");
        final String name = message.getName();
    }
}
