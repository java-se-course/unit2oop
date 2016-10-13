package com.epam.course.java.se.data.enums;

public enum Direction implements ToDegree {
    NORTH(0) {
        public Direction opposite() {
            return SOUTH;
        }
    },
    SOUTH(180){
        public Direction opposite() {
            return SOUTH;
        }
    },
    EAST(90){
        public Direction opposite() {
            return SOUTH;
        }
    },
    WEST(270){
        public Direction opposite() {
            return SOUTH;
        }
    }   ;

    private final int degree;

    Direction(int degree) {
        this.degree = degree;
    }

    public abstract Direction opposite();

    @Override
    public int toDegree() {
        return degree;
    }
}
