package com.swt.lab.trigonometry;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CosTest {
    @ParameterizedTest
    @CsvSource({
            "0",
            "1",
            "2",
    })
    void testCos(double x) {
        Sin sin = Mockito.mock(Sin.class);
        Cos cos = new Cos(sin);

        double expectedArg = Math.PI / 2 - x;
        Mockito.when(sin.calculate(expectedArg)).thenReturn(42.0);

        assertEquals(42.0, cos.calculate(x), 1e-8);
    }
}