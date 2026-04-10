package com.swt.lab.trigonometry;

import com.swt.lab.util.Function;

public class Sec implements Function {
    private final Cos cos;

    public Sec(Cos cos) {
        this.cos = cos;
    }

    public double calculate(double x) {
        return 1 / cos.calculate(x);
    }
}
