package com.swt.lab.logarithm;

public class Logarithm {
    public static double ln(double x) {
        return x;
    }

    public static double log(double x, double base) {
        return ln(x) / ln(base);
    }
}
