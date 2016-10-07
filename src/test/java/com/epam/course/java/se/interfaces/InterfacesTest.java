package com.epam.course.java.se.interfaces;

import com.epam.course.java.se.data.interfaces.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class InterfacesTest {

    @Test
    public void both() {
        final ChildInterface childInterface = new ChildInterfaceImpl();
        assertEquals(0, childInterface.getInt());
        assertEquals("ChildInterfaceImpl", childInterface.info());
        // childInterface.info2(); // Error
        final String conflict = childInterface.conflict();

        final BaseInterface1 baseInterface1 = childInterface;
        assertEquals("ChildInterfaceImpl", baseInterface1.info());
        //baseInterface1.getInt();

        final BaseInterface2 baseInterface2 = childInterface;
        final Object conflict2 = baseInterface2.conflict();
        //final String conflict2 = baseInterface2.conflict();

        final Object obj = childInterface;
        childInterface.hashCode();
        assertTrue(childInterface.equals(baseInterface1));
    }

    @Test
    public void internal() {
        final BaseInterface1.Internal internal = new InternalImpl();

        System.out.println(internal);
    }

}
