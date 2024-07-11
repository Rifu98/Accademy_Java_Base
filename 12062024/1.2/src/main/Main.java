package main;

import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Path logFile = Paths.get("files/system.log");
        Path errorFile = Paths.get("files/error.log");

        try (BufferedReader reader = Files.newBufferedReader(logFile, StandardCharsets.UTF_8);
             BufferedWriter writer = Files.newBufferedWriter(errorFile, StandardCharsets.UTF_8)) {

            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("ERROR")) {
                    writer.write(line);
                    writer.newLine();
                }
            }
            System.out.println("Error log created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
