package com.swt.lab.integration;

import com.swt.lab.trigonometry.Cos;
import com.swt.lab.trigonometry.Sin;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CosIntegrationTest {
    @ParameterizedTest
    @CsvSource({
            "0,1",
            "1.0471975512,0.5",
            "1.57079633,0",
            "2.09439510239,-0.5",
            "3.14159265,-1",
            "4.18879020479,-0.5",
            "4.71238898038, 0",
            "5.23598775598,0.5",
            "6.28318530718,1"
    })
    void testCos(double x, double expected) {
        Sin sin = new Sin();
        Cos cos = new Cos(sin);

        assertEquals(expected, cos.calculate(x), 1e-8);
    }
}
