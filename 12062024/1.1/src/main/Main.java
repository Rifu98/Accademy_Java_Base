package main;

import java.nio.file.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {
        Path sourceFile = Paths.get("files/source.txt");
        Path destinationFile = Paths.get("files/destination.txt");

        try {
            // Controlla se il file di origine esiste, altrimenti lo crea con del testo di esempio
            if (Files.notExists(sourceFile)) {
                String sampleContent = "Questo è un file di esempio.\nAggiungi il tuo contenuto qui.";
                Files.write(sourceFile, sampleContent.getBytes());
                System.out.println("Il file source.txt non esisteva e quindi è stato creato.");
            }

            // Controlla se il file di destinazione esiste, altrimenti lo crea vuoto
            if (Files.notExists(destinationFile)) {
                Files.createFile(destinationFile);
                System.out.println("Il file destination.txt non esisteva e quindi è stato creato.");
            }

            // Usa InputStream per leggere dal file di origine e OutputStream per scrivere nel file di destinazione
            try (InputStream in = Files.newInputStream(sourceFile);
                 OutputStream out = Files.newOutputStream(destinationFile)) {

                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = in.read(buffer)) != -1) {
                    out.write(buffer, 0, bytesRead);
                }
                System.out.println("File copied successfully.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}