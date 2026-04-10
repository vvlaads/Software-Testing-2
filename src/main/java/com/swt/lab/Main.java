package com.swt.lab;

import com.swt.lab.logarithm.Ln;
import com.swt.lab.logarithm.Log;
import com.swt.lab.trigonometry.*;
import com.swt.lab.util.PointGenerator;

import com.swt.lab.util.CsvWriter;

public class Main {
    public static void main(String[] args) {
        Sin sin = new Sin();
        Cos cos = new Cos(sin);
        Csc csc = new Csc(sin);
        Tan tan = new Tan(sin, cos);
        Cot cot = new Cot(sin, cos);
        Sec sec = new Sec(cos);

        Ln ln = new Ln();
        Log log = new Log(ln);

        MyFunction myFunction = new MyFunction(sin, cos, tan, cot, sec, csc, ln, log);

        PointGenerator generator = new PointGenerator();

        CsvWriter.write("sin.csv", generator.generate(-5, 5, 0.1, sin));
        CsvWriter.write("cos.csv", generator.generate(-5, 5, 0.1, cos));
        CsvWriter.write("tan.csv", generator.generate(-5, 5, 0.1, tan));
        CsvWriter.write("cot.csv", generator.generate(-5, 5, 0.1, cot));
        CsvWriter.write("csc.csv", generator.generate(-5, 5, 0.1, csc));
        CsvWriter.write("sec.csv", generator.generate(-5, 5, 0.1, sec));
        CsvWriter.write("ln.csv", generator.generate(0.1, 5, 0.1, ln));

        log.setBase(10);
        CsvWriter.write("log10.csv", generator.generate(0.1, 5, 0.1, log));
        CsvWriter.write("my_function.csv", generator.generate(-5, 5, 0.01, myFunction));
    }
}
