package com.swt.lab.trigonometry;

import static java.lang.Math.PI;

public class Tan {
    private final Sin sin;
    private final Cos cos;

    public Tan(Sin sin, Cos cos) {
        this.sin = sin;
        this.cos = cos;
    }

    public double calculate(double x) {
        double EPS = 1e-10;
        if (x % (PI / 2) < EPS && x % PI > EPS) {
            throw new IllegalArgumentException("Tan is not defined for the selected argument");
        }
        return sin.calculate(x) / cos.calculate(x);
    }
}
