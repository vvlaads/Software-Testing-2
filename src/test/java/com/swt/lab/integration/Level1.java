package com.swt.lab.integration;

import com.swt.lab.MyFunction;
import com.swt.lab.logarithm.Ln;
import com.swt.lab.logarithm.Log;
import com.swt.lab.trigonometry.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.lenient;


@ExtendWith(MockitoExtension.class)
public class Level1 {

    @Mock
    private Tan tan;

    @Mock
    private Cot cot;

    @Mock
    private Sec sec;

    @Mock
    private Cos cos;

    @Mock
    private Log log;

    @Mock
    private Ln ln;

    @Mock
    private Csc csc;

    @Mock
    private Sin sin;

    @InjectMocks
    private MyFunction myFunction;

    private double tanValue(double x) {
        if (x == 0.1) return 0.100334672085;
        if (x == 0.385609) return 0.405931199897;
        if (x == 0.6) return 0.684136808342;
        if (x == 1.1) return 1.96475965725;
        if (x == 2.5933) return -0.610758532957;
        if (x == 5) return -3.38051500625;
        return 0;
    }

    private double cotValue(double x) {
        if (x == 0.1) return 9.96664442326;
        if (x == 0.385609) return 2.46347164311;
        if (x == 0.6) return 1.46169594708;
        if (x == 1.1) return 0.508968105239;
        if (x == 2.5933) return -1.63730827494;
        if (x == 5) return -0.295812915533;
        return 0;
    }

    private double cscValue(double x) {
        if (x == 0.1) return 10.0166861316;
        if (x == 0.385609) return 2.65870128755;
        if (x == 0.6) return 1.77103219669;
        if (x == 1.1) return 1.12207331853;
        if (x == 2.5933) return 1.91853547978;
        if (x == 5) return -1.04283521277;
        return 0;
    }

    private double secValue(double x) {
        if (x == 0.1) return 1.0050209184;
        if (x == 0.385609) return 1.07924980382;
        if (x == 0.6) return 1.21162831451;
        if (x == 1.1) return 2.20460438872;
        if (x == 2.5933) return -1.17176191506;
        if (x == 5) return 3.52532008582;
        return 0;
    }

    private double sinValue(double x) {
        if (x == 0.1) return 0.0998334166468;
        if (x == 0.385609) return 0.376123487314;
        if (x == 0.6) return 0.564642473395;
        if (x == 1.1) return 0.891207360061;
        if (x == 2.5933) return 0.521230913131;
        if (x == 5) return -0.958924274663;
        return 0;
    }

    private double cosValue(double x) {
        if (x == 0.1) return 0.995004165278;
        if (x == 0.385609) return 0.926569545307;
        if (x == 0.6) return 0.82533561491;
        if (x == 1.1) return 0.453596121426;
        if (x == 2.5933) return -0.853415687222;
        if (x == 5) return 0.283662185463;
        return 0;
    }

    private double lnValue(double x) {
        if (x == 0.1) return -2.30258509299;
        if (x == 0.385609) return -0.952931376269;
        if (x == 0.6) return -0.510825623766;
        if (x == 1.1) return 0.0953101798043;
        if (x == 2.5933) return 0.952931195969;
        if (x == 5) return 1.60943791243;
        return 0;
    }

    private double logValue(double x, int base) {
        switch (base) {
            case 3 -> {
                if (x == 0.1) return -2.09590327429;
                if (x == 0.385609) return -0.867395518964;
                if (x == 0.6) return -0.464973520718;
                if (x == 1.1) return 0.0867550643548;
                if (x == 2.5933) return 0.867395354848;
                if (x == 5) return 1.46497352072;
                return 0;
            }
            case 10 -> {
                if (x == 0.1) return -1;
                if (x == 0.385609) return -0.413852838346;
                if (x == 0.6) return -0.221848749616;
                if (x == 1.1) return 0.0413926851582;
                if (x == 2.5933) return 0.413852760043;
                if (x == 5) return 0.698970004336;
                return 0;
            }
            default -> {
                return lnValue(x);
            }
        }
    }

    @BeforeEach
    void setupMocks() {
        lenient().when(tan.calculate(anyDouble())).thenAnswer(inv -> tanValue(inv.getArgument(0)));
        lenient().when(cot.calculate(anyDouble())).thenAnswer(inv -> cotValue(inv.getArgument(0)));
        lenient().when(sec.calculate(anyDouble())).thenAnswer(inv -> secValue(inv.getArgument(0)));
        lenient().when(csc.calculate(anyDouble())).thenAnswer(inv -> cscValue(inv.getArgument(0)));
        lenient().when(cos.calculate(anyDouble())).thenAnswer(inv -> cosValue(inv.getArgument(0)));
        lenient().when(sin.calculate(anyDouble())).thenAnswer(inv -> sinValue(inv.getArgument(0)));
        lenient().when(log.calculate(anyDouble(), anyInt())).thenAnswer(inv -> logValue(inv.getArgument(0), inv.getArgument(1)));
        lenient().when(ln.calculate(anyDouble())).thenAnswer(inv -> lnValue(inv.getArgument(0)));
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
            "0.1,-31.7120885293",
            "0.385609,-21.20726",
            "0.6,-25.4774012018",
            "1.1,107.184397658",
            "2.5933,21.2072551556",
            "5,24.3103953602"
    })
    void testFunctionWithArgumentLessThanZero(double x, double expected) {
        assertEquals(expected, myFunction.calculate(x), 1e-4);
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
