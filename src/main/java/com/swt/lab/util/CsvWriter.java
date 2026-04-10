package com.swt.lab.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class CsvWriter {

    public static void write(String filename, Map<Double, Double> data) {
        String path = "src/main/resources/" + filename;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {

            writer.write("x,y\n");

            for (Map.Entry<Double, Double> entry : data.entrySet()) {
                writer.write(entry.getKey() + "," + entry.getValue() + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}