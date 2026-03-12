package com.swt.lab.trigonometry;

import static com.swt.lab.util.UtilMath.factorial;
import static java.lang.Math.*;

public class SinSeries implements Sin {

    @Override
    public double calculate(double x) {
        x = x % (2 * PI);
        if (x > PI) x -= 2 * PI;
        if (x < -PI) x += 2 * PI;
        if (x > PI / 2) x = PI - x;
        if (x < -PI / 2) x = PI + x;
        double s = 0;
        double term;
        int n = 0;

        double EPS = 1e-10;
        int MAX_ITERATIONS = 20;
        do {
            term = (pow(-1, n) * pow(x, 2 * n + 1)) / factorial(2 * n + 1);
            s += term;
            n++;
        } while (abs(term) > EPS && n < MAX_ITERATIONS);
        return s;
    }
}
