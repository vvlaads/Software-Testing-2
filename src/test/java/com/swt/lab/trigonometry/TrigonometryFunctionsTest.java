package com.swt.lab.trigonometry;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrigonometryFunctionsTest {
    @Test
    void testTan() {
        Sin sinMock = Mockito.mock(Sin.class);
        Cos cosMock = Mockito.mock(Cos.class);

        Mockito.when(sinMock.calculate(Math.PI / 4)).thenReturn(Math.sqrt(2) / 2);
        Mockito.when(cosMock.calculate(Math.PI / 4)).thenReturn(Math.sqrt(2) / 2);

        TrigonometryFunctions trig = new TrigonometryFunctions(sinMock, cosMock);

        assertEquals(1.0, trig.tan(Math.PI / 4), 1e-10);
    }
}
