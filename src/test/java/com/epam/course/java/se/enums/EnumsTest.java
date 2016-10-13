package com.epam.course.java.se.enums;

import com.epam.course.java.se.data.enums.Direction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnumsTest {
    private String toString(Direction direction) {
        return direction.toString();
/*        switch (direction) {
            case EAST:
                return "EAST";
            case NORTH:
                return "NOTH";
            case SOUTH:
                return "SOUTH";
            case WEST:
                return "WEST";
            default:
                return "Unexpected";
        }*/

//        if (direction == Direction.NORTH) {
//            return "NORTH";
//        } else if (direction == Direction.SOUTH) {
//            return "SOUTH";
//        } else if (direction == Direction.EAST) {
//            return "EAST";
//        } else if (direction == Direction.WEST) {
//            return "WEST";
//        } else if (direction == null) {
//            return "null";
//        } else {
//            throw new RuntimeException("Unexpected value");
//        }
    }

    @Test
    public void test() {
        assertEquals("EAST", toString(Direction.EAST));
        assertEquals(Direction.NORTH, Direction.valueOf("NORTH"));
        for(Direction direction: Direction.values()) {
            System.out.println(direction);
        }
    }


    @Test
    public void methods() {
        Direction.NORTH.opposite();
    }







}
