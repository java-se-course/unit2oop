package com.epam.course.java.se.data.interfaces;

import java.util.Comparator;

public class Complex implements Comparable<Complex> {
    private final int re;
    private final int im;

    public Complex(int re, int im) {
        this.re = re;
        this.im = im;
    }

    public int getRe() {
        return re;
    }

    public int getIm() {
        return im;
    }

    public final double getAbs() {
        return Math.sqrt(0.0 + re * re + im * im);
    }

    @Override
    public int compareTo(Complex other) {
        return Double.compare(this.getAbs(), other.getAbs());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Complex{");
        sb.append("re=").append(re);
        sb.append(", im=").append(im);
        sb.append('}');
        return sb.toString();
    }

    public static final Comparator<Complex> BY_REAL = new RealComparator();

    public static class RealComparator implements Comparator<Complex> {
        @Override
        public int compare(Complex o1, Complex o2) {
            return Integer.compare(o1.getRe(), o2.getRe());
        }
    }
}
