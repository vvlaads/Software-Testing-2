package com.swt.lab.logarithm;

public class LogarithmFunctions {
    private Ln ln;

    public LogarithmFunctions(Ln ln) {
        this.ln = ln;
    }

    public double log(double x, double base) {
        return ln.calculate(x) / ln.calculate(base);
    }

    public double log5(double x) {
        return log(x, 5);
    }
}
