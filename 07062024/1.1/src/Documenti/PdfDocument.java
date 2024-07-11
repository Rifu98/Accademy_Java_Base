package Documenti;

import util.DocumentType;
import exceptions.*;

public class PdfDocument extends Document {
    private String corpo;
    
    public PdfDocument(String title, String corpo) {
        super(title, DocumentType.PDF);
        this.corpo = corpo;
    }
    
    public String getCorpo() {
        return this.corpo;
    }

    @Override
    public void print() throws PrintException {
        if (corpo == null) {
            throw new PrintException("Il corpo del Pdf è vuoto.");
        }
        System.out.println("Stampo il Pdf");
        System.out.println(corpo);
    }

    @Override
    public void load() throws LoadException {
        System.out.println("Carico il Pdf");
    }

    @Override
    public void save() throws SaveException {
        System.out.println("Salvo il Pdf");
    }
}

// Simile implementazione per SpreadsheetDocument e WordDocument
