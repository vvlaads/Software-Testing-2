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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
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
        if (x == -0.657984) return -0.772879639732;
        if (x == -3.78322530718) return -0.747084620794;
        if (x == -4.03374530718) return -1.24004775251;
        if (x == -5.73560530718) return 0.609780466606;
        if (x == -5.88811330718) return 0.4169963495;
        if (x == -0.9806) return -1.49289377169;
        if (x == -2.161) return 1.49287005237;
        if (x == -2.40132) return 0.913589631537;
        if (x == -3.43021) return -0.296907627485;
        if (x == -5.28327) return 1.55711764607;
        if (x == -5.99457) return 0.296905408489;
        if (x == -0.1) return -0.100334672085;
        if (x == -0.8) return -1.02963855705;
        if (x == -1) return -1.55740772465;
        if (x == -2.3) return 1.11921364173;
        if (x == -3) return 0.142546543074;
        if (x == -3.6) return -0.493466729985;
        if (x == -4) return -1.15782128235;
        if (x == -5) return 3.38051500625;
        if (x == -5.5) return 0.995584052214;
        if (x == -5.9) return 0.403110899873;
        if (x == -6.1) return 0.185262230689;
        return 0;
    }

    private double cotValue(double x) {
        if (x == 0.1) return 9.96664442326;
        if (x == 0.385609) return 2.46347164311;
        if (x == 0.6) return 1.46169594708;
        if (x == 1.1) return 0.508968105239;
        if (x == 2.5933) return -1.63730827494;
        if (x == 5) return -0.295812915533;
        if (x == -0.657984) return -1.29386252217;
        if (x == -3.78322530718) return -1.33853645513;
        if (x == -4.03374530718) return -0.806420557574;
        if (x == -5.73560530718) return 1.63993445964;
        if (x == -5.88811330718) return 2.39810252823;
        if (x == -0.9806) return -0.669840024093;
        if (x == -2.161) return 0.669850666785;
        if (x == -2.40132) return 1.09458335064;
        if (x == -3.43021) return -3.36805089337;
        if (x == -5.28327) return 0.642212232664;
        if (x == -5.99457) return 3.36807606533;
        if (x == -0.1) return -9.96664442326;
        if (x == -0.8) return -0.97121460065;
        if (x == -1) return -0.642092615934;
        if (x == -2.3) return 0.893484463297;
        if (x == -3) return 7.01525255143;
        if (x == -3.6) return -2.02647906989;
        if (x == -4) return -0.863691154451;
        if (x == -5) return 0.295812915533;
        if (x == -5.5) return 1.00443553488;
        if (x == -5.9) return 2.48070692287;
        if (x == -6.1) return 5.39775428742;
        return 0;
    }

    private double cscValue(double x) {
        if (x == 0.1) return 10.0166861316;
        if (x == 0.385609) return 2.65870128755;
        if (x == 0.6) return 1.77103219669;
        if (x == 1.1) return 1.12207331853;
        if (x == 2.5933) return 1.91853547978;
        if (x == 5) return -1.04283521277;
        if (x == -0.657984) return -1.63526151617;
        if (x == -3.78322530718) return 1.67083208064;
        if (x == -4.03374530718) return 1.28464552141;
        if (x == -5.73560530718) return 1.92077719476;
        if (x == -5.88811330718) return 2.59824859009;
        if (x == -0.9806) return -1.20361358329;
        if (x == -2.161) return -1.20361950624;
        if (x == -2.40132) return -1.48260335609;
        if (x == -3.43021) return 3.5133697244;
        if (x == -5.28327) return 1.18845973924;
        if (x == -5.99457) return 3.51339385522;
        if (x == -0.1) return -10.0166861316;
        if (x == -0.8) return -1.39400781939;
        if (x == -1) return -1.18839510578;
        if (x == -2.3) return -1.34101248546;
        if (x == -3) return -7.08616739574;
        if (x == -3.6) return 2.25978260474;
        if (x == -4) return 1.32134870881;
        if (x == -5) return 1.04283521277;
        if (x == -5.5) return 1.41735342936;
        if (x == -5.9) return 2.67467882879;
        if (x == -6.1) return 5.48960393356;
        return 0;
    }

    private double secValue(double x) {
        if (x == 0.1) return 1.0050209184;
        if (x == 0.385609) return 1.07924980382;
        if (x == 0.6) return 1.21162831451;
        if (x == 1.1) return 2.20460438872;
        if (x == 2.5933) return -1.17176191506;
        if (x == 5) return 3.52532008582;
        if (x == -0.657984) return 1.26386033149;
        if (x == -3.78322530718) return -1.24825295138;
        if (x == -4.03374530718) return -1.5930217916;
        if (x == -5.73560530718) return 1.17125241407;
        if (x == -5.88811330718) return 1.08346017716;
        if (x == -0.9806) return 1.79686722202;
        if (x == -2.161) return -1.7968475153;
        if (x == -2.40132) return -1.35449105381;
        if (x == -3.43021) return -1.04314626935;
        if (x == -5.28327) return 1.8505716316;
        if (x == -5.99457) return 1.04314563777;
        if (x == -0.1) return 1.0050209184;
        if (x == -0.8) return 1.43532419967;
        if (x == -1) return 1.85081571768;
        if (x == -2.3) return -1.50087946746;
        if (x == -3) return -1.01010866591;
        if (x == -3.6) return -1.11512753244;
        if (x == -4) return -1.52988565647;
        if (x == -5) return 3.52532008582;
        if (x == -5.5) return 1.41109447062;
        if (x == -5.9) return 1.07819218955;
        if (x == -6.1) return 1.01701627033;
        return 0;
    }

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
        if (x == -0.1) return -0.0998334166468;
        if (x == -0.8) return -0.7173560909;
        if (x == -1) return -0.841470984808;
        if (x == -2.3) return -0.745705212177;
        if (x == -3) return -0.14112000806;
        if (x == -3.6) return 0.442520443295;
        if (x == -4) return 0.756802495308;
        if (x == -5) return 0.958924274663;
        if (x == -5.5) return 0.70554032557;
        if (x == -5.9) return 0.37387666483;
        if (x == -6.1) return 0.182162504272;
        return 0;
    }

    private double cosValue(double x) {
        if (x == 0.1) return 0.995004165278;
        if (x == 0.385609) return 0.926569545307;
        if (x == 0.6) return 0.82533561491;
        if (x == 1.1) return 0.453596121426;
        if (x == 2.5933) return -0.853415687222;
        if (x == 5) return 0.283662185463;
        if (x == -0.657984) return 0.791226668869;
        if (x == -3.78322530718) return -0.80111967602;
        if (x == -4.03374530718) return -0.627737803257;
        if (x == -5.73560530718) return 0.853786927558;
        if (x == -5.88811330718) return 0.922968855781;
        if (x == -0.9806) return 0.55652414811;
        if (x == -2.161) return -0.556530251723;
        if (x == -2.40132) return -0.738284684263;
        if (x == -3.43021) return -0.958638332305;
        if (x == -5.28327) return 0.540373570481;
        if (x == -5.99457) return 0.958638912723;
        if (x == -0.1) return 0.995004165278;
        if (x == -0.8) return 0.696706709347;
        if (x == -1) return 0.540302305868;
        if (x == -2.3) return -0.66627602128;
        if (x == -3) return -0.9899924966;
        if (x == -3.6) return -0.896758416334;
        if (x == -4) return -0.653643620864;
        if (x == -5) return 0.283662185463;
        if (x == -5.5) return 0.708669774291;
        if (x == -5.9) return 0.927478430744;
        if (x == -6.1) return 0.983268438443;
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
            "-0.657984,-12.8896698752",
            "-3.78322530718,24.4614242027",
            "-4.03374530718,-34.302015048",
            "-5.73560530718,-82.283372223",
            "-5.88811330718,-92.6148138585",
    })
    void testFunctionWithArgumentLessThanZeroCriticalDots(double x, double expected) {
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
            "-0.1,-117523.787527",
            "-0.8,76.2884706465",
            "-1,-3.06167483972",
            "-2.3,11.9749682942",
            "-3,20028.46497",
            "-3.6,42.2094142076",
            "-4,-37.6743880901",
            "-5,-1968.97001753",
            "-5.5,-4117.41459043",
            "-5.9,-92.2553675771",
            "-6.1,2450.10584251",
    })
    void testFunctionWithArgumentLessThanZeroBetweenCriticalDots(double x, double expected) {
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
