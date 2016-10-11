package com.epam.course.java.se.generics;

import com.epam.course.java.se.data.generics.*;
import org.junit.Test;

import java.util.ArrayList;
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

    private void addCars(final List<? super Car> carList) {
        carList.add(new Car());
        carList.add(new Car());
        carList.add(new BMV());
    }

    @Test
    public void add() {
        final List<Car> cars = new ArrayList<>();
        addCars(cars);

        final List<Movable> movableList = new ArrayList<>();
        addCars(movableList);

        final List<Device> deviceList = new ArrayList<>();
        addCars(deviceList);

        final List<Object> objectList = new ArrayList<>();
        addCars(objectList);

        final List<BMV> bmvList = new ArrayList<>();
//        addCars(bmvList);
    }

    private <T extends Movable> List<T> moveAndDuplicate(final List<T> movableList) {
        //moveAll(final List<? extends Movable> movableList)
        moveAll(movableList);

        final List<T> result = new ArrayList<>();
        result.addAll(movableList);
        result.addAll(movableList);

        return result;
    }

    @Test
    public void moveAndDup() {
        final List<Horse> horses = Arrays.asList(new Horse(), new Horse());

        final List<Horse> result = moveAndDuplicate(horses);

    }













}
