package com.swt.lab.trigonometry;

import static java.lang.Math.PI;

public class Sec {
    private final Cos cos;

    public Sec(Cos cos) {
        this.cos = cos;
    }

    public double calculate(double x) {
        double EPS = 1e-10;
        if (x % (PI / 2) < EPS && x % PI > EPS) {
            throw new IllegalArgumentException("Sec is not defined for the selected argument");
        }
        return 1 / cos.calculate(x);
    }
}
