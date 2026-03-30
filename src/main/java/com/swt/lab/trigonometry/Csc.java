package com.swt.lab.trigonometry;

import static java.lang.Math.PI;

public class Csc {
    private final Sin sin;

    public Csc(Sin sin) {
        this.sin = sin;
    }

    public double calculate(double x) {
        double EPS = 1e-10;
        if (x % PI < EPS) {
            throw new IllegalArgumentException("Csc is not defined for the selected argument");
        }
        return 1 / sin.calculate(x);
    }
}
