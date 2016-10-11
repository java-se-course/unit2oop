package com.epam.course.java.se.generics;

import com.epam.course.java.se.data.generics.Car;
import com.epam.course.java.se.data.generics.Horse;
import com.epam.course.java.se.data.generics.Movable;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MovableTest {

    private void moveAll(final List<? extends Movable> movableList) {
        for (Movable movable: movableList) {
            System.out.println(movable.move("Home"));
        }
//        movableList.add(movableList.get(0));
    }

    @Test
    public void move() {
        final List<Horse> horses = Arrays.asList(new Horse(), new Horse());

        moveAll(horses);
    }

}
