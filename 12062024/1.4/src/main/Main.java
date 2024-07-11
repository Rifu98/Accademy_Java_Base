package main;

import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Path gradesFile = Paths.get("files/grades.txt");
        Path statsFile = Paths.get("files/statistics.txt");

        try {
            List<String> lines = Files.readAllLines(gradesFile, StandardCharsets.UTF_8);
            int count = 0;
            int total = 0;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for (String line : lines) {
                String[] parts = line.split(",");
                int grade = Integer.parseInt(parts[1]);
                total += grade;
                if (grade > max) {
                    max = grade;
                }
                if (grade < min) {
                    min = grade;
                }
                count++;
            }

            double average = count > 0 ? (double) total / count : 0;

            List<String> stats = Arrays.asList(
                    "Media: " + average,
                    "Max: " + max,
                    "Min: " + min
            );

            Files.write(statsFile, stats, StandardCharsets.UTF_8);
            System.out.println("Calcolo avvenuto con successo.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
