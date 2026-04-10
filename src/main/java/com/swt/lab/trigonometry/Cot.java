package com.swt.lab.trigonometry;

import com.swt.lab.util.Function;

public class Cot implements Function {
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
