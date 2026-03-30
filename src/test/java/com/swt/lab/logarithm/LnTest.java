package com.swt.lab.logarithm;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LnTest {

    @ParameterizedTest
    @CsvSource({
            "0.5,-0.69314718056",
            "1,0",
            "2,0.69314718056",
            "2.71828182846,1",
    })
    void testLnValid(double x, double expected) {
        assertEquals(expected, ln.calculate(x), 1e-8);
    }

    private final Ln ln = new Ln();

    @ParameterizedTest
    @CsvSource({
            "0",
            "-1",
            "-10"
    })
    void testLnInvalid(double x) {
        assertThrows(IllegalArgumentException.class, () -> ln.calculate(x));
    }
}