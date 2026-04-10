package com.swt.lab.trigonometry;

public class Tan {
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
