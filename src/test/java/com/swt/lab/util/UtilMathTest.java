package com.swt.lab.util;

import org.junit.jupiter.api.Test;

import static com.swt.lab.util.UtilMath.factorial;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilMathTest {
    @Test
    public void testFactorial() {
        assertEquals(1, factorial(0));
        assertEquals(1, factorial(1));
        assertEquals(120, factorial(5));
        assertEquals(3628800, factorial(10));
        assertEquals(2432902008176640000L, factorial(20));
    }
}
