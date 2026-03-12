package com.swt.lab.trigonometry;

public class CosSeries implements Cos {
    private final Sin sin;

    public CosSeries(Sin sin) {
        this.sin = sin;
    }

    @Override
    public double calculate(double x) {
        return sin.calculate(Math.PI / 2 - x);
    }
}
