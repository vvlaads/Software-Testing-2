package com.swt.lab.logarithm;

public class LogarithmFunctions {
    private final Ln ln;

    public LogarithmFunctions(Ln ln) {
        this.ln = ln;
    }

    public double log(double x, double base) {
        return ln.calculate(x) / ln.calculate(base);
    }
}
