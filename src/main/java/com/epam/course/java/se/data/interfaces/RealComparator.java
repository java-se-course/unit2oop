package com.epam.course.java.se.data.interfaces;

import java.util.Comparator;

public class RealComparator implements Comparator<Complex> {
    @Override
    public int compare(Complex o1, Complex o2) {
        return Integer.compare(o1.getRe(), o2.getRe());
    }
}
