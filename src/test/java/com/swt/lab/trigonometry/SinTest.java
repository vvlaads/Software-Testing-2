package com.swt.lab.trigonometry;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SinTest {
    private final Sin sin = new Sin();

    @ParameterizedTest
    @CsvSource({
            "-3.14159265,0",
            "-2.09439510239,-0.866025403784",
            "-1.57079633,-1",
            "-1.0471975512,-0.866025403784",
            "0,0",
            "1.0471975512,0.866025403784",
            "1.57079633,1",
            "2.09439510239,0.866025403784",
            "3.14159265,0",
    })
    void testSin(double x, double expected) {
        assertEquals(expected, sin.calculate(x), 1e-8);
    }

    @ParameterizedTest
    @CsvSource({
            "0",
            "0.5",
            "1.0",
            "2.5",
            "-1.3",
            "10.0"
    })
    void testPeriodicity(double x) {
        double period = 2 * Math.PI;

        assertEquals(
                sin.calculate(x),
                sin.calculate(x + period),
                1e-8
        );

        assertEquals(
                sin.calculate(x),
                sin.calculate(x - period),
                1e-8
        );
    }
}
