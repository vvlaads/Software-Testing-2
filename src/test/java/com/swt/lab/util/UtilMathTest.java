package com.swt.lab.util;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.swt.lab.util.UtilMath.factorial;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilMathTest {
    @ParameterizedTest
    @CsvSource({
            "0,1",
            "1,1",
            "5,120",
            "10,3628800",
            "20,2432902008176640000",
    })
    public void testFactorial(int x, long expected) {
        assertEquals(expected, factorial(x));
    }
}
