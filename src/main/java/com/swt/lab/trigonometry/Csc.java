package com.swt.lab.trigonometry;

import com.swt.lab.util.Function;

public class Csc implements Function {
    private final Sin sin;

    public Csc(Sin sin) {
        this.sin = sin;
    }

    public double calculate(double x) {
        return 1 / sin.calculate(x);
    }
}
