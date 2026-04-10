package com.swt.lab.trigonometry;

import com.swt.lab.util.Function;

public class Tan implements Function {
    private final Sin sin;
    private final Cos cos;

    public Tan(Sin sin, Cos cos) {
        this.sin = sin;
        this.cos = cos;
    }

    public double calculate(double x) {
        return sin.calculate(x) / cos.calculate(x);
    }
}
