package com.epam.course.java.se.interfaces;

import com.epam.course.java.se.data.interfaces.Complex;
import com.epam.course.java.se.data.interfaces.RealComparator;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class CompareTest {

    @Test
    public void comparable() {
        final Complex[] complices = {
                new Complex(5, 5),
                new Complex(0, 2),
                new Complex(1, 0),
                new Complex(6, 5),
                new Complex(0, 0),
                new Complex(4, 7),
        };

        Arrays.sort(complices);

        for(Complex complex : complices) {
            System.out.println(complex);
        }


        final Comparator<Complex> comparator = new RealComparator();
//        Arrays.sort(complices, comparator);
        Arrays.sort(complices, Complex.BY_REAL);

        System.out.println("By real");

        for(Complex complex : complices) {
            System.out.println(complex);
        }
    }

    @Test
    public void tree() {
        final Set<Complex> complices = new TreeSet<>();
        complices.add(new Complex(5, 5));
        complices.add(new Complex(5, 5));
        complices.add(new Complex(0, 2));
        complices.add(new Complex(0, 2));
        complices.add(new Complex(1, 0));
        complices.add(new Complex(6, 5));
        complices.add(new Complex(6, 5));
        complices.add(new Complex(0, 0));
        complices.add(new Complex(4, 7));
        complices.add(new Complex(4, 7));

        for (Complex complex: complices) {
            System.out.println(complex);
        }
    }

    @Test
    public void tree2() {
        final Set<Complex> complices = new TreeSet<>(Complex.BY_REAL);
        complices.add(new Complex(5, 5));
        complices.add(new Complex(5, 4));
        complices.add(new Complex(0, 2));
        complices.add(new Complex(0, 2));
        complices.add(new Complex(1, 0));
        complices.add(new Complex(1, 6));
        complices.add(new Complex(6, 5));
        complices.add(new Complex(6, 5));
        complices.add(new Complex(0, 0));
        complices.add(new Complex(4, 7));
        complices.add(new Complex(4, 7));

        for (Complex complex: complices) {
            System.out.println(complex);
        }
    }






















}
