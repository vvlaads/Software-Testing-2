package com.swt.lab.trigonometry;

import static java.lang.Math.PI;

public class Cot {
    private final Sin sin;
    private final Cos cos;

    public Cot(Sin sin, Cos cos) {
        this.sin = sin;
        this.cos = cos;
    }

    public double calculate(double x) {
        double EPS = 1e-10;
        if (x % PI < EPS) {
            throw new IllegalArgumentException("Cot is not defined for the selected argument");
        }
        return cos.calculate(x) / sin.calculate(x);
    }
}
