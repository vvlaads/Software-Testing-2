package com.swt.lab.trigonometry;

import static java.lang.Math.*;

public class TrigonometryFunctions {
    private final double EPS = 1e-10;
    private final Sin sin;
    private final Cos cos;

    public TrigonometryFunctions(Sin sin, Cos cos) {
        this.sin = sin;
        this.cos = cos;
    }

    public double tan(double x) {
        if (x % (PI / 2) < EPS && x % PI > EPS) {
            throw new IllegalArgumentException("Tan is not defined for the selected argument");
        }
        return sin.calculate(x) / cos.calculate(x);
    }

    public double cot(double x) {
        if (x % PI < EPS) {
            throw new IllegalArgumentException("Cot is not defined for the selected argument");
        }
        return cos.calculate(x) / sin.calculate(x);
    }

    public double sec(double x) {
        if (x % (PI / 2) < EPS && x % PI > EPS) {
            throw new IllegalArgumentException("Sec is not defined for the selected argument");
        }
        return 1 / cos.calculate(x);
    }

    public double csc(double x) {
        if (x % PI < EPS) {
            throw new IllegalArgumentException("Csc is not defined for the selected argument");
        }
        return 1 / sin.calculate(x);
    }
}
