package com.swt.lab.integration;

import com.swt.lab.MyFunction;
import com.swt.lab.logarithm.Ln;
import com.swt.lab.logarithm.Log;
import com.swt.lab.trigonometry.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.lenient;


@ExtendWith(MockitoExtension.class)
public class Level3 {

    @Mock
    private Sin sin;
    private MyFunction myFunction;


    private double sinValue(double x) {
        if (x == 0.1) return 0.0998334166468;
        if (x == 0.385609) return 0.376123487314;
        if (x == 0.6) return 0.564642473395;
        if (x == 1.1) return 0.891207360061;
        if (x == 2.5933) return 0.521230913131;
        if (x == 5) return -0.958924274663;
        if (x == -0.657984) return -0.611522982782;
        if (x == -3.78322530718) return 0.59850418937;
        if (x == -4.03374530718) return 0.778424852097;
        if (x == -5.73560530718) return 0.520622591069;
        if (x == -5.88811330718) return 0.384874643563;
        if (x == -0.9806) return -0.83083143451;
        if (x == -2.161) return -0.830827346033;
        if (x == -2.40132) return -0.674489232666;
        if (x == -3.43021) return 0.284627032861;
        if (x == -5.28327) return 0.841425222064;
        if (x == -5.99457) return 0.284625077976;

        if (x == Math.PI / 2 + 0.657984) return 0.791226668869;
        if (x == Math.PI / 2 + 3.78322530718) return -0.80111967602;
        if (x == Math.PI / 2 + 4.03374530718) return -0.627737803257;
        if (x == Math.PI / 2 + 5.73560530718) return 0.853786927558;
        if (x == Math.PI / 2 + 5.88811330718) return 0.922968855781;

        if (x == Math.PI / 2 + 0.9806) return 0.55652414811;
        if (x == Math.PI / 2 + 2.161) return -0.556530251723;
        if (x == Math.PI / 2 + 2.40132) return -0.738284684263;
        if (x == Math.PI / 2 + 3.43021) return -0.958638332305;
        if (x == Math.PI / 2 + 5.28327) return 0.540373570481;
        if (x == Math.PI / 2 + 5.99457) return 0.958638912723;
        return 0;
    }


    @BeforeEach
    void init() {
        Cos cos = new Cos(sin);
        Csc csc = new Csc(sin);
        Tan tan = new Tan(sin, cos);
        Cot cot = new Cot(sin, cos);
        Sec sec = new Sec(cos);

        Ln ln = new Ln();
        Log log = new Log(ln);

        myFunction = new MyFunction(sin, cos, tan, cot, sec, csc, ln, log);
    }

    @BeforeEach
    void setupMocks() {
        lenient().when(sin.calculate(anyDouble())).thenAnswer(inv -> sinValue(inv.getArgument(0)));
    }

    @ParameterizedTest
    @CsvSource({
            "0.1,-31.7120885293",
            "0.385609,-21.20726",
            "0.6,-25.4774012018",
            "1.1,107.184397658",
            "2.5933,21.2072551556",
            "5,24.3103953602"
    })
    void testFunctionWithArgumentMoreThanZero(double x, double expected) {
        assertEquals(expected, myFunction.calculate(x), 1e-4);
    }


    @ParameterizedTest
    @CsvSource({
            "-0.657984,-12.8896698752",
            "-3.78322530718,24.4614242027",
            "-4.03374530718,-34.302015048",
            "-5.73560530718,-82.283372223",
            "-5.88811330718,-92.6148138585",
    })
    void testFunctionWithArgumentLessThanZero(double x, double expected) {
        assertEquals(expected, myFunction.calculate(x), 0.02);
    }

    @ParameterizedTest
    @CsvSource({
            "-0.9806,0",
            "-2.161,0",
            "-2.40132,0",
            "-3.43021,0",
            "-5.28327,0",
            "-5.99457,0",
    })
    void testFunctionEqualsZero(double x, double expected) {
        assertEquals(expected, myFunction.calculate(x), 0.02);
    }

    @ParameterizedTest
    @CsvSource({
            "0",
            "1"
    })
    void testBadPoints(double x) {
        assertTrue(Double.isNaN(myFunction.calculate(x)));
    }
}
