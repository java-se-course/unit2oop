package com.epam.course.java.se.interfaces;

import com.epam.course.java.se.data.interfaces.Circle;
import com.epam.course.java.se.data.interfaces.Rectangle;
import com.epam.course.java.se.data.interfaces.Square;
import org.junit.Test;

public class SquareTest {
    private String calcSquare(Square square) {
        return square.getClass().getSimpleName() + " square = " + square.square();
    }

    @Test
    public void square(){
        final Square circle = new Circle(1);
        final Square rectangle = new Rectangle(1, 2);

        System.out.println("Circle square = " + circle.square());
        System.out.println("Rectangle square = " + rectangle.square());

        System.out.println(calcSquare(circle));
        System.out.println(calcSquare(rectangle));
    }
}
