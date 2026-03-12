package com.swt.lab.trigonometry;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CosSeriesTest {
    @Test
    void testCos() {
        Sin sinMock = Mockito.mock(Sin.class);
        Cos cos = new CosSeries(sinMock);

        Mockito.when(sinMock.calculate(-Math.PI / 2)).thenReturn(-1.0);

        assertEquals(-1.0, cos.calculate(Math.PI), 1e-10);
    }
}
