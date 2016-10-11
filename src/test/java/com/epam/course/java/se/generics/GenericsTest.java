package com.epam.course.java.se.generics;

import com.epam.course.java.se.data.generics.Box;
import com.epam.course.java.se.data.generics.Message;
import com.epam.course.java.se.data.interfaces.BaseInterface1;
import com.epam.course.java.se.data.interfaces.BaseInterface2;
import com.epam.course.java.se.data.interfaces.ChildInterface;
import com.epam.course.java.se.data.interfaces.ChildInterfaceImpl;
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

    @Test
    public void ext() {
        final ChildInterfaceImpl childInterface = new ChildInterfaceImpl();

        final Box<BaseInterface1> box = new Box<>(childInterface);

        final BaseInterface1 base = childInterface;

        box.setT(childInterface);


    }











}
