package main;

import documenti.*;
import util.DocumentType;

public class Main {

	public static void main(String[] args) {
		int [][] dati = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		Document [] documenti = {
					new WordDocument("Titolo 1", "Lorem ipsum"),
					new PdfDocument("Titolo 1", "dolor sit amet"),
					new SpreadsheetDocument("Titolo 1", dati)
				};
		
		for(Document documento : documenti) {
			documento.load();
			documento.print();
			DocumentType type = documento.getType();
			
			switch (type) {
				case WORD :
					System.out.println("Modifico il Word");
					
					WordDocument wordDocument = (WordDocument) documento;
					wordDocument.setCorpo("consectetur adipiscing elit");
					
					break;
					
				case SPREADSHEET :
					System.out.println("Modifico il Spreadsheet");
					
					int [][] nuoviDati = {{9,8,7}, {6,5,4}, {3,2,1}};
					SpreadsheetDocument spreadsheetDocument = (SpreadsheetDocument) documento;
					spreadsheetDocument.setDati(nuoviDati);
					
					break;
					
				default:
					System.out.println("Non posso modificare il documento");
			}
			
			documento.print();
			documento.save();
		}
	}

}
