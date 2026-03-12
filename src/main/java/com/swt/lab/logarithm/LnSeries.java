package com.swt.lab.logarithm;

import static java.lang.Math.*;

public class LnSeries implements Ln {
    private final double EPS = 1e-10;
    private final int MAX_ITERATIONS = 100;
    private final double LN_SERIES_THRESHOLD = 1.5;

    @Override
    public double calculate(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Ln is not defined for the selected argument");
        }

        double s = 0;

        int k = 0;
        while (x > LN_SERIES_THRESHOLD) {
            x /= LN_SERIES_THRESHOLD;
            k++;
        }
        if (k > 0) {
            s += k * calculate(LN_SERIES_THRESHOLD);
        }

        x -= 1;
        double term;
        int n = 1;
        do {
            term = pow(-1, n - 1) * pow(x, n) / n;
            s += term;
            n++;
        } while (abs(term) > EPS && n < MAX_ITERATIONS);
        return s;
    }
}
