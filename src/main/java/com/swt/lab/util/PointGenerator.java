package com.swt.lab.util;

import java.util.HashMap;
import java.util.Map;

public class PointGenerator {
    public Map<Double, Double> generate(double a, double b, double step, Function function) {
        HashMap<Double, Double> results = new HashMap<>();
        for (double x = a; x <= b; x += step) {
            results.put(x, function.calculate(x));
        }
        return results;
    }
}
