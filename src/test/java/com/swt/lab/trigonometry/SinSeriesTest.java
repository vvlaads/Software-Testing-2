package com.swt.lab.trigonometry;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SinSeriesTest {
    private final SinSeries sin = new SinSeries();

    @ParameterizedTest
    @CsvSource({
            "0,0",
            "1.57079632679,1",
            "3.14159265359,0",
            "-1.57079632679,-1"
    })
    void testSin(double x, double expected) {
        assertEquals(expected, sin.calculate(x), 1e-10);
    }
}
