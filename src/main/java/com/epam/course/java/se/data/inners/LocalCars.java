package com.epam.course.java.se.data.inners;

import com.epam.course.java.se.data.generics.Car;
import com.epam.course.java.se.data.generics.Movable;

public class LocalCars implements Garage {

    public static class LocalCar extends Car {
        public static int i = 666;

        @Override
        public String move(String position) {
            if ("EU".equals(position)) {
                return "Can't move to EU.";
            }
            return super.move(position);
        }
    }

    @Override
    public Movable getMovable() {
        return new LocalCar();
    }
}
