package com.swt.lab.trigonometry;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SinTest {
    private final Sin sin = new Sin();

    @ParameterizedTest
    @CsvSource({
            "0,0",
            "1.57079633,1",
            "-1.57079633,-1",
            "3.14159265,0",
            "-3.14159265,0",
            "1.0471975512,0.866025403784",
            "2.09439510239,0.866025403784",
            "-1.0471975512,-0.866025403784",
            "-2.09439510239,-0.866025403784",
    })
    void testSin(double x, double expected) {
        assertEquals(expected, sin.calculate(x), 1e-8);
    }
}
