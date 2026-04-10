package com.swt.lab;

import com.swt.lab.logarithm.Ln;
import com.swt.lab.logarithm.Log;
import com.swt.lab.trigonometry.*;
import com.swt.lab.util.Function;

public class MyFunction implements Function {
    private final Sin sin;
    private final Cos cos;
    private final Tan tan;
    private final Cot cot;
    private final Sec sec;
    private final Csc csc;
    private final Ln ln;
    private final Log log;

    public MyFunction(Sin sin, Cos cos, Tan tan, Cot cot, Sec sec, Csc csc, Ln ln, Log log) {
        this.sin = sin;
        this.cos = cos;
        this.tan = tan;
        this.cot = cot;
        this.sec = sec;
        this.csc = csc;
        this.ln = ln;
        this.log = log;
    }

    private double sin(double x) {
        return sin.calculate(x);
    }

    private double cos(double x) {
        return cos.calculate(x);
    }

    private double tan(double x) {
        return tan.calculate(x);
    }

    private double cot(double x) {
        return cot.calculate(x);
    }

    private double sec(double x) {
        return sec.calculate(x);
    }

    private double csc(double x) {
        return csc.calculate(x);
    }

    private double ln(double x) {
        return ln.calculate(x);
    }

    private double log_3(double x) {
        return log.calculate(x, 3);
    }

    private double log_10(double x) {
        return log.calculate(x, 10);
    }

    public double calculate(double x) {
        double result;
        if (x <= 0) {
            result = ((((((((((((Math.pow(cot(x), 2)) - sin(x)) + Math.pow(csc(x), 3)) / (tan(x) - cot(x))) * csc(x)) + cot(x)) / Math.pow(sec(x), 3)) + (csc(x) / (sec(x) / (sin(x) / tan(x))))) / sec(x)) * (((cot(x) * tan(x)) + (tan(x) + cos(x))) + ((((sin(x) * sin(x)) + cos(x)) / (tan(x) / tan(x))) * Math.pow(csc(x), 2)))) - sec(x)) * ((tan(x) + (((cot(x) + (sec(x) + cot(x))) / Math.pow(cot(x), 3)) / (cos(x) * sin(x)))) - sec(x)));
        } else {
            result = ((Math.pow((Math.pow((log_10(x) - log_3(x)), 2)), 3) * log_10(x)) + (((log_3(x) + Math.pow(ln(x), 3)) / Math.pow(log_10(x), 3)) * log_3(x)));
        }
        return result;
    }
}
