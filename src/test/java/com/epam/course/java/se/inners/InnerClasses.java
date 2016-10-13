package com.epam.course.java.se.inners;

import com.epam.course.java.se.data.generics.Car;
import com.epam.course.java.se.data.inners.LocalCars;
import com.epam.course.java.se.data.inners.RestrictedCars;
import org.junit.Test;

public class InnerClasses {
    @Test
    public void localCares() {
        final LocalCars.LocalCar localCar = new LocalCars.LocalCar();


        System.out.println(LocalCars.LocalCar.i);
        System.out.println(localCar.move("EU"));
        System.out.println(localCar.move("Moscow"));
    }

    @Test
    public void restricted() {
        final RestrictedCars notUs = new RestrictedCars("US");
        final RestrictedCars notDe = new RestrictedCars("DE");

        notUs.new RestrictedCar();
        notDe.new RestrictedCar();

        System.out.println(notUs.getMovable().move("US"));
        System.out.println(notUs.getMovable().move("DE"));

        System.out.println(notDe.getMovable().move("US"));
        System.out.println(notDe.getMovable().move("DE"));
    }

    @Test
    public void inherit() {
        final RestrictedCars notUs = new RestrictedCars("US");
        final RestrictedCars notDe = new RestrictedCars("DE");

        System.out.println(notUs.getMovable().getClass() == notDe.getMovable().getClass());
        System.out.println(notUs.getMovable().getClass().getName());

        new Car() {
            public void newMethod() {
                System.out.println("new method");
            }
        }.newMethod();
    }
}
