package com.swt.lab.trigonometry;

import com.swt.lab.util.Function;

public class Cos implements Function {
    private final Sin sin;

    public Cos(Sin sin) {
        this.sin = sin;
    }

    public double calculate(double x) {
        return sin.calculate(Math.PI / 2 - x);
    }
}
