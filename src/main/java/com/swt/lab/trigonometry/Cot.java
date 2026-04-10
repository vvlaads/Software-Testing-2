package com.swt.lab.trigonometry;

public class Cot {
    private final Sin sin;
    private final Cos cos;

    public Cot(Sin sin, Cos cos) {
        this.sin = sin;
        this.cos = cos;
    }

    public double calculate(double x) {
        return cos.calculate(x) / sin.calculate(x);
    }
}
