package com.swt.lab.logarithm;

import com.swt.lab.util.Function;

public class Log implements Function {
    private final Ln ln;
    private int base = 1;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public Log(Ln ln) {
        this.ln = ln;
    }

    public double calculate(double x, int base) {
        setBase(base);
        return calculate(x);
    }

    @Override
    public double calculate(double x) {
        return ln.calculate(x) / ln.calculate(base);
    }
}
