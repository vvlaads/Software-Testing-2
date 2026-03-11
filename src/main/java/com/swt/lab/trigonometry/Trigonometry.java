package com.swt.lab.trigonometry;

import static java.lang.Math.sqrt;

public class Trigonometry {
    public static double sin(double x) {
        return x;
    }

    public static double cos(double x) {
        return sqrt(1 - sin(x) * sin(x));
    }

    public static double tan(double x) {
        return sin(x) / cos(x);
    }

    public static double cot(double x) {
        return cos(x) / sin(x);
    }

    public static double sec(double x) {
        return 1 / cos(x);
    }

    public static double csc(double x) {
        return 1 / sin(x);
    }
}
