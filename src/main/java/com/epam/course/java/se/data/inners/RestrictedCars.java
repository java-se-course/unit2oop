package com.epam.course.java.se.data.inners;

import com.epam.course.java.se.data.generics.Car;
import com.epam.course.java.se.data.generics.Movable;

public class RestrictedCars implements Garage {
    private final String forbidden;

    public RestrictedCars(String forbidden) {
        this.forbidden = forbidden;
    }

    public class RestrictedCar extends Car {
        public final static int i = 13;

        @Override
        public String move(String position) {
            if (forbidden.equals(position)) {
                return "Can't move to " + forbidden + ".";
            }
            return super.move(position);
        }
    }

    @Override
    public Movable getMovable() {
//        class Tmp implements Movable {
//            @Override
//            public String move(String position) {
//                if (forbidden.equals(position)) {
//                    return "Can't move to " + forbidden + ".";
//                }
//                return "Car moved to position " + position;;
//            }
//        }
//
//        return new Tmp();

        return new Movable() {
            @Override
            public String move(String position) {
                System.out.println(this.getClass().getName());
                System.out.println(RestrictedCars.this.getClass().getName());
                if (forbidden.equals(position)) {
                    return "Can't move to " + forbidden + ".";
                }
                return "Car moved to position " + position;
            }
        };

//        return position -> {
//            if (forbidden.equals(position)) {
//                return "Can't move to " + forbidden + ".";
//            }
//            return "Car moved to position " + position;
//        };
    }
}
