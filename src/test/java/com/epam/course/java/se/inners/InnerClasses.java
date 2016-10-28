package com.epam.course.java.se.inners;

import com.epam.course.java.se.data.generics.Car;
import com.epam.course.java.se.data.inners.LocalCars;
import com.epam.course.java.se.data.inners.RestrictedCars;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.concurrent.ThreadLocalRandom;

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

        System.out.println(context);
    }

    private String context = null;

    @Before
    public void before() {
        context = "Context " + ThreadLocalRandom.current().nextInt();
    }

    @After
    public void after() {
        context = null;
    }

    @Test
    public void inherit() {
        System.out.println(context);
        final RestrictedCars notUs = new RestrictedCars("US");
        final RestrictedCars notDe = new RestrictedCars("DE");

        System.out.println(notUs.getMovable().getClass() == notDe.getMovable().getClass());
        System.out.println(notUs.getMovable().getClass().getName());

        new Car() {
            //            @Override
            public String movе(String position) {
                return super.move(position) + "!";
            }

            public void newMethod() {
                System.out.println("new method");
            }
        }.newMethod();

        final Class<InnerClasses> clazz = InnerClasses.class;

        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println(method.getName());
            for (Annotation annotation : method.getDeclaredAnnotations()) {
                System.out.println(annotation);
            }
        }
    }

    public void withoutAnnotations() {}
}
